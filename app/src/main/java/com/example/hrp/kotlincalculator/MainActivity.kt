package com.example.hrp.kotlincalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result = findViewById(R.id.textView_result) as TextView
        val button_sum = findViewById(R.id.button_sum) as Button
        val button_sub = findViewById(R.id.button_sub) as Button
        val button_div = findViewById(R.id.button_div) as Button
        val button_multi = findViewById(R.id.button_multi) as Button

        button_sum.setOnClickListener(View.OnClickListener {
            view->result.text = (getInput1() + getInout2()).toString()
        })
        button_sub.setOnClickListener(View.OnClickListener {
            view->result.text = (getInput1()- getInout2()).toString()
        })
        button_div.setOnClickListener(View.OnClickListener {
            view->result.text = (getInput1() * getInout2()).toString()
        })
        button_multi.setOnClickListener(View.OnClickListener {
            view->result.text = (getInput1() / getInout2() ).toString()
        })




    }

    fun getInput1():Int{
        val editText_i1 = findViewById(R.id.editText_i1) as EditText
        return Integer.parseInt(editText_i1.text.toString())
    }
    fun getInout2():Int{
        val editText2_i2 = findViewById(R.id.editText2_i2) as EditText
        return Integer.parseInt(editText2_i2.text.toString())
    }


}
