package com.kuluruvineeth.newsapp.data.repository.dataSourceImpl

import com.kuluruvineeth.newsapp.data.api.NewsAPIService
import com.kuluruvineeth.newsapp.data.model.APIResponse
import com.kuluruvineeth.newsapp.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country:String,
    private val page:Int
):NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country,page)
    }
}