package com.symoh.cointosser

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.imageView)
        val text : TextView = findViewById(R.id.textView);
        val button  : Button = findViewById(R.id.button);
        button.setOnClickListener{


            val randomDrawableid = getDrawerid()
            val  myImage = ContextCompat.getDrawable(this, randomDrawableid)
            image.setImageDrawable(myImage)


        }

    }
    fun getDrawerid(): Int{
        val texter : TextView = findViewById(R.id.textView)
        val  randomInt = Random.nextInt(until = 2)

        if(randomInt == 0){
            texter.text = "Head"

        }
        else{
            texter.text = "Tail"

        }
        return  when(randomInt){
            0 -> R.drawable.head
            1 -> R.drawable.tail
            else -> R.drawable.tail
        }
        // kindly help me

    }

}