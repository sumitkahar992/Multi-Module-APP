package com.example.news_presentation

import com.example.common_utils.common_utils.Resource
import com.example.news_domain.model.Article


data class NewsState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val data: <List<Article>? = null

)
