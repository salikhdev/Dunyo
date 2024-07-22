package uz.salikhdev.dunyo.ui.splash

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.base.BaseFragment
import uz.salikhdev.dunyo.core.utils.SetItemStatusBarColor
import uz.salikhdev.dunyo.databinding.ScreenSplashBinding

class SplashScreen : BaseFragment(R.layout.screen_splash) {

    private val binding by viewBinding(ScreenSplashBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {


        lifecycleScope.launch {
            delay(2000)
            findNavController().navigate(SplashScreenDirections.actionSplashScreenToMainScreen())
        }

    }

}