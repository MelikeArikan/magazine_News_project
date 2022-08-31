package com.melikearikan.newsletter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detayli_haberler.*

class detayliHaberler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detayli_haberler)

        setSupportActionBar(toolBar1) //oluştuduğumuz toolBar'ı tanicak.
        setTitle("güncel haber içeriklerimiz")


        var intent = intent
        var detayResimler = intent.getIntExtra("detayResimler",0)
        var baslik = intent.getStringExtra("baslık")
        var haberDetaylari = intent.getStringExtra("haberDetaylari")
        imageView4.setImageResource(detayResimler)
        haberDetaylari_basligi.text = baslik
        haberDetaylari_detaylar.text = haberDetaylari


    }
}