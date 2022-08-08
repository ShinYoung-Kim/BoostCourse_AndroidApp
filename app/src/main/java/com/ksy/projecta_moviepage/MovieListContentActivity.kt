package com.ksy.projecta_moviepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ksy.projecta_moviepage.databinding.ActivityMovieListBinding
import com.ksy.projecta_moviepage.databinding.ActivityMovieListContentBinding

class MovieListContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMovieListContentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}