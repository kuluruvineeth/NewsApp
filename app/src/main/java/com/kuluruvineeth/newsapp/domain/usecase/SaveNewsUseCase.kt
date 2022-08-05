package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.data.model.Article
import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class SaveNewsUseCase(
    private val newsRepository: NewsRepository
) {
    suspend fun execute(article: Article){
        return newsRepository.saveNews(article)
    }
}