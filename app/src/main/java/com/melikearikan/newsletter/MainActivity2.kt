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
        basliklar.add("Merve Boluğur evleniyor!")
        basliklar.add("Atiye hayallerimi çaldı!")
        basliklar.add("Hazal Kaya korkuttu!")
        basliklar.add("Brad pitt'in yeni aşkı!")
        basliklar.add("Nesrin'in'ayrılık' sessizliği")
        basliklar.add("Cezaevinden tahliye oldu!")

        var aciklamalar = arrayListOf<String>()
        aciklamalar.add("Bir süredir DJ Mert Aydın'la birlikte olan ünlü oyunca Merve Boluğur, bugün sevgilisinden evlilik teklifi aldı.")
        aciklamalar.add("Ünlü yazar Ece Özbaş'tan Beren Saat ve Mehmet Günsür'lü Atiye dizisine şok suçlama! 'Atiye hayallerimi çaldı'")
        aciklamalar.add("Bir süredir sosyal medyadan uzak olan Hazal Kaya, sağlık problemleri yaşadığını dile getirdi.")
        aciklamalar.add("Dünyaca ünlü aktör Brad Pitt ile model Emily Ratajkowski hakkında sürpriz bir iddia ortaya atıldı. İklinin, yeni bir ilişkiye başladığı ileri sürüldü")
        aciklamalar.add("Gökhan Alkan ile ilişkisini sonlandıran Nesrin Cavadzade, basın mensuplarının 'ayrılık' sorusunu cevapsız bırakmayı tercih etti")
        aciklamalar.add("Gülşen başına gelenlerin talihsizlikten ibaret olduğunu savunuyor.")

        var gorselDrawableId = arrayListOf<Int>()
        gorselDrawableId.add(R.drawable.merve_bolugur)
        gorselDrawableId.add(R.drawable.atiye4)
        gorselDrawableId.add(R.drawable.hazal)
        gorselDrawableId.add(R.drawable.brad)
        gorselDrawableId.add(R.drawable.nesrin3)
        gorselDrawableId.add(R.drawable.gulsen)

        var haberDetaylari = arrayListOf<String>()
        haberDetaylari.add("Ünlü oyuncu Merve Boluğur'dan hayranlarını sevindiren haber geldi. Bir süredir DJ Mert Aydın'la birlikte olan Merve Boluğur, bugün sevgilisinden evlilik teklifi aldı. Sosyal medyayı sık kullanan ünlü oyuncu, yaptığı paylaşımla hayranlarına müjdeyi verdi.Paylaştığı fotoğrafın altına oyuncu, 'I said yes kocam' notunu ekledi.Öteyandan Eski eşler Merve Boluğur ile Murat Dalkılıç arasındaki gerilim büyüyor. Dalkılıç'ın geçtiğimiz günlerde, 'Yüzlerce nefret dolu mesajlar aldım. Bizim ayrılma nedenimizi canı isterse bir gün Merve açıklar' sözlerinin ardından Boluğur'dan bir tepki daha geldi. Ünlü oyuncu, 'Kaçıncı şov koçum. Artık hakkımı savunacağım. Kimse beni değişik ithamlarla yargılayamaz!' dedi.Önceki gün sevgilisiyle birlikte yürürken muhabirlerin kendisine Murat Dalkılıç'ı sormasına sinirlenen Boluğur  bu kez daha sert konuştu: 'Sevgilim yanımda, görmüyor musun!' ")
        haberDetaylari.add("Beren Saat ve Mehmet Günsür'ün başrollerini paylaştığı, geçtiğimiz yıllarda dijital platformda yayınlanan 'Atiye' adlı dizinin yapımcısı, senaryonun Ece Özbaş'ın kitabından kopyalandığı iddiasıyla mahkemelik oldu! 'Atiye' dizisinin, Ece Özbaş tarafından 2017 yılında yazılan 'Sihrin Kovulmuş Melekleri' adlı kitaptan çalıntı olduğu ortaya çıktı. 'Kitabı defalarca okuduk, dizinin her bölümünü defalarca izledik ve notlar çıkardık. Yaklaşık yirmi keskin benzeşme ile esinlenmenin ötesinde bir intihal yakaladık' diyen Özbaş'ın avukatı Tolga Hasan Özalp, müvekkilinin hukuk mücadelesini şöyle anlattı: 'Önce yayıncı kuruluşu bulduk. RTÜK'e, kurumsal adını öğrenmek maksadıyla yazılar yazdık, sonra yapımcıyı bulduk, kanuni haklarımızın himayesi babında önce uzlaşma yollarını aradık, ama öyle tepeden baktılar ki... Birkaç ay geçmesine rağmen en sonunda aldığımız cevap 'Hayır, sizinle anlaşamayız' oldu.Özalp, sürecin sonunda İstanbul 2. Fikri ve Sinai Haklar Mahkemesi'nde dava açmak zorunda kaldıklarını belirtti.'")
        haberDetaylari.add("Bir süredir sosyal medyadan uzak olan Hazal Kaya, sağlık problemleri yaşadığını dile getirdi. Konuyla alakalı konuşan oyuncu, 'Fiziksel olarak aşırı zorlandığım bir dönem sadece, sonra anlatırım. Psikolojik olarak kaldırabildiklerimin de ciddi bir sınırı oldu. Ayrıca 9'a 3 tansiyonla ya evde baygın yatıyorum ya da sette hayatta tutunmaya çalışıyorum.' dedi.Instagram'da 7 milyondan fazla takipçisi bulunan Kaya, sosyal medyayı aktif kullanan isimler arasında yer alıyordu. Ancak ünlü oyuncunun bir süredir paylaşımda bulunmaması dikkat çekmişti. Hazal Kaya, önceki gün yayınladığı gönderi ile suskunlıuğunu bozdu. Son olarak imaj değişikliği ile gündeme gelen Kaya, yaşadığı sağlık sorunları sebebiyle sosyal medyaya ara verdiğini ifade etti.Konuyla alakalı açıklama yapan ünlü oyuncu, 'Nasıl açtım arayı ama? İsteyerek olmadı vallahi... Fiziksel olarak aşırı zorlandığım bir dönem sadece, sonra anlatırım. Psikolojik olarak kaldırabildiklerimin de ciddi bir sınırı oldu. Ayrıca 9'a 3 tansiyonla ya evde baygın yatıyorum ya da sette hayatta tutunmaya çalışıyorum. Ay, çok güzel şeyler geliyor. Neyse... Böyleyken böyle. İki, üç haftaya toparlarım gibi; yani umarım! Öptüm.' şeklinde konuştu.")
        haberDetaylari.add("Angelina Jolie ile birlikteliğini 2016'da sonlandıran altı çocuk babası Brad Pitt'in, gönlünü Sebastian Bear-McClard ile boşanma aşamasında olduğu konuşulan model Emily Ratajkowski'ye kaptırdığı iddia edildi.OK Dergisi'ne konuşan bir kaynak, Pitt ve Ratajkowski'nin gizlice bir ilişki yaşadığını söyledi.Kaynak, ayrıca Emily Ratajkowski ve Brad Pitt'in 2020 Vanity Fair Oscar Partisi'nde de birlikte olduklarını belirtti.İkilinin, Ben Affleck ve Jennifer Lopez'den sonra Hollywood'un en çok konuşulacak çifti olacağı düşünülüyor.Öte yandan Amerikalı model Emily Ratajkowski'nin 2018 yılında evlendiği aktör Sebastian Bear-McClard'dan boşanacağı konuşuluyor.People'ın aktardığına göre; Sylvester Apollo Bear isminde bir oğulları olan çiftin kısa zaman önce yollarını ayırdığı ve bu evliliği noktalama kararını Ratajkowski'nin verdiği belirtilmişti. Dergiye konuşan bir kaynak, 'Emily iyi hissediyor ve güçlü. Tamamen oğluna odaklanmış durumda. Anne olmayı seviyor.' diye konuşmuştu.")
        haberDetaylari.add("Kendisi gibi oyuncu olan Gökhan Alkan ile ilişkisini sonlandıran Nesrin Cavadzade, basın mensuplarının 'ayrılık' sorusunu cevapsız bırakmayı tercih etti.Habertürk'ten Ferit Tuğluk'un haberine göre; Oyuncu Nesrin Cavadzade, önceki gün Etiler'deki bir alışveriş merkezinde objektiflere yansıdı. Cavadzade, spor salonu çıkışında görüntülendi.Kendisi gibi oyuncu olan Gökhan Alkan ile evlilik yolunda ilerlerken ayrılık kararı alan Nesrin Cavadzade, muhabirlerin konuyla alakalı sorularını ise yanıtsız bıraktı.Daha önce Nesrin Cavadzade ile Gökhan Alkan arasında dizi ile ilgili kıskançlık krizi yaşandığı ileri sürülmüştü.Cavadzade'nin, Alkan'ın rol arkadaşı Yağmur Tanrısevsin'le senaryo gereği öpüşmesini istemediği konuşulmuştu.Çıkan haberlerin ardından Nesrin Cavadzade, konuyla ilgili sosyal medya hesabından açıklama yapmıştı. Ünlü oyuncu, gönderisinde şu ifadelere yer vermişti:Değerli basın mensupları; Bugün hakkımda çıkan haberleri şaşkınlıkla okudum! Aylardır bazı yapımların ve bunların üzerinden PR çalışması yapan menajerlerin adımı kullanarak kendini gündemde tutma çabasına sessiz kaldım ama bugün hem şahsi hayatımda hem de meslek etiğime dil uzatacak kadar çizgiyi aşmış olmalarından dolayı bir cevabı hak ettiğine kanaat getirdim. Benim kimsenin icra ettiği sanata bir müdahalem olamaz! Bu kişi sevgilim bile olsa. Çünkü ben de aynı işi, sevgiyle ve tutkuyla yapıyorum. Benim yaptığım işe kimsenin karışamayacağı gerçeği gibi ben de kimsenin işine karışamam. Ayrıca oyunculuk sanatını anlamak için önümde 20 yılım vardı, emin olun anladım. Darısı anlayamayanların başına. Sevgilerimle...")
        haberDetaylari.add("Gülşen, nisan ayında İstanbul'daki bir mekanda sahne almıştı. Şarkıcının, 4 ay önceki konserinden bir kesit dün akşam saatlerinde sosyal medyada paylaşıldı. Görüntülerde Gülşen'in bir kişi hakkında, 'İmam hatipte okumuş daha önce kendisi, sapıklığı oradan geliyor' ifadelerini kullandığı görüldü.Şarkıcı Gülşen, ifadesinde suçlamaları kabul etmedi. Grubunda Miraç adlı müzisyenin 'imam' lakabı olduğunu belirten Gülşen, aralarında geçen bir konuşma dolayısıyla suç işleme kastının olmadığını savundu.Gülşen, ifadesine şunları söyledi: 'Ben 25 yıllık sanatçıyım. Benim müzisyen çalışma arkadaşlarım var. Bu grupla birlikte konserlerde sahne alırım. Benim kadromda klavye müzisyeni olarak yer alan “Miraç” isimli arkadaşımın lakabı “imamdır”. Arkadaşlarla kendi aramızda ‘aptal, salak, sapık' olarak şakalaşırız. Talihsizlik olarak bu iki kelime bir araya gelmiştir. Arkadaşımız imam hatipte okumamıştır. Miraç'ın soy ismini ve iletişimini hatırlamıyorum. Grupta tüm arkadaşlarımın lakabı mevcuttur.Bu konuşma, konserin hatırlamadığım bir aşamasında muhtemelen şarkı arasında Miraç ile aramızda geçen bir konuşmadır. Ben orkestrama hitaben “beni seyircilerinin arasında omuzlarınızda taşıyın” demem üzerine bana okrestra arasından “seni imam taşısın” şeklinde cevap gelince bahse konu konuşma Miraç'la aramızda geçmiştir. Bu konuşma konsere katılanlara ya da medyaya hitaben yaptığım bir konuşma değildir. Ben ülkesini seven, fırsat eşitliğine inanan, kimseyi ayırıp örselemeyen bir sanatçıyım.'")


        var detay_resimler = arrayListOf<Int>()
        detay_resimler.add(R.drawable.merve_bolugur2)
        detay_resimler.add(R.drawable.atiye2)
        detay_resimler.add(R.drawable.hazal2)
        detay_resimler.add(R.drawable.brad2)
        detay_resimler.add(R.drawable.nesrin2)
        detay_resimler.add(R.drawable.gulsen1)





        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val adapter = haberlerAdapter(basliklar,aciklamalar,gorselDrawableId,detay_resimler,haberDetaylari)
        recyclerView.adapter = adapter







    }
}