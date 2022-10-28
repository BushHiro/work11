package com.example.work

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import com.example.work.databinding.ActivityGalleryBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class GalleryActivity : AppCompatActivity() {

    private var binding: ActivityGalleryBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val galleryViewPager = binding?.galleryVp
        val adapter = GalleryAdapter(this )
        galleryViewPager?.adapter = adapter

        TabLayoutMediator(binding!!.tabLayout, galleryViewPager!!){
            tab,position->
            tab.text = getTitle(position)
        }.attach()

    }

    private fun getTitle(position:Int):String?{
        return when(position){
            0 ->"Moscow"
            1 ->"Saint Petersburg"
            2 ->"Taganrog"
            else -> null
        }
    }

}