//Primary Constructor
class Human(): MakhlukHidup(), Comparable<Human>, Pegawai {
    //Private   -> Hanya bisa diakses oleh member di class yang sama
    //Protected -> Hanya bisa diakses oleh member di class yang sama dan turunannya
    //Public    -> Bisa diakses dari mana saja asalkan dalam satu project
    //Internal  -> Bisa diakses dari mana saja asalkan dalam satu project kecuali beda module

    val warnaRambut = "Pirang"

    override val isBernafas: Boolean
        get() = super.isBernafas

//    var alamat: String = "Bogor"
//        get() = "Saya tinggal di $field"
//        set(value) {
//            field = "Tempat tinggal saya di $value"
//        }

    init {
        isBernafas
//        println("Sebuah object Human dengan nama $name sudah dibuat")
    }

    //Secondary Constructor
    constructor(name: String, age: Int) : this() {
        println("Hii $name")
    }

//    constructor(name: String, nohp: String, alamat: String){
//
//    }

    override fun compareTo(other: Human): Int {
        if(this.warnaRambut == other.warnaRambut){
            return 1
        }else{
            return 0
        }
    }

    override fun publicSpeaking() {

    }

    override fun berdiskusi() {

    }
}