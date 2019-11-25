package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{

            val change:Double = editText2.text.toString().toDouble() / 100
            val result: Double = editText.text.toString().toDouble() / ( change * change)

            if(result < 18.5)
            {
                imageView.setImageResource(R.drawable.pic3)
            }

            else if(result > 18.5 && result <= 24.9)
            {
                imageView.setImageResource(R.drawable.pic1)
            }

            else
            {
                imageView.setImageResource(R.drawable.pic2)
            }
        }

        button2.setOnClickListener{
            editText.text = null;
            editText2.text = null;
            imageView.setImageResource(R.drawable.pic0)
        }
    }
}
