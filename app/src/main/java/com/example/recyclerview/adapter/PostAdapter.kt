package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.data.model.Post
import com.example.recyclerview.databinding.PostItemBinding

class PostAdapter(
    var postList: List<Post>
): RecyclerView.Adapter<PostAdapter.MyViewHolder>() {

    // O método cria a visualização de cada item da lista quando ela precisa ser exibida na tela
    // Esse método não preenche os dados no item. Ele apenas infla o layout do XML que representa cada item
    override fun onCreateViewHolder(
        parent: ViewGroup, // Item visual da lista
        viewType: Int // Posição do item na lista
    ): MyViewHolder {
        val view = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        // item visual criado
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder, // item visual da lista
        position: Int // posicao do item visual na lista
    ) {
        val post = postList[position]
        holder.binding.txtTitle.text = post.description
    }

    override fun getItemCount() = postList.size

    inner class MyViewHolder(val binding: PostItemBinding): RecyclerView.ViewHolder(binding.root)
}