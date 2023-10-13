package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        val dice = findViewById<ImageView>(R.id.image)

        //btn.setOnClickListener(MyOnClick(this))
        val a = intArrayOf(1,2,3,4,5,6)
        btn.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                when(a.random()) {
                    1 -> dice.setImageResource(R.drawable.dice_1)
                    2 -> dice.setImageResource(R.drawable.dice_2)
                    3 -> dice.setImageResource(R.drawable.dice_3)
                    4 -> dice.setImageResource(R.drawable.dice_4)
                    5 -> dice.setImageResource(R.drawable.dice_5)
                    6 -> dice.setImageResource(R.drawable.dice_6)
                }
            }

        })
    }
    /*class MyOnClick(val activity: MainActivity) : View.OnClickListener
    {
        override fun onClick(p0: View?) {
            Toast.makeText(activity, "okok", Toast.LENGTH_LONG).show()
        }
    }*/
}