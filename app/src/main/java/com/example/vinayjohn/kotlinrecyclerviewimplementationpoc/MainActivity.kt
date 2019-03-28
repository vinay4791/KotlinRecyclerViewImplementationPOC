package com.example.vinayjohn.kotlinrecyclerviewimplementationpoc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data: ArrayList<String> = ArrayList()

        for (i in 1..10) {
            data.add("data #$i")
        }

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = DataAdapter(data)

    }
}
