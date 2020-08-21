package com.myapplicationdev.android.demotablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnOnClick(view: View){
        var message ="";
        val btnSelected = view as Button
        when(btnSelected.id){
            button1.id -> message  = "Button 1 is selected"
            button2.id -> message  = "Button 2 is selected"
            button3.id -> message  = "Button 3 is selected"
            button4.id -> message  = "Button 4 is selected"
            button5.id -> message  = "Button 5 is selected"
        }
        Toast.makeText(applicationContext,"$message",Toast.LENGTH_LONG).show()
    }
}