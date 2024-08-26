package org.mikyegresl.data.network.common

import org.mikyegresl.data.network.news.ApiResponse

sealed interface ApiResult<T> {
    class Error<T>(
        val message: String? = null
    ) : ApiResult<T>

    class Success<T>(
        val data: List<T>
    ) : ApiResult<T>
}

inline fun <T: Any>ApiResult<T>.fold(
    onError: (errorMessage: String?) -> Unit,
    onSuccess: (data: List<T>) -> Unit,
) {
    when (this) {
        is ApiResult.Error -> {
            onError.invoke(this.message)
        }
        is ApiResult.Success -> onSuccess.invoke(this.data)
    }
}

inline fun <T>processNetworkRequest(
    networkRequest: () -> ApiResponse<T>
): ApiResult<T> =
    try {
        val result = networkRequest.invoke()
        when (result.statusDto) {
            NetworkStatusDto.OK -> ApiResult.Success(result.data ?: emptyList())
            NetworkStatusDto.ERROR -> ApiResult.Error(result.errorMessage)
            else -> ApiResult.Error()
        }
        //TODO: here it is always fall in catch even if there is code & error in body.
        //This can be fixed customizing parsing logic and dealing with Retrofit responses.
    } catch (e: Exception) { ApiResult.Error(e.message) }