package com.iset.mariem

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.iset.mariem.adapter.LetterAdapter
import com.iset.mariem.databinding.ActivityMainBinding

/**
 * Main Activity and entry point for the app. Displays a RecyclerView of letters.
 */
class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var isLinearLayoutManager = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recyclerView
        // Sets the LinearLayoutManager of the recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = LetterAdapter()
    }

}