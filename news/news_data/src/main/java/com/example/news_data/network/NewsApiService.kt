package com.example.news_data.network

import com.example.common_utils.common_utils.Constants
import com.example.news_data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    //https://newsapi.org/v2/everything?q=tesla&from=2022-09-20&sortBy=publishedAt&apiKey=2671fd27a2834fc1a0671903c9213771

    @GET("everything")
    suspend fun getNewsArticles(
        @Query("q") q : String = Constants.Q,
        @Query("from") from : String = Constants.FROM,
        @Query("sortBy") sortBy : String = Constants.SORTBY,
        @Query("apiKey") apiKey : String = Constants.API_KEY
    ): NewsResponse





}