package com.hardsoftday.herolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_superhero.view.*

class HeroAdapter (val superhero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))

    }

    override fun getItemCount(): Int {
        return superhero.size
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superhero[position])
    }

    class HeroHolder(val view:View):RecyclerView.ViewHolder(view) {

        fun render(superhero: SuperHero) {
            view.tvRName.text = superhero.realName
            view.tvNHero.text = superhero.superName
            view.tvPublisher.text = superhero.publisher
            view.tvYear.text = superhero.year
            Picasso.get().load(superhero.image).into(view.ivHero)

            view.setOnClickListener { Toast.makeText(view.context, "Has selecionado ${superhero.realName}", Toast.LENGTH_LONG).show() }

        }

    }

}