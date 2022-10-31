package com.example.news_presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.news_domain.use_case.GetNewsArticleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase) :
    ViewModel() {

    private val _newsArticle = MutableStateFlow(NewsState())
    val newsArticle: StateFlow<NewsState> = _newsArticle

    init {
        getNewsArticles()
    }



    private fun getNewsArticles(){}


}