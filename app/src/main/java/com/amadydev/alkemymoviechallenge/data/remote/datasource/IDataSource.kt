package com.amadydev.alkemymoviechallenge.data.remote.datasource

import com.amadydev.alkemymoviechallenge.data.remote.dto.MoviesDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IDataSource {
    @GET("movie/popular?")
    suspend fun fetchPopularMovies(@Query("api_key") api_key: String,  @Query("page") page: Int): Response<MoviesDTO>

    @GET("search/movie?")
    suspend fun fetchMovieByName(@Query("api_key") api_key: String, @Query("query") query: String, @Query("page") page: Int): Response<MoviesDTO>
}