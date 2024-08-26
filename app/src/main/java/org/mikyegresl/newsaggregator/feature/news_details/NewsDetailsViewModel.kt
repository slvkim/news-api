package org.mikyegresl.newsaggregator.feature.news_details

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import org.mikyegresl.domain.business.news.NewsRepository
import javax.inject.Inject

@HiltViewModel
internal class NewsDetailsViewModel @Inject constructor(
    private val repository: NewsRepository,
) : ViewModel() {




}