package com.example.enpit_p31.hap2

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nyuuryoku.setOnClickListener { onNyuuryokuButtonTapped(it) }
    }

    fun onNyuuryokuButtonTapped(view: View){
        val intent = Intent(this, nyuuryoku2::class.java)
        startActivity(intent)
    }
}
