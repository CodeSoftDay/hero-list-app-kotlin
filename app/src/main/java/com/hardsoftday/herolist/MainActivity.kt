package com.hardsoftday.herolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val superhero: List<SuperHero> = listOf(
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020"),
            SuperHero("SpiderMan", "Marvel", "Peter Parker", "https://androidatc.com/template/style/img/Android-ATC-Logo.jpg?v=1.1", "2020")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    fun initRecycler() {
        rvSuperHero.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superhero)
        rvSuperHero.adapter = adapter
    }

}