package com.kuluruvineeth.newsapp.domain.usecase

import com.kuluruvineeth.newsapp.domain.repository.NewsRepository

class SaveNewsUseCase(
    private val newsRepository: NewsRepository
) {
}