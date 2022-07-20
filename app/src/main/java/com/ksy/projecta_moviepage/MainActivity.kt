package com.ksy.projecta_moviepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.LinearLayout
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import com.ksy.projecta_moviepage.R
import com.ksy.projecta_moviepage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.movieInfo.good.setOnClickListener {
            if (binding.movieInfo.badSelected.isVisible) {
                binding.movieInfo.badSelected.visibility = INVISIBLE
                val badNumberText = binding.movieInfo.badNumber.text
                binding.movieInfo.badNumber.text= (badNumberText.toString().toInt() - 1).toString()
            } else {
                binding.movieInfo.goodSelected.visibility = VISIBLE
                val goodNumberText = binding.movieInfo.goodNumber.text
                binding.movieInfo.goodNumber.text= (goodNumberText.toString().toInt() + 1).toString()
            }
        }

        binding.movieInfo.bad.setOnClickListener {
            if (binding.movieInfo.goodSelected.isVisible) {
                binding.movieInfo.goodSelected.visibility = INVISIBLE
                val goodNumberText = binding.movieInfo.goodNumber.text
                binding.movieInfo.goodNumber.text= (goodNumberText.toString().toInt() - 1).toString()
            } else {
                binding.movieInfo.badSelected.visibility = VISIBLE
                val badNumberText = binding.movieInfo.badNumber.text
                binding.movieInfo.badNumber.text= (badNumberText.toString().toInt() + 1).toString()
            }
        }

        binding.toSeeAll.setOnClickListener{
            Toast.makeText(this@MainActivity, "모두보기 버튼을 클릭하셨습니다!", Toast.LENGTH_SHORT)
        }

        binding.movieRating.commentWrite.setOnClickListener{
            Toast.makeText(this@MainActivity, "작성하기 버튼을 클릭하셨습니다!", Toast.LENGTH_SHORT)
        }
    }
}

