package com.ksy.projecta_moviepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.*
import androidx.core.view.isVisible
import com.ksy.projecta_moviepage.R
import com.ksy.projecta_moviepage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.movieInfo.good.setOnClickListener {
            if (binding.movieInfo.badSelected.isVisible) {
                makeInvisible(binding.movieInfo.badSelected)
                makeDecrease(binding.movieInfo.badNumber)
            } else {
                makeVisible(binding.movieInfo.goodSelected)
                makeIncrease(binding.movieInfo.goodNumber)
            }
        }

        binding.movieInfo.bad.setOnClickListener {
            if (binding.movieInfo.goodSelected.isVisible) {
                makeInvisible(binding.movieInfo.goodSelected)
                makeDecrease(binding.movieInfo.goodNumber)
            } else {
                makeVisible(binding.movieInfo.badSelected)
                makeIncrease(binding.movieInfo.badNumber)
            }
        }

        binding.toSeeAll.setOnClickListener{
            Toast.makeText(this@MainActivity, "모두보기 버튼을 클릭하셨습니다!", Toast.LENGTH_SHORT).show()
        }

        binding.movieRating.commentWrite.setOnClickListener{
            Toast.makeText(this@MainActivity, "작성하기 버튼을 클릭하셨습니다!", Toast.LENGTH_SHORT).show()
        }

        val input = String()
        val characterSequence :CharSequence = input
        if (characterSequence is StringBuffer) {
            var a :StringBuffer = characterSequence
        }
    }

    fun CharSequence.increase() : String = (this.toString().toInt() + 1).toString()
    fun CharSequence.decrease() : String = (this.toString().toInt() - 1).toString()

    fun makeVisible(imageView: ImageView) {
        imageView.visibility = VISIBLE
    }

    fun makeInvisible(imageView: ImageView) {
        imageView.visibility = INVISIBLE
    }

    fun makeIncrease(textView: TextView) {
        textView.text = textView.text.increase()
    }

    fun makeDecrease(textView: TextView) {
        textView.text = textView.text.decrease()
    }
}

