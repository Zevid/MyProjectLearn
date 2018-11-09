package com.example.mycomputer.myapplication.pe.service;

import com.example.mycomputer.myapplication.pe.entity.Movie;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("top250")
    Observable<Movie> getTopMovie(@Query("start") int start,@Query("count") int count);

}
