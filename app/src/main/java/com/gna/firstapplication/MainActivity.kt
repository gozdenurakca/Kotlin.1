package com.gna.firstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gna.firstapplication.ui.theme.FirstApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        println("Merhaba Kotlin")

        // Değişkenler & Sabitler

        // Integer

        println("------------  INT  ------------")

        var a = 5
        var b = 10
        println(a*b)

        var yas = 30
        println(yas/5*8)

        val x = 20
        val y = 30
        println(x+y)

        println(yas)

        val yasSonucu = yas * x
        println(yasSonucu)

        // Tanımlama ( defining )
        var benimIntegerim : Int

        // Başlatma ( initializing, initialization )
        benimIntegerim = 5

        var yeniInteger : Int = 10

        println(benimIntegerim / 2)

        // Long

        println("------------  LONG  ------------")
        // çok yüksek kapasiteli işlemlerde long kullanılır.

        var benimLong : Long = 100
        benimLong = 30000000
        println(benimLong)

        // Double & Float

        println("------------  DOUBLE & FLOAT  ------------")

        val pi = 3.14
        println(pi * 2)

        val floatPi : Float = 3.14f // float olduğunu belirtmek için sonuna 'f' koyarız
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)

        // String
        println("------------  STRING  ------------")

        var benimString : String = "Benim yeni metnim"
        println(benimString)
        println(benimString.length)

        val isim = "Gözde Nur "
        val soyisim = "Akça"
        val tamIsim = isim + " " + soyisim
        println(tamIsim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString : String
        baskaBirString = "20"

        println(yeniBirString+baskaBirString) // String olduğu için yan yana alıyor = 1020 olur

        // Boolean

        println("------------  BOOLEAN  ------------")

        var benimBoolean = true
        benimBoolean = false

        /*
         <  : küçüktür
         >  : büyüktür
         == : eşittir
         =! : eşit değildir
         >= : büyük eşittir
         <= : küçük eşittir
         && : ve (and)
         || : veya (or)
         */

        println(3 < 5) // true
        println(4 != 4) // false
        // bu işleminlerin sonucu bir boolean'dır

        // Veri tipi dönüştürme

        println("------------  Dönüştürme  ------------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        // Koleksiyonlar
        // Array / Dizi

        println("------------  DİZİLER  ------------")

        val stringOrnegi = "Gözde"

        val benimDizim = arrayOf(stringOrnegi, "Nur", "Akça", "Zeynep", "Kerem")

        // Dizilerde indexler 0'dan başlar

        println(benimDizim[0])      // Gözde
        println(benimDizim.get(0))  // Gözde
        // yukarıdaki iki kodun da çıktısı aynıdır fakat farklı gösterim şekilleridir.


        println(benimDizim[1])      // Nur
        benimDizim[1] = "Bilgisayar"
        println(benimDizim[1])      // Bilgisayar
        println(benimDizim[2])      // Akça
        println(benimDizim[3])      // Zeynep
        println(benimDizim[4])      // Kerem


        // get = almak
        // set = ayarlamak / değiştirmek

        val dizim = arrayOf("selam", "naber", "nasılsın")
        dizim.set(0,"hi !")
        dizim.get(0)
        dizim.set(1,"what's up ?")
        dizim.get(1)
        dizim.set(2,"how are you ? ")
        dizim.get(2)


        val numaraDizisi = arrayOf(3.14, 5, 100, 15.4)
        numaraDizisi.get(0)
        numaraDizisi.get(1)
        numaraDizisi.get(2)
        numaraDizisi.get(3)


        // KOTLİN'DE KARIŞIK DİZİLER OLUŞTURULABİLİR.

        val karisikDizi = arrayOf("Gözde", true , 45, 3.14)
        println(karisikDizi[0])

        // ArrayList- Listeler

        println("------------  ArrayList  ------------")

        val isimListesi = arrayListOf<String>("Gözde" , "Nur")
        println(isimListesi.get(0))
        isimListesi.add(2, "Gizem")
        isimListesi.add(3,"Atlas")
        println(isimListesi.get(3))

        val karisikListe = arrayListOf<Any>()
        karisikListe.add("Gizem")
        karisikListe.add(3)
        karisikListe.add(true)

        val intArraylist = ArrayList<Int>()
        intArraylist.add(5)
        intArraylist.add(20)
        println(intArraylist.get(1))


        // Set

        println("------------  Set  ------------")

        // bir verinin birden fazla tekrarlamasını istemez

        val ornekDizi = arrayOf(7,8,8,8,9,8,9,10)
        println("index 1: " + ornekDizi[1])
        // veya "println("index 1: ${ornekDizi[1]}")" şeklinde de yazılabilir.
        println("index 2: " + ornekDizi[2])
        println("index 3: " + ornekDizi[3])
        println(ornekDizi.size) // 8

        val benimSet = setOf<Int>(7,8,8,8,9,8,9,10)
        println(benimSet.size) // 4

        // For Each = her biri
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Gözde")
        digerSet.add("Gözde")
        digerSet.add("Gözde")
        digerSet.add("Gizem")
        println(digerSet.size)

        digerSet.forEach {
            println(it)
        }

        // Map = haritalamak

        println("------------  Map  ------------")
        // Anahtar Kelime - Değer (Key - Value Pairing)

        val yemekDizisi = arrayOf("Elma", "Et", "Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)
        println(yemekDizisi[0] + " 'nın kalorisi : " + kaloriDizisi[0])

        val yemekKaloriMap = hashMapOf<String,Int>()
        // put = koymak
        yemekKaloriMap.put("Elma", 100)
        yemekKaloriMap.put("Et", 300)
        yemekKaloriMap.put("Tavuk", 200)

        println(yemekKaloriMap.get("Elma"))
        println(yemekKaloriMap.get("Et"))
        println(yemekKaloriMap.get("Tavuk"))

        val benimMapim = hashMapOf<String, String>()
        benimMapim.put("Örnek","Değer")


        val yeniMap = hashMapOf<String, Int>("Gözde" to 23, "Gizem" to 30)
        println(yeniMap.get("Gizem"))



        // Matematiksel İşlemler

        println("------------  Matematiksel İşlemler  ------------")

        var sayi = 8
        println(sayi) // 8
        sayi = sayi + 1
        println(sayi) // 9
        sayi++
        println(sayi) // 10
        sayi--
        println(sayi) // 9

        var digerSayi = 10

        println(digerSayi > sayi) // true

        println(digerSayi > sayi && 2 > 3) // false

        println(digerSayi > sayi || 2 > 3) // true


        // Remainder ( Kalanı bulmak )

        println(10%3) // 1
        println(10%2) // 0

    }
}
