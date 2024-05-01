package com.example.bdroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.room.Room
import com.example.bdroom.config.EmpresaLavadoDB
import com.example.bdroom.models.Clientes
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    //Lateinit es cuando no cuenta con inicialización
    private lateinit var db: EmpresaLavadoDB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }


}