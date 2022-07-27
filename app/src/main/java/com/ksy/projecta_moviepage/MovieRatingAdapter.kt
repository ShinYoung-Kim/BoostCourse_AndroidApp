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
import androidx.recyclerview.widget.RecyclerView
//import com.google.android.ads.mediationtestsuite.viewmodels.ItemViewHolder
//import com.blacklog.recyclerview.databinding.ItemRecyclerViewBinding

class MovieRatingAdapter(val listData : ArrayList<Movie_Rating>) : RecyclerView.Adapter<ViewHolder>() {
    //var listData = mutableListOf<Movie_Rating>()
    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userImage.setImageResource(listData.get(position).userImage)
        holder.userId.text = listData[position].userId
        holder.time.text = listData.get(position).time
        holder.rating.rating = listData.get(position).rating
        holder.comment.text = listData.get(position).comment
        holder.recommend.text = listData.get(position).recommend
        holder.recommendNumber.text = listData.get(position).recommendNumber
        holder.forSpace.text = listData.get(position).forSpace
        holder.forReport.text = listData.get(position).forReport
    }
}
class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
    val userImage = itemView.findViewById<ImageView>(R.id.userImage)
    val userId = itemView.findViewById<TextView>(R.id.userId)
    val time = itemView.findViewById<TextView>(R.id.time)
    val rating = itemView.findViewById<RatingBar>(R.id.ratingNumberUser1)
    val comment = itemView.findViewById<TextView>(R.id.userComment)
    val recommend = itemView.findViewById<TextView>(R.id.userRecommend)
    val recommendNumber = itemView.findViewById<TextView>(R.id.userRecommendNumber)
    val forSpace = itemView.findViewById<TextView>(R.id.userSpace)
    val forReport = itemView.findViewById<TextView>(R.id.userReport)
}