import java.util.function.Predicate

fun main(){
//    Array
//    Linked List (SLL DLL)
//    List

//    ArrayList
//    1. Dinamis
//    2. Memiliki struktur layaknya Array


//    val daftar = arrayListOf(
//        Human("Naufal","0811","Bogor"),
//        Human("Senno","0822","Jakarta"),
//        Human("Andi","0822","Jogja")
//    )

//    daftar.removeIf{ seseorang ->
//        seseorang.nohp == "0811"
//    }

//    daftar.forEach {
//        println("Nama: ${it.name} | Nohp :${it.nohp}")
//    }



//    daftarNama.removeIf
//
//    daftarNama.add("Cecil")
//    daftarNama.removeAt(0)

//    for(bil in 1..10){
//        println(bil)
//    }

    val warnaLampu = "Jingga"

//    when(warnaLampu){
//        "Merah" -> println("Berhenti")
//        "Kuning" -> println("Bersiap")
//        "Hijau" -> println("Jalan")
//        else -> {
//            println("Warna tidak dikenal")
//        }
//    }

    val nilai = 65

    when{
        nilai >= 80 -> println("Nilai A")
        nilai in 70..79 -> println("Nilai B")
        nilai in 60..69 -> println("Nilai C")
        else -> println("Nilai D")
    }

}