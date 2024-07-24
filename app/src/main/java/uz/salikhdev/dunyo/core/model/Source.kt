package uz.salikhdev.dunyo.core.model


import com.google.gson.annotations.SerializedName

data class Source(
    @SerializedName("id")
    val id: String, // google-news
    @SerializedName("name")
    val name: String // Google News
)