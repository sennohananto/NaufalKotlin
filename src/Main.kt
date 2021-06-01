
fun main(){
    //Non Null
    val name: String = "Naufal" //val -> immutable -> variablenya gabisa diubah
    var num: Int = 23

    //Nullable
    var age: Int? = null //var -> mutable -> variable nya BISA diubah

//  Dipaksakan
//  num = age

//    if(age !=null){
//        num = age
//    }

    age?.let {
        num = it
    }

    age?.let { sebuahNilai ->
        num = sebuahNilai
    }

//    println("Hasil : $num")

    fun sayHi(name: String = "No Name"){
        println("Hello $name")
    }

//    sayHi()

//    fun calculate(num1: Int, num2: Int): Int =
//        return num1 + num2
//    }

    fun calculate(num1: Int, num2: Int): Int = num1 + num2

//    println("Hasilnya adalah : ${calculate(3,2)}")

    val seseorang = "Naufal"

//    seseorang.sayHi()


//    val naufal = Human("Naufal")

//    println(naufal.alamat)
}

fun String.sayHi(){
    println("Hi $this")

}