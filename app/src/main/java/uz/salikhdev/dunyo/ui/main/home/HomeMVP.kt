package uz.salikhdev.dunyo.ui.main.home

import uz.salikhdev.dunyo.core.model.NewsResponse

interface HomeMVP {
    interface View {
        fun setTopData(news: NewsResponse)
        fun setEverythingData(news: NewsResponse)
        fun setError(message: String)
    }

    interface Presenter {
        fun getTopNews(country: String)
        fun getEverythingNews(theme: String)
    }

}