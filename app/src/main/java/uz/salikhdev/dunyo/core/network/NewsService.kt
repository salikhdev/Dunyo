package uz.salikhdev.dunyo.core.network

import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.salikhdev.dunyo.core.model.NewsResponse

interface NewsService {

    @GET("/v2/top-headlines")
    fun getTopNews(
        @Query("apiKey") apiKey: String,
        @Query("country") country: String,
        @Query("pageSize") size:Int
    ): Single<Response<NewsResponse>>

    @GET("/v2/everything")
    fun getEverythingNews(
        @Query("apiKey") apiKey: String,
        @Query("q") theme: String,
        @Query("pageSize") size:Int
    ): Single<Response<NewsResponse>>


}