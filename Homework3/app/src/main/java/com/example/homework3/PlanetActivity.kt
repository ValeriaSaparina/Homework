package com.example.homework3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.homework3.databinding.ActivityPlanetBinding

class PlanetActivity : AppCompatActivity() {
    private var binding: ActivityPlanetBinding? = null
    private var adapter: PlanetAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlanetBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.rvPlanet?.layoutManager = LinearLayoutManager(this)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = PlanetAdapter(
            list = PlanetRepository.list,
            glide = Glide.with(this),
            onItemClick = { planet ->
                val myIntent = Intent(this, InformationActivity::class.java)
                myIntent.putExtra(InformationActivity.ID, planet.id)
                startActivity(myIntent)
            }
        )
        binding?.rvPlanet?.adapter = adapter

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}