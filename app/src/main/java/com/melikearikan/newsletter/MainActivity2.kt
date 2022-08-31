package com.melikearikan.newsletter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detayli_haberler.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        setSupportActionBar(toolBar1)
        setTitle("haberler")






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
        haberDetaylari.add("İstanbul istikametine seyir halinde olan Kütfettin Eren yönetimindeki tır, önünde ilerleyen hafif ticari araca çarptı. Çarpmanın etkisiyle öne fırlayan hafif ticari araç, 4 otomobilin de kazaya karışmasına neden oldu.Kazada, tır sürücüsü yara almadan kurtulurken, 5 araçta toplam 8 kişi hafif şekilde yaralandı. İhbar üzerine olay yerine 112 Sağlık, polis ve itfaiye ekipleri sevk edildi. Yaralılar olay yerinde yapılan ilk müdahalelerinin ardından hastanelere kaldırıldı.Öte yandan yaşanan kazayla ilgili konuşan tır sürücüsü Kütfettin Eren, 'Kaza ani frenlemeden oldu. Benim frenlerimde bir sorun yok. Öndekiler ani fren yaptı. Ben de bastım frene ama araç boş olduğu için kazaya sebep oldu. 50-60 kilometre hızla gidiyordum' dedi.")
        haberDetaylari.add("Rusya Devlet Başkanı Vladimir Putin'in emri ile 24 Şubat sabahı başlayan savaş can almaya devam ediyor.Savaşta korkulan oldu. Ukrayna birlikleri Herson yönüne doğru karşı saldırıya başladı.Ukrayna ordusu, işgal altındaki Herson bölgesindeki Rusya'nın ilk savunma hattını kırdığını açıkladı.Taarruz haberi Ukrayna'nın daha fazla ateş gücüne sahip olmadan başlatacağı bir saldırının ağır kayıplarla sona ereceği uyarısından saatler sonra geldi.Londra merkezli Uluslararası Stratejik Araştırmalar Enstitüsü'nden Franz-Stefan Gady, başarılı ilerlemeler sağlamak için Ukrayna kuvvetlerinin her biri yaklaşık 4 bin kişilik yarım düzine yeni mekanize ve tank tugayına ihtiyaç duyacağını duyurmuştu.The Telegraph'taki habere göre, bunlar olmadan bir saldırı başlatmak, sürdürülemez kayıplara neden olabilir ve Ukrayna'nın en deneyimli askerini kaybetmesine neden olabilir." )
        haberDetaylari.add("Transfer çalışmalarını sürdüren Trabzonspor, Hollanda ekibi Groningen'in formasını giyen 22 yaşındaki Norveçli forvet Jörgen Strand Larsen'i gündemine aldı.Trabzonspor , Groningen'de forma giyen genç forvet için kulübüyle temasa geçti. Bordo-Mavililer, başka talipleri de olan Larsen için önce bonservis ücretini sordu. Groningen 6 milyon Euro bonservis ücreti istedi. Pazarlıklar devam ediyor. Karadeniz temsilcisi uzun taksitlere bölerek oyuncuyu renklerine bağlamak istiyor.Trabzonspor'un kanca attığı Jörgen Strand Larsen kısa süre önce Groningen'den ayrılmak istediğini ifade etmişti. Bordo-Mavililer işi uzatmadan genç golcüyü imza aşamasına getirmek istiyor. Larsen bu sezon 3 lig maçında 1 gol bir asistlik performans katkısı sağladı. Hollanda basını, oyun tarzını Norveç futbolunun büyük ismi Erling Haaland'a benzetiyor. Groningen ve Sarpsborg'da 131 maça çıktı. 36 defa ağları sarstı. 18 asist yaptı.")
        haberDetaylari.add("İstanbul’da 31 Ağustos Çarşamba gününden itibaren yağışlı havanın etkili olması bekleniyor. İstanbul Büyükşehir Belediyesi (İBB) Afet Koordinasyon Merkezi (AKOM), konuyla ilgili vatandaşları uyardı.İstanbul başta olmak üzere Marmara bölgesi genelinde geçtiğimiz hafta yaşanan kararsız hava koşullarının tekrardan etkili olması bekleniyor. Çarşamba günü sabah saat 06.00’dan itibaren il genelinde kuvvetli sağanak yağmur geçişlerinin yaşanabileceği tahmin ediliyor. Gök gürültüsü eşliğinde görülecek kuvvetli sağanak yağışlarla birlikte, zaman zaman yerel dolu yağışı, yoğun şimşek, yıldırım aktivitesi ve yağış anında kuvvetli rüzgâr (20-50 km/s) da öngörülüyor. Yağışların perşembe ve cuma gününden itibaren yoğunluğunu azaltması; ancak bölgesel olarak 30-60 dakika gibi kısa zaman diliminde kuvvetli şekilde etkili olmaya devam edeceği tahmin ediliyor.")
        haberDetaylari.add("ABD'nin Texas eyaletinde maymun çiçeği kaynaklı bir kişi hayatını kaybetti. Vaka, maymun çiçeği bağlantılı ilk ölüm olarak kayıtlara geçti. Teksas sağlık yetkilileri, maymun çiçeği teşhisi konan hastanın, ülkenin virüs kaynaklı hayatını kaybeden ilk kişisi olduğunu belirtirken, hastanın Houston bölgesinde yaşayan ve bağışıklık sistemi zayıflamış bir yetişkin olduğunu söyledi.Teksas Eyalet Sağlık Yetkilisi Dr. John Hellerstedt, 'Maymun çiçeği, özellikle bağışıklık sistemi zayıf olanlar için ciddi bir hastalıktır. Maymun çiçeğine maruz kalmışlarsa veya hastalıkla uyumlu semptomları varsa, insanları tedavi aramaya teşvik etmeye devam ediyoruz' dedi.ABD şu anda dünyanın en büyük maymun çiçeği salgınıyla mücadele ediyor. CDC verilerine göre, ülke genelinde 18 binden fazla vaka bildirildi ve enfeksiyonlar artık her eyalette, Porto Riko ve Washington DC’de de doğrulandı.")


        var detay_resimler = arrayListOf<Int>()
        detay_resimler.add(R.drawable.detayli_thodex)
        detay_resimler.add(R.drawable.detayli_kaza2)
        detay_resimler.add(R.drawable.img_9)
        detay_resimler.add(R.drawable.ts)
        detay_resimler.add(R.drawable.img_10)
        detay_resimler.add(R.drawable.img_11)





        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = haberlerAdapter(basliklar,aciklamalar,gorselDrawableId,detay_resimler,haberDetaylari)
        recyclerView.adapter = adapter







    }
}