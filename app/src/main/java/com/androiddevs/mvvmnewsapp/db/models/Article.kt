package com.androiddevs.mvvmnewsapp.db.models

import androidx.room.Entity
import androidx.room.PrimaryKey

//Entity says that it is a table in our database
//Created a table with the following columns
@Entity(
    tableName = "articles"
)
data class Article(

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
)