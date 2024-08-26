package org.mikyegresl.data.network.common

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializable(with = StatusSerializer::class)
enum class NetworkStatusDto {
    OK,
    ERROR;
}


object StatusSerializer : KSerializer<NetworkStatusDto> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("status", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): NetworkStatusDto =
        when (decoder.decodeString()) {
            "ok" -> NetworkStatusDto.OK
            "error" -> NetworkStatusDto.ERROR
            else -> NetworkStatusDto.ERROR
        }

    override fun serialize(encoder: Encoder, value: NetworkStatusDto) =
        encoder.encodeString(
            when (value) {
                NetworkStatusDto.OK -> "ok"
                NetworkStatusDto.ERROR -> "error"
            }
        )
}