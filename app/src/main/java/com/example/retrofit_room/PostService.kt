package com.example.retrofit_room

import android.database.Observable
import retrofit2.http.GET

interface PostService {

    @GET("posts")
    fun getAllPosts(): Observable<List<PostResponse>>

}