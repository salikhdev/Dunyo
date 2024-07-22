package uz.salikhdev.dunyo.ui.main.save

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.salikhdev.dunyo.R
import uz.salikhdev.dunyo.core.base.BaseFragment
import uz.salikhdev.dunyo.databinding.PageSaveBinding

class SavePage : BaseFragment(R.layout.page_save) {

    private val binding by viewBinding(PageSaveBinding::bind)

    override fun onCreate(view: View, savedInstanceState: Bundle?) {

    }

}