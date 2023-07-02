package com.example.homework3

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import com.example.homework3.databinding.ItemPlanetBinding

class PlanetAdapter(
    private var list: List<Planet>,
    private val glide: RequestManager,
    private val onItemClick: (Planet) -> Unit,
) : RecyclerView.Adapter<PlanetItem>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PlanetItem = PlanetItem(
        binding = ItemPlanetBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false,
        ),
        glide = glide,
        onItemClick = onItemClick,
    )

    override fun onBindViewHolder(holder: PlanetItem, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}