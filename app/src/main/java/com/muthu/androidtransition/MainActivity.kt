package com.muthu.androidtransition

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Pair
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        rlRoot.setOnClickListener {

            val intentSecondActivity = Intent(this, SecondActivity::class.java)

            val options = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair.create(tvTitle, "transName"),
                Pair.create(tvDes, "transDesc"),
                Pair.create(ivUser, "transImage")
            )


            startActivity(intentSecondActivity, options.toBundle())
        }
    }

}
