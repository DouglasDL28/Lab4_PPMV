package com.example.douglasdeleon.laboratorio4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.douglasdeleon.laboratorio4.App.Companion.position

class WebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl(App.proyects[position])
    }
}
