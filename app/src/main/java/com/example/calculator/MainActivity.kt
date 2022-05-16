package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.contracts.Returns

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd: Button
    lateinit var btnSubtraction: Button
    lateinit var btnmultiplicatioin: Button
    lateinit var btnModulus: Button
    lateinit var et1: EditText
    lateinit var et2: EditText
    lateinit var tvAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSubtraction = findViewById(R.id.btnSubtract)
        btnmultiplicatioin = findViewById(R.id.btnMultiplication)
        btnModulus = findViewById(R.id.btnModulus)
        et1 = findViewById(R.id.et1)
        et2 = findViewById(R.id.et2)
        tvAnswer = findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            tvAnswer.text = ""
            val num1 = et1.text.toString()
            val num2 = et2.text.toString()

            if (num1.isBlank()) {
                et1.setError("")
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                et2.setError("required")
                return@setOnClickListener
            }
            Add(num1.toInt(), num2.toInt())

        }
        btnSubtraction.setOnClickListener {
            tvAnswer.text = ""
            val num1 = et1.text.toString()
            val num2 = et2.text.toString()

            if (num1.isBlank()) {
                et1.setError("")
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                et2.setError("required")
                return@setOnClickListener
            }
            Subtract(num1.toInt(), num2.toInt())

        }
        btnmultiplicatioin.setOnClickListener {
            tvAnswer.text = ""
            val num1 = et1.text.toString()
            val num2 = et2.text.toString()

            if (num1.isBlank()) {
                et1.setError("")
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                et2.setError("required")
                return@setOnClickListener
            }
            Multiplication(num1.toInt(), num2.toInt())

        }
        btnModulus.setOnClickListener {
            tvAnswer.text = ""
            val num1 = et1.text.toString()
            val num2 = et2.text.toString()

            if (num1.isBlank()) {
                et1.setError("")
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                et2.setError("required")
                return@setOnClickListener
            }
            Modulus(num1.toInt(), num2.toInt())

        }


    }

    fun Add(num1: Int, num2: Int) {
        var add = num1 + num2
        tvAnswer.text = add.toString()

    }

    fun Subtract(num1: Int, num2: Int) {
        var sub = num1 - num2
        tvAnswer.text = sub.toString()

    }

    fun Multiplication(num1: Int, num2: Int) {
        var multiply = num1 * num2
        tvAnswer.text = multiply.toString()
    }

    fun Modulus(num1: Int, num2: Int) {
        var remainder = num1 % num2
        tvAnswer.text = remainder.toString()
    }
}













