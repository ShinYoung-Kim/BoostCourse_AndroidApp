package com.ksy.projecta_moviepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.*
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.ksy.projecta_moviepage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var movieRatingList = arrayListOf<Movie_Rating>(
        Movie_Rating(R.drawable.user1, "kym71**", "10분전", 5.toFloat(), "적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.", "추천", "0", "|", "신고하기"),
        Movie_Rating(R.drawable.user1, "kym71**", "10분전", 5.toFloat(), "적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.", "추천", "0", "|", "신고하기"),
        Movie_Rating(R.drawable.user1, "kym71**", "10분전", 5.toFloat(), "적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.", "추천", "0", "|", "신고하기")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var isGoodActivated = false
        var isBadActivated = false

        binding.movieInfo.good.setOnClickListener {
            if (binding.movieInfo.bad.isChecked) {
                binding.movieInfo.bad.isChecked = false
                makeDecrease(binding.movieInfo.badNumber)
            } else {
                binding.movieInfo.good.setImageResource(R.drawable.ic_thumb_up_selected)
                makeIncrease(binding.movieInfo.goodNumber)
                isGoodActivated = true
            }
        }

        binding.movieInfo.bad.setOnClickListener {
            if (isGoodActivated) {
                binding.movieInfo.good.setImageResource(R.drawable.ic_thumb_up)
                makeDecrease(binding.movieInfo.goodNumber)
                isGoodActivated = false
            } else {
                binding.movieInfo.bad.isChecked = true
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

        //var movieRatingList = arrayListOf<Movie_Rating>()
        val adapter = MovieRatingAdapter(movieRatingList)
        binding.movieRating.userListView.adapter = adapter
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

