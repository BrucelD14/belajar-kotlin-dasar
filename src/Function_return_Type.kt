//Function yang mengembalikan data
//wajib menuliskan tipe data kembalian dari function
//wajib mengembalikan data jika dibuat data kembaliannya
//untuk mengembalikan data menggunakan keyword return diikuti dengan datanya

fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (b == 0){
        return 0
    } else if (a == 0){
        return 0
    } else{
        val result = a / b
        return result
    }
}
//return juga bisa berada diblok if else

fun main() {

    println(jumlahkan(10, 10))
    println(jumlahkan(100, 200))

    val result = jumlahkan(150, 300)
    println(result)

    val result2 = jumlahkan(7, 90)
    println(result2)

    println(bagi(250, 25))
    println(bagi(350, 0))
    println(bagi(0, 500))
}
//contoh function return type

