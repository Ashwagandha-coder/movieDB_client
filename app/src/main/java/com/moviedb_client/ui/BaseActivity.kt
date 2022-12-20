package com.moviedb_client.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.moviedb_client.R

class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)



    }
}