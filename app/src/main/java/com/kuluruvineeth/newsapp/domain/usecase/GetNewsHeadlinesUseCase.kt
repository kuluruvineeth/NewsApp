package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.data.model.APIResponse
import com.kuluruvineeth.newsapp.data.util.Resource
import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(
    private val newsRepository: NewsRepository
) {
    suspend fun execute(country:String,page:Int):Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}