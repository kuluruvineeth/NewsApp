package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.data.model.APIResponse
import com.kuluruvineeth.newsapp.data.util.Resource
import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(
    private val newsRepository: NewsRepository
) {
    suspend fun execute(searchQuery: String):Resource<APIResponse>{
        return newsRepository.getSearchedNews(searchQuery)
    }
}