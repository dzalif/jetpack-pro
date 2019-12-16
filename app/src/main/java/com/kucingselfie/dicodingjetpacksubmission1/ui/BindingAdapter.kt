package com.kucingselfie.dicodingjetpacksubmission1.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kucingselfie.dicodingjetpacksubmission1.model.Movie
import com.kucingselfie.dicodingjetpacksubmission1.model.TVShow
import com.kucingselfie.dicodingjetpacksubmission1.ui.movie.list.MovieAdapter
import com.kucingselfie.dicodingjetpacksubmission1.ui.tvshow.TVShowAdapter

@BindingAdapter(    "listMovie")
fun listMovie(recyclerView: RecyclerView, data: List<Movie>?) {
    val adapter = recyclerView.adapter as MovieAdapter
    adapter.submitList(data)
}

@BindingAdapter("listTvShow")
fun listTvShow(recyclerView: RecyclerView, data: List<TVShow>?) {
    val adapter = recyclerView.adapter as TVShowAdapter
    adapter.submitList(data)
}

@BindingAdapter("bindImage")
fun bindImage(imgView: ImageView, imgUrl: Int) {
    Glide.with(imgView.context)
        .load(imgUrl)
        .into(imgView)
}
