package uz.salikhdev.dunyo.ui.main

import android.graphics.Color
import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.adapter.MainScreenAdapter
import uz.salikhdev.dunyo.core.base.BaseFragment
import uz.salikhdev.dunyo.core.utils.SetItemStatusBarColor
import uz.salikhdev.dunyo.databinding.ScreenMainBinding

class MainScreen : BaseFragment(R.layout.screen_main) {

    private val binding by viewBinding(ScreenMainBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {
        SetItemStatusBarColor(Color.parseColor("#ffffff"), true)

        val adapter = MainScreenAdapter(childFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        binding.viewPager.isUserInputEnabled = false

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home_menu -> binding.viewPager.setCurrentItem(0 , false)
                R.id.category_menu -> binding.viewPager.setCurrentItem(1 , false)
                R.id.save_menu -> binding.viewPager.setCurrentItem(2 , false)
            }

            true
        }


    }

}