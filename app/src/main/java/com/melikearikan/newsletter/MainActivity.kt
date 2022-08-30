package com.melikearikan.newsletter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import com.melikearikan.newsletter.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private val splashScreen =10000 // sn'lik splashScreen tanımladık.(açılış ekranı 10 sn sürücek)
    // private dedim çünkü buna başka sayfadan erişilsin istemiyorum
    lateinit var binding: ActivityMainBinding //binding başlangıç oluşturma
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //oncreate yüklendiğinde tasarım sayfamız çalışıcak.
        //splash screen,uygulamamnın logosunu veya mesajını kullanıcıya göstermek için kullanılır çünkü uygulamanın çalışması uzun sürerse(veritabanı işlemleri açılırken çok yoğunsa..)
        //kullanıcıya bekletmek yerine kullanıcıya açıış ekranında mesajlar verebiliriz.kullanıcının motivasyonunu canlı tutarız,kullanıcı programın donduğunu düşünmez.bi temayı açılış ekranında kullanırız.
        //yukarıdaki action bar'ı kapatalım çünkü action bar splash screen de kullanılmaz:
        supportActionBar?.hide() //action bar kayboldu.
        // oluşturduğumuz animasyon dosyalarına erişim sağlayalim:
       // val animasyon1 = AnimationUtils.loadAnimation(this,R.anim.animasyon1) // res altındaki anim klasöründeki,animasyon dosyasına erişip onu animasyon1 değişkenine atadık
        val animasyon2 = AnimationUtils.loadAnimation(this,R.anim.animasyon2) // res altındaki anim klasöründeki,animasyon dosyasına erişip onu animasyon1 değişkenine atadık
        val animasyon3 = AnimationUtils.loadAnimation(this,R.anim.animasyon3) // res altındaki anim klasöründeki,animasyon dosyasına erişip onu animasyon1 değişkenine atadık
        // ben bu animasyonları activityMaind'deki tasarım elemanlarımın içeirisine yüklemek istiyorum.
        // ilk olarak tasarım elemanlarımıza erişicez:
        //val imageView = binding.imageView
        val imageView2 = binding.imageView2
        val baslık = binding.baslik
        val aciklama = binding.aciklama
        // şimdi tasarım elemanların içerisine oluşturduğum animasyonları aktarıcam:
       // imageView.animation = animasyon1  //imajeView ıd'li tasarım elemanına animasyon1'i ekledik.yani animasyon1 hareketini bana çekmiş olucak.
        imageView2.animation = animasyon2
        baslık.animation = animasyon3
        aciklama.animation = animasyon3
        // bundan sonra splashScreen tanımlamamız gerekiyor çünkü uygulama ilk açıldığında belli bir süre açılış ekranına ihtiyacımız var.
        Handler().postDelayed({
        // 10 sn'lik açılış ekranı yaptım 10 sn sonra bu sayfam nereye gidicek,belirtmem lazım.
        val intent =Intent(this,MainActivity2::class.java)
        startActivity(intent)
            // MainActivity2 çalıştığında splashScreen'de kendini bitirsin istiyorum:
            finish()
        },splashScreen.toLong()) // splahScreen süresini en üstte tanılamıştım,onun süresi kadar -10sn-açılış ekranı olucak. toLong uzunluğu anlamına geliyor.







    }
}