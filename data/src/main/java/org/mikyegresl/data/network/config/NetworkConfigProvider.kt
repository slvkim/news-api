package org.mikyegresl.data.network.config

interface NetworkConfigProvider {
    val baseUrl: String
    val apiKey: String
    val isDebug: Boolean
}