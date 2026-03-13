package com.example.recyclerview.data.model
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Post(
    val id: String,
    val description: String
): Parcelable
