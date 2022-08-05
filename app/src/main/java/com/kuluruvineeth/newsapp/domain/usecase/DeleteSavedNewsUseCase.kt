package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(
    private val newsRepository: NewsRepository
) {
}