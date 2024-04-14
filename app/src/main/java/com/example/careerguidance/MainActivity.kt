package com.example.careerguidance

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
   // @RequiresApi(Build.VERSION_CODES.0)

    @RequiresApi(64)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



                val webViewVariable= findViewById<WebView>(R.id.webView)

                webViewSetUp(webViewVariable)

            }

            @RequiresApi(64)

            private fun webViewSetUp(webView: WebView) {

                webView.webViewClient= WebViewClient()

                webView.apply {

                    settings.javaScriptEnabled= true

                    settings.safeBrowsingEnabled= true
                    loadUrl("https://seminarplus-natashia1080.softr.app")

                }
        }
    }
