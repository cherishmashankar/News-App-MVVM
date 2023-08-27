package com.androiddevs.mvvmnewsapp.db.models

import com.androiddevs.mvvmnewsapp.db.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)