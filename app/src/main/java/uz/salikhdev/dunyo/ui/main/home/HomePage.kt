package uz.salikhdev.dunyo.ui.main.home

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.base.BaseFragment
import uz.salikhdev.dunyo.databinding.PageHomeBinding

class HomePage : BaseFragment(R.layout.page_home) {

    private val binding by viewBinding(PageHomeBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {



    }

}