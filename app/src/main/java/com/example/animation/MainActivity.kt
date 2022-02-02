package com.example.animation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity(){

    private lateinit var imageVIew : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }
    @SuppressLint("CutPasteId")
    private fun initViews(){
        imageVIew = findViewById<ImageView>(R.id.iv_image)
        val btnBounce = findViewById<Button>(R.id.btn_bounce_anim)
        val btnSequential = findViewById<Button>(R.id.btn_sequential_anim)
        val btnTogather = findViewById<Button>(R.id.btn_togather_anim)

        btnBounce.setOnClickListener{
            giveAnimation(R.anim.bounce_anim)
        }
        btnSequential.setOnClickListener{
            giveAnimation(R.anim.sequential_anim)
        }
        btnTogather.setOnClickListener{
            giveAnimation(R.anim.togather_anim)
        }
    }

    private fun giveAnimation(anim : Int){
        val animation : Animation? = AnimationUtils.loadAnimation(applicationContext, anim)
        imageVIew.startAnimation(animation)
    }
}