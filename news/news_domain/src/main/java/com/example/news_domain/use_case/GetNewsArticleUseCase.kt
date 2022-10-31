package com.example.news_domain.use_case

import com.example.common_utils.common_utils.Resource
import com.example.news_domain.model.Article
import com.example.news_domain.repository.NewsRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class GetNewsArticleUseCase(
    private val newsRepository: NewsRepository,
) {


        operator fun invoke(): Flow<Resource<List<Article>>> = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = newsRepository.getNewsArticle()))
        }catch (e: Exception){
            emit(Resource.Error(message = e.message.toString()))
        }
    }


}