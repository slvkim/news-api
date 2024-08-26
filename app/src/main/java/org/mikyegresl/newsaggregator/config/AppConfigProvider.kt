package org.mikyegresl.newsaggregator.config

import org.mikyegresl.data.network.config.NetworkConfigProvider
import org.mikyegresl.newsaggregator.BuildConfig

class AppConfigProvider : NetworkConfigProvider {

    override val baseUrl: String = BuildConfig.NEWS_API_URL
    override val apiKey: String = BuildConfig.NEWS_API_KEY
    override val isDebug: Boolean = BuildConfig.DEBUG
}