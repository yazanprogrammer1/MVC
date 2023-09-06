package com.example.mvcarchitechureexample

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvm_architecture1.model.Person
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    lateinit var txtage: TextView
    lateinit var age: EditText
    lateinit var name: EditText
    lateinit var calculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //..
        txtage = findViewById(R.id.age)
        age = findViewById(R.id.age_)
        name = findViewById(R.id.name)
        calculate = findViewById(R.id.btn_calculate)

        calculate.setOnClickListener {
            getInfo()
        }
    }

    private fun getInfo() {
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val nameUser = name.text.trim().toString()
        val ageUser = currentYear - age.text.trim().toString().toInt()
        val person = Person(nameUser, ageUser)
        txtage.text = "${person.name} Your Age ${person.age}"
    }

}