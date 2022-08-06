package com.kuluruvineeth.newsapp.domain.repository

import com.kuluruvineeth.newsapp.data.model.APIResponse
import com.kuluruvineeth.newsapp.data.model.Article
import com.kuluruvineeth.newsapp.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadlines(country:String,page:Int):Resource<APIResponse>
    suspend fun getSearchedNews(searchQuery:String):Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>
}