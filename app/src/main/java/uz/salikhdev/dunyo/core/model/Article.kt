package uz.salikhdev.dunyo.core.model


import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    val author: String, // Reuters
    @SerializedName("content")
    val content: String, // Wiz has ended talks with Google parent Alphabet on a proposed $23 billion deal in which the Israeli cybersecurity startup would have become the US tech giants largest-ever acquisition, according to a… [+2184 chars]
    @SerializedName("description")
    val description: String, // Wiz has ended talks with Google parent Alphabet on a proposed $23 billion deal in which the Israeli cybersecurity startup would have become the US tech giant’s largest-ever acquisition, according to a Wiz memo seen by CNN.
    @SerializedName("publishedAt")
    val publishedAt: String, // 2024-07-23T14:11:00Z
    @SerializedName("source")
    val source: Source,
    @SerializedName("title")
    val title: String, // Palestinian factions agree to form unity government - Reuters
    @SerializedName("url")
    val url: String, // https://news.google.com/rss/articles/CBMiZmh0dHBzOi8vd3d3LnJldXRlcnMuY29tL3dvcmxkL2hhbWFzLWZhdGFoLW1lZXQtd2l0aC1tZWRpYS1jaGluYS1hZnRlci1yZWNvbmNpbGlhdGlvbi10YWxrcy0yMDI0LTA3LTIzL9IBAA?oc=5
    @SerializedName("urlToImage")
    val urlToImage: String // https://media.cnn.com/api/v1/images/stellar/prod/gettyimages-2161651903.jpg?c=16x9&q=w_800,c_fill
)