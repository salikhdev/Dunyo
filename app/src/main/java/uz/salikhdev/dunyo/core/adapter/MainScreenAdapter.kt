package uz.salikhdev.dunyo.core.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.salikhdev.dunyo.ui.main.category.CategoryPage
import uz.salikhdev.dunyo.ui.main.home.HomePage
import uz.salikhdev.dunyo.ui.main.save.SavePage

class MainScreenAdapter(fm: FragmentManager, lc: Lifecycle) : FragmentStateAdapter(fm, lc) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomePage()
            1 -> CategoryPage()
            else -> SavePage()
        }
    }
}