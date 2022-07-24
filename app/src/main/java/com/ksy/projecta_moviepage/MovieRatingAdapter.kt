package com.ksy.projecta_moviepage

import android.content.Context
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class MovieRatingAdapter (val context: Context, val movieRatingList: ArrayList<Movie_Rating>) : BaseAdapter() {
    override fun getCount(): Int {
        return movieRatingList.size
    }

    override fun getItem(p0: Int): Any {
        return movieRatingList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view:View = LayoutInflater.from(context).inflate(R.layout.user_list, null)

        val userImage = view.findViewById<ImageView>(R.id.userImage)
        val userId = view.findViewById<TextView>(R.id.userId)
        val time = view.findViewById<TextView>(R.id.time)
        val rating = view.findViewById<RatingBar>(R.id.ratingNumberUser1)
        val comment = view.findViewById<TextView>(R.id.userComment)
        val recommend = view.findViewById<TextView>(R.id.userRecommend)
        val recommendNumber = view.findViewById<TextView>(R.id.userRecommendNumber)
        val forSpace = view.findViewById<TextView>(R.id.userSpace)
        val forReport = view.findViewById<TextView>(R.id.userReport)

        val movieRating = movieRatingList[p0]

        val resourceId = context.resources.getIdentifier(movieRating.userImage, "drawable", context.packageName)
        userImage.setImageResource(resourceId)
        userId.text = movieRating.userId
        time.text = movieRating.time
        rating.rating = movieRating.rating
        comment.text = movieRating.comment
        recommend.text = movieRating.recommend
        recommendNumber.text = movieRating.recommendNumber
        forSpace.text = movieRating.forSpace
        forReport.text = movieRating.forReport

        return view
    }
}