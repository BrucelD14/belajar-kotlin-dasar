const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

//contoh data constan
//data constan harus menggunakan val
//data constan adalah immutable yang bersifat global/bisa dibuka dimana saja
//biasanya nama data constan menggunakan upper case

fun main() {

    val firstname = "Brucel"
    val age = 18
    println(firstname)
    println(age)
//    contoh variable yang immutable(tak bisa diubah)

    var lastname = "Samudera"
    println(lastname)
//    contoh variable yang mutable(bisa diubah)

    var name: String? = null
    name = "Duta"
    println (name)
    println(name?.length)
//    contoh data null/kosong
//data null/kosong tidak direkomendasikan

    println("$APPLICATION : $VERSION")

}

//direkomendasikan menggunakan variable yang immutable karena lebih aman
//variable gak boleh kosong, harus ada isinya dan tidak direkomendasi