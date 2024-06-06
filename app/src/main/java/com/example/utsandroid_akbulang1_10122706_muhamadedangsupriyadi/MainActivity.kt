package com.example.utsandroid_akbulang1_10122706_muhamadedangsupriyadi

import android.os.Bundle
import android.content.Intent
import android.app.DatePickerDialog
import android.widget.EditText
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.*
import java.util.*





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTextDOB: EditText = findViewById(R.id.editTextDOB)
        val editTextNIK: EditText = findViewById(R.id.editTextNIK)
        val editTextName: EditText = findViewById(R.id.editTextName)
        val radioGroupGender: RadioGroup = findViewById(R.id.radioGroupGender)
        val radioGroupRelationship: RadioGroup = findViewById(R.id.radioGroupRelationship)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}