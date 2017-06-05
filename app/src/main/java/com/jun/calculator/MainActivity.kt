package com.jun.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.textview_result) as TextView
        val button_add = findViewById(R.id.button_plus) as Button
        val button_minus = findViewById(R.id.button_minus) as Button
        val button_multiply = findViewById(R.id.button_multiply) as Button
        val button_divide = findViewById(R.id.button_divide) as Button

        button_add.setOnClickListener(View.OnClickListener {
            view -> result.text = (getFirstNum() + getSecNum()).toString()
        })

        button_minus.setOnClickListener(View.OnClickListener {
            view -> result.text = (getFirstNum() - getSecNum()).toString()
        })

        button_multiply.setOnClickListener(View.OnClickListener {
            view -> result.text = (getFirstNum() * getSecNum()).toString()
        })

        button_divide.setOnClickListener(View.OnClickListener {
            view -> result.text = (getFirstNum() / getSecNum()).toString()
        })
    }

    fun getFirstNum(): Int{
        val firstInput = findViewById(R.id.editText_firstInput) as EditText
        return Integer.parseInt(firstInput.text.toString())
    }

    fun getSecNum(): Int{
        val secondInput = findViewById(R.id.editText_secondInput) as EditText
        return Integer.parseInt(secondInput.text.toString())
    }
}
