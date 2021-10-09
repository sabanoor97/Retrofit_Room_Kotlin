package com.example.retrofit_room

import com.google.gson.annotations.SerializedName

class PostResponse {
    @SerializedName("postArr")
    var postArr = ArrayList<Post>()
}
