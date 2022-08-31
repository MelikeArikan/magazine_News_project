package com.melikearikan.newsletter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detayli_haberler.*

class detayliHaberler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detayli_haberler)

        var intent = intent
        var detayResimler = intent.getIntExtra("detayResimler",0)
        haberDetaylari_görseli.setImageResource(detayResimler)


    }
}