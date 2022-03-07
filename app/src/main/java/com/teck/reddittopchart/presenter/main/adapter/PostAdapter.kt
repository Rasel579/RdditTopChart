package com.teck.reddittopchart.presenter.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.teck.reddittopchart.databinding.ItemPostBinding

class PostAdapter : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder =
        PostViewHolder(
            ItemPostBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class PostViewHolder(
        private val viewBinding: ItemPostBinding
    ) : RecyclerView.ViewHolder(viewBinding.root){

    }
}