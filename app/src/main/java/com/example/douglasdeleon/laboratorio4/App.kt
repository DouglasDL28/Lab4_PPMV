package com.example.douglasdeleon.laboratorio4

import android.app.Application

class App : Application() {
    companion object {
        val proyects : ArrayList<String> = arrayListOf("https://github.com/DouglasDL28/MenuRestaurante", "https://github.com/DouglasDL28/Contactos", "https://github.com/DouglasDL28/Lab4_PPMV")

        var position: Int = 0
    }
}