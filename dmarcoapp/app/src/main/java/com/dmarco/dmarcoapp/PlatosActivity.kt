package com.dmarco.dmarcoapp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlatosActivity : AppCompatActivity() {

    private val listPlatos = listOf(
        Platos("Pizza DMarco", "Pizzas", "S/ 25.00", "La mejor pizza con la combinación perfecta de queso, espinaca y carnes del norte trujillano", R.drawable.imagen1),
        Platos("Duo DMarco", "Bebidas", "S/ 15.00", "La combinación perfecta para compartir entre amigos", R.drawable.imagen2),
        Platos("Pan con Pollo", "Sanguches", "S/ 15.00", "El tradicional pan con pollo trujillano, solo en DMarco", R.drawable.imagen3),
        Platos("Cafe", "Bebidas", "S/ 10.00", "Los mejores granos del norte peruano solo en DMarco", R.drawable.imagen4),
        Platos("Ceviche Tradicional", "Marino", "S/ 25.00", "El infaltable ceviche trujillano", R.drawable.imagen5)

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_platos)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(false)
        title = "Platos D'Marco"

        val recyclerPlatos = findViewById<RecyclerView>(R.id.recyclerPlatos)
        recyclerPlatos.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = PlatosAdapter(listPlatos)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

}