package com.example.homework3

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.example.homework3.databinding.ItemPlanetBinding

class PlanetItem(
    private val binding: ItemPlanetBinding,
    private val glide: RequestManager,
    private val onItemClick: (Planet) -> Unit,
) : ViewHolder(binding.root) {

    fun onBind(planet: Planet) {
        binding.run {
            tvTitle.text = planet.name
            tvDesc.text = planet.desc
            root.setOnClickListener {
                onItemClick(planet)
            }
        }
    }
}