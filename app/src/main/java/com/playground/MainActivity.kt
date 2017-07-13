package com.playground

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.widget.Button
import com.playground.chanel.ChanelActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chanelRecycler = findViewById(R.id.chanel_recycler_btn) as Button;
        chanelRecycler.setOnClickListener { view ->
            Snackbar.make(view, "Snackbar", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null).show()
            startActivity(Intent(this,ChanelActivity::class.java))
        }
    }
}