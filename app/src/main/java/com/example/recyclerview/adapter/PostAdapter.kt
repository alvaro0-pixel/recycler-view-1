package com.example.recyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.data.model.Post
import com.example.recyclerview.databinding.PostItemBinding

class PostAdapter(
    var postList: List<Post>
) {
    inner class MyViewHolder(val binding: PostItemBinding): RecyclerView.ViewHolder(binding.root)
}