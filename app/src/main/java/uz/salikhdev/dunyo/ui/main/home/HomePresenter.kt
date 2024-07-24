package uz.salikhdev.dunyo.ui.main.home

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.SingleObserver
import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Response
import uz.salikhdev.dunyo.core.model.NewsResponse
import uz.salikhdev.dunyo.core.network.AppClient
import uz.salikhdev.dunyo.core.utils.API_KEY

class HomePresenter(val view: HomeMVP.View) : HomeMVP.Presenter {

    val service = AppClient.createNewsService()

    override fun getTopNews(country: String) {

        service.getTopNews(apiKey = API_KEY, country = country , 10)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<Response<NewsResponse>> {
                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {
                    view.setError("INTERNET_ERROR")
                }

                override fun onSuccess(t: Response<NewsResponse>) {
                    if (t.isSuccessful) {
                        t.body()?.let {
                            view.setTopData(it)
                        }
                    } else {
                        view.setError(message = t.code().toString())
                    }
                }
            })

    }

    override fun getEverythingNews(theme: String) {

        service.getEverythingNews(apiKey = API_KEY, theme = theme , size = 20)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<Response<NewsResponse>> {
                override fun onSubscribe(d: Disposable) {
                }

                override fun onError(e: Throwable) {
                    view.setError("INTERNET_ERROR")
                }

                override fun onSuccess(t: Response<NewsResponse>) {

                    if (t.isSuccessful) {
                        t.body()?.let {
                            view.setEverythingData(it)
                        }
                    } else {
                        view.setError(t.code().toString())
                    }

                }
            })

    }
}