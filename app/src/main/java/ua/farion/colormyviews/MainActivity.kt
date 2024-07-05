package ua.farion.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import ua.farion.colormyviews.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(
            binding.boxOneText,
            binding.boxTwoText,
            binding.boxThreeText,
            binding.boxFourText,
            binding.boxFiveText,
            binding.constraintLayout
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view) {
                binding.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
                binding.boxTwoText -> view.setBackgroundColor(Color.GRAY)
                binding.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
                binding.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
                binding.boxFiveText -> view.setBackgroundResource(android.R.color.holo_purple)
                else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
