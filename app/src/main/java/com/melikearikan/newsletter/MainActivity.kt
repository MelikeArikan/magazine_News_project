package com.melikearikan.newsletter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //splash screen,uygulamamnın logosunu veya mesajını kullanıcıya göstermek için kullanılır çünkü uygulamanın çalışması uzun sürerse(veritabanı işlemleri açılırken çok yoğunsa..)
        //kullanıcıya bekletmek yerine kullanıcıya açıış ekranında mesajlar verebiliriz.kullanıcının motivasyonunu canlı tutarız,kullanıcı programın donduğunu düşünmez.bi temayı açılış ekranında kullanırız.

    }
}