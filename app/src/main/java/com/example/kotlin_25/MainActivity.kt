package com.example.kotlin_25

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image : ImageView = findViewById(R.id.mood)

        image.setImageResource(R.drawable.cheerful)
    }

    fun moodChange(button: View){
        val radBut1 : RadioButton = findViewById(R.id.good)
        val radBut2 : RadioButton = findViewById(R.id.bad)
        val image : ImageView = findViewById(R.id.mood)

        if (radBut1.isChecked)
            image.setImageResource(R.drawable.cheerful)
        else if (radBut2.isChecked)
            image.setImageResource(R.drawable.cry)
    }

    fun record(view: View){
        val edText1 : EditText = findViewById(R.id.insertEventName)
        val edText2 : EditText = findViewById(R.id.insertDate)
        val edText3 : EditText = findViewById(R.id.insertTime)
        val edText4 : EditText = findViewById(R.id.post)

        val eventName : String = (edText1.text.toString())
        val eventDate : String = (edText2.text.toString())
        val eventTime : String = (edText3.text.toString())
        val eventPost : String = (edText4.text.toString())

        val button : Button = findViewById(R.id.save)

        if (eventName.isNotEmpty() && eventDate.isNotEmpty()){
            Toast.makeText(this, "Записано! \nСобытие: $eventName\nДата: $eventDate\nВремя: $eventTime\nЗаметки: $eventPost", Toast.LENGTH_LONG).show()
            edText1.setText("")
            edText2.setText("")
            edText3.setText("")
            edText4.setText("")
        }
    }
}