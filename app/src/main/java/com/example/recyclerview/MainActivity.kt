package com.example.recyclerview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var addButton: Button
    private lateinit var adapter: CardAdapter
    private val items = mutableListOf<CardItem>()
    private val options = listOf(
        CardItem(R.drawable.moviles, "[2024A][Moviles][SW]", "VICENTE ADRIAN EGUEZ SARZOSA"),
        CardItem(R.drawable.web, "2024A-WebAvanzadas-ISWD813", "VICTOR VICENTE VELEPUCHA BONETT"),
        CardItem(R.drawable.prueba, "Grupo Prueba", "JOSE ANDRES VERDEZOTO MORAN")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        addButton = findViewById(R.id.addButton)

        adapter = CardAdapter(items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        addButton.setOnClickListener {
            adapter.addItem(options.random())
        }

        }
    }