package com.example.douglasdeleon.laboratorio4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ProyectsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyects)

        val myListView: ListView = findViewById(R.id.proyects_listview)

        val adapter = ArrayAdapter(this@ProyectsActivity, R.layout.item, arrayListOf("Proyecto 2", "Proyecto 3", "Proyecto 4")) //Conexión del listView y el adapter para mostrar la lista.

        myListView.adapter = adapter

        myListView.setOnItemClickListener { parent, view, position, id ->
            App.position = position

            startActivity(Intent(this@ProyectsActivity, WebviewActivity::class.java))
        }
    }
}
