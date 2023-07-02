package com.example.homework3

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.homework3.databinding.ActivityInformationBinding

class InformationActivity : AppCompatActivity() {


    private var binding: ActivityInformationBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInformationBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val planet = PlanetRepository.list[intent.getIntExtra(ID, 1)]

        val glide = Glide.with(this)
        binding?.run {
            glide.load(planet.url).into(ivImage)
            val info = "Description: " + planet.desc + "\n" + "Type: " + planet.type + "\n" +
                    "Radius: " + planet.radius + "\n" + "Distance from the Sun: " + planet.distFromTheSun
            tvInfo.text = info
            tvTitle.text = planet.name
        }
    }

    companion object {
        const val ID = "id"
        fun createBundle(id: Int): Bundle {
            var bundle = Bundle()
            bundle.putInt(ID, id)
            return bundle
        }
    }
}