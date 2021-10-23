package com.example.recyclerviewactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class recyclerActivity : AppCompatActivity() {
    lateinit var rv:RecyclerView
    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val info = intent.extras?.getStringArrayList("info")
        rv = findViewById(R.id.rv)
        adapter = Adapter(info)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
    }
}