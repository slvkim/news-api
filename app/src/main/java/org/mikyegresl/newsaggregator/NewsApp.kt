package org.mikyegresl.newsaggregator

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
internal class NewsApp: Application() {

    override fun onCreate() {
        super.onCreate()
    }
}