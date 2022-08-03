package com.ksy.projecta_moviepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class CommentList : AppCompatActivity() {
    var movieRatingList = arrayListOf<Movie_Rating>(
        Movie_Rating(R.drawable.user1, "kym71**", "10분전", 5.toFloat(), "적당히 재밌다. 오랜만에 잠 안오는 영화 봤네요.", "추천", "0", "|", "신고하기"),
        Movie_Rating(R.drawable.user1, "angel**", "15분전", 4.7.toFloat(), "웃긴 내용보다는 좀 더 진지한 영화", "추천", "1", "|", "신고하기"),
        Movie_Rating(R.drawable.user1, "beaut**", "16분전", 4.5.toFloat(), "연기가 부족한 느낌이 드는 배우도 있다. 그래도 전체적으로는 재밌다.", "추천", "0", "|", "신고하기")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment_list)

        val adapter = MovieRatingAdapter(movieRatingList)
        val userListView : RecyclerView = findViewById(R.id.userListView)
        userListView.adapter = adapter
    }
}