package com.agarcia.recyclerviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.agarcia.recyclerviewexample.Models.Pokemon

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }


    fun setUpRecyclerView(){
        
    }

    fun getPokemons(): MutableList<Pokemon>{
        var pokemons:MutableList<Pokemon> = ArrayList()
        pokemons.add(Pokemon(1,"Spiderman", "Marvel"))
        pokemons.add(Pokemon(2,"Flash", "DC"))
        pokemons.add(Pokemon(3,"Green Lantern", "DC"))
        pokemons.add(Pokemon(4,"Wonder Woman", "DC"))
        return pokemons
    }
}
