package com.example.list_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview = findViewById<ListView>(R.id.listview)
        val task = arrayListOf<String>()
        task.add("Courses")
        task.add("learn android development ")
        val adapterformylist = ArrayAdapter(this,android.R.layout.simple_list_item_1,task)
        listview.adapter = adapterformylist
        listview.setOnItemClickListener { parent, view, position, id ->
            val test ="Item clicked "+(view as TextView).text.toString()
            Toast.makeText(this,test,Toast.LENGTH_SHORT).show()
        }


    }
}