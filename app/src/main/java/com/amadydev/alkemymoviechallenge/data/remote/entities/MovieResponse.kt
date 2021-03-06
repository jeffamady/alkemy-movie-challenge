package com.amadydev.alkemymoviechallenge.data.remote.entities

import com.amadydev.alkemymoviechallenge.domain.entities.Movie
import com.google.gson.annotations.SerializedName


data class MovieResponse (
    @SerializedName("page") val page:Int,
    @SerializedName("results") val movies:List<Movie>,
    @SerializedName("total_pages") val totalPages:Int,
    @SerializedName("total_results") val totalResult:Int
)