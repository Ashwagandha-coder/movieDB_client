package com.moviedb_client.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.moviedb_client.R
import com.moviedb_client.databinding.ActivityBaseBinding

class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBaseBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)



    }

    private fun subscribeToEventViewModel() {}


    private fun configureContent() {}


}