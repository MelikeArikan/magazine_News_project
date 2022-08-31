package com.melikearikan.newsletter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var basliklar = arrayListOf<String>()
        basliklar.add("Thodex vurguncusu yakalandı:")
        basliklar.add("TEM otoyolunda kaza:")
        basliklar.add("Zelenski'den Rus askerlerine çağrı:")
        basliklar.add("Trabzonspor transfer haberi:")
        basliklar.add("Meteoroloji'den İstanbullulara uyarı:")
        basliklar.add("ABD'de maymun çiçeğinden ilk ölüm..")

        var aciklamalar = arrayListOf<String>()
        aciklamalar.add("Arnavutluk polisi, kırmızı bültenle aranan Thodex'in kurucusu Fatih Özer'in Arnavutluk'un Vlora kentinde yakalandığını açıkladı.")
        aciklamalar.add("Bolu'da TEM Otoyolu'nda tır, hafif ticari araç ve 4 otomobilin karıştığı zincirleme trafik kazasında 8 kişi yaralandı.")
        aciklamalar.add("6 ayı geride bırakan savaşta korkulan oldu. Ukrayna Zelenski'nin işaret ettiği saldırıya başladı.")
        aciklamalar.add("Son dakika Trabzonspor transfer haberi! Fırtına Jörgen Strand Larsen'in peşinde")
        aciklamalar.add("Meteoroloji ve AKOM’dan İstanbul’a art arda yağış uyarısı! İşte son hava durumu tahminleri")
        aciklamalar.add("ABD'nin Texas eyaletinde maymun çiçeği kaynaklı bir kişi hayatını kaybetti. Vaka, maymun çiçeği bağlantılı ilk ölüm olarak kayıtlara geçti.")

        var gorselDrawableId = arrayListOf<Int>()
        gorselDrawableId.add(R.drawable.thodex)
        gorselDrawableId.add(R.drawable.kaza)
        gorselDrawableId.add(R.drawable.zelensky)
        gorselDrawableId.add(R.drawable.img_6)
        gorselDrawableId.add(R.drawable.meteor)
        gorselDrawableId.add(R.drawable.maymun_cicegi)

        var haberDetaylari = arrayListOf<String>()
        haberDetaylari.add("Arnavutluk İçişleri Bakanı Bledar Çuçi, bugün sabah saatlerinde İçişleri Bakanı Süleyman Soylu’ya kırmızı bültenle aranan Thodex’in kurucusu firari Faruk Fatih Özer'in Arnavutluk Vlora’da yakalandığını ve kimliğinin biyometrik sonuçlar ile de teyit edildiğini iletti.Emniyet Genel Genel Müdürlüğü İnterpol Daire Başkanlığınca Fatih Özer’in Türkiye’ye iadesi işlemlerine başlandı.Öte yandan İçişleri Bakanlığı'ndan, Thodex'in kurucusu Fatih Özer'in iadesiyle ilgili bir açıklama yapıldı.İçişleri Bakanlığından yapılan açıklamada şu ifadelere yer verildi:“Arnavutluk Cumhuriyeti İçişleri Bakanı Bledar Çuçi bugün sabah saatlerinde İçişleri Bakanı Süleyman Soylu’ya Kırmızı Bültenle aranan Thodex’in kurucusu firari Faruk Fatih Özer'in Arnavutluk’ta Vlora’da yakalandığını ve  kimliğinin biyometrik sonuçlar ile teyit edildiğini iletti.Emniyet Genel Genel Müdürlüğü İnterpol Daire Başkanlığınca, Fatih Özer’in Türkiye’ye iadesi işlemlerine başlandı.”")

        var detay_resimler = arrayListOf<Int>()
        detay_resimler.add(R.drawable.detaylar1)
        detay_resimler.add(R.drawable.img_8)
        detay_resimler.add(R.drawable.img_9)
        detay_resimler.add(R.drawable.img_12)
        detay_resimler.add(R.drawable.img_10)
        detay_resimler.add(R.drawable.img_11)





        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = haberlerAdapter(basliklar,aciklamalar,gorselDrawableId,detay_resimler)
        recyclerView.adapter = adapter







    }
}