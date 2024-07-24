package uz.salikhdev.dunyo.ui.main.home

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isGone
import androidx.core.view.isVisible
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.adapter.EverythingAdapter
import uz.salikhdev.dunyo.core.adapter.TopAdapter
import uz.salikhdev.dunyo.core.base.BaseFragment
import uz.salikhdev.dunyo.core.model.NewsResponse
import uz.salikhdev.dunyo.databinding.PageHomeBinding

class HomePage : BaseFragment(R.layout.page_home), HomeMVP.View {

    private val binding by viewBinding(PageHomeBinding::bind)
    private var presenter: HomeMVP.Presenter? = null
    private val adapterTop by lazy { TopAdapter() }
    private val adapterEverything by lazy { EverythingAdapter() }
    private var one: Boolean = false
    private var two: Boolean = false

    override fun onCreate(view: View, savedInstanceState: Bundle?) {
        presenter = HomePresenter(this)
        presenter?.getTopNews("us")
        presenter?.getEverythingNews("tesla")
        binding.shimmerLayout.startShimmer()
        setAdapter()
    }

    private fun setAdapter() {
        binding.recyclerViewTop.adapter = adapterTop
        binding.recyclerViewBottom.adapter = adapterEverything
    }


    override fun setTopData(news: NewsResponse) {
        adapterTop.setData(news.articles)
        one = true
        shimmerHide()
    }

    override fun setEverythingData(news: NewsResponse) {
        adapterEverything.setData(news.articles)
        two = true
        shimmerHide()
    }

    fun shimmerHide() {
        if (one && two) {
            binding.shimmerLayout.hideShimmer()
            binding.shimmerLayout.isGone = true
            binding.nestetView.isVisible = true
        }
    }

    override fun setError(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}