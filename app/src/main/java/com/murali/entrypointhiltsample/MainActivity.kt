package com.murali.entrypointhiltsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        student = Student(this)

        findViewById<Button>(R.id.btnSave).setOnClickListener(View.OnClickListener {
            val name = findViewById<EditText>(R.id.edit_text).text.toString()
            student.putName(name)
        })

        findViewById<Button>(R.id.btnGetSaved).setOnClickListener(View.OnClickListener {
            val name = student.getName()
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        })

    }
}