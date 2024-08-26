package org.mikyegresl.newsaggregator.feature.news_list

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import org.mikyegresl.domain.business.news.NewsRepository
import javax.inject.Inject

@HiltViewModel
internal class NewsListViewModel @Inject constructor(
    private val repository: NewsRepository
) : ViewModel() {

    private val _newsListState = MutableStateFlow(NewsListState.defaultState())
    val newsListState: StateFlow<NewsListState> = _newsListState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.observeNews().distinctUntilChanged().collect {
                val uiModel = it.map { it.toUiModel() }
                _newsListState.update { it.copy(news = it.news + uiModel) }
            }
        }
    }

    fun fetchData() {
        viewModelScope.launch {
            try {
                repository.fetchNews()
            } catch (e: Exception) {
                _newsListState.update { it.copy(errorMessage = e.message) }
            }
        }
    }
}