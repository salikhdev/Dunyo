package uz.salikhdev.dunyo.ui.main.category

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.base.BaseFragment
import uz.salikhdev.dunyo.databinding.PageCateogryBinding

class CategoryPage : BaseFragment(R.layout.page_cateogry) {

    private val binding by viewBinding(PageCateogryBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }


}