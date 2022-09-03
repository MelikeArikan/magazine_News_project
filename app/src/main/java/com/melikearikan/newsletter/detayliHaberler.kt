package com.melikearikan.newsletter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.close
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_detayli_haberler.*

class detayliHaberler : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle

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

        val drawerLayout :DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.nav_view)
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.hakkimizda -> Toast.makeText(applicationContext,"Hakkımızda sayfasına gidiliyor..",Toast.LENGTH_LONG).show()
                R.id.vizyon_ve_misyonumuz -> Toast.makeText(applicationContext,"Vizyon ve Misyonumuz sayfasına gidiliyor..",Toast.LENGTH_LONG).show()
                R.id.iletisim_bilgilerimiz -> Toast.makeText(applicationContext,"İletişim Bilgilerimiz sayfasına gidiliyor..",Toast.LENGTH_LONG).show()
            }
            true
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}