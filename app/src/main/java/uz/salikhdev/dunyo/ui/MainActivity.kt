package uz.salikhdev.dunyo.ui

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.utils.SetItemStatusBarColor

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SetItemStatusBarColor(Color.parseColor("#475AD7"), false)
    }

}