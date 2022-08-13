package com.ksy.projecta_moviepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.ksy.projecta_moviepage.databinding.ActivityMovieListBinding
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val adapter by lazy { ViewPagerAdapter(supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMovieListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.activityMovieListContent.toolbarMain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_hamburger_menu)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        binding.navigation.setNavigationItemSelectedListener(this)

        binding.activityMovieListContent.viewPagerMain.adapter = MovieListActivity@adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> {
                activityMovieList.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        return false
    }

    override fun onBackPressed() {
        val binding = ActivityMovieListBinding.inflate(layoutInflater)
        if (binding.activityMovieList.isDrawerOpen(GravityCompat.START)) {
            binding.activityMovieList.closeDrawers()
        } else {
            super.onBackPressed()
        }
    }
}