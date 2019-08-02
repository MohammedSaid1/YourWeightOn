package com.example.yourweighton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val gravity = 0.38f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var weight = et_weight.text
        btn_weight.setOnClickListener {
       var result = calculate_weight(weight.toString().toDouble())
            tv_result.text = result.toString()
        }
    }

    fun calculate_weight(weight:Double):Double
    {
        return weight * gravity
    }
}


