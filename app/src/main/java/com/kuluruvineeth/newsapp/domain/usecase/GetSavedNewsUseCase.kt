package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.data.model.Article
import com.kuluruvineeth.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(
    private val newsRepository: NewsRepository
) {
    fun execute():Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}