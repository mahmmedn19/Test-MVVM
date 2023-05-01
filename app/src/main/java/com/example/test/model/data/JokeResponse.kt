package com.example.test.model.data


import com.google.gson.annotations.SerializedName

data class JokeResponse(
    @SerializedName("category")
    val category: String? = null,
    @SerializedName("delivery")
    val delivery: String? = null,
    @SerializedName("error")
    val error: Boolean? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("lang")
    val lang: String? = null,
    @SerializedName("safe")
    val safe: Boolean? = null,
    @SerializedName("setup")
    val setup: String? = null,
    @SerializedName("type")
    val type: String? = null,
    @SerializedName("joke")
    val joke: String? = null
)