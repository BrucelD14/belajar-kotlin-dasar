//kadang berisi data angka yang berurutan dalam jumlah yang banyak
//membuat data range menggunakan tanda ..(titik dua kali)
//contoh data range

fun main() {

//    val range = 1..100
//data range artinya data range 1 sampai 100

    val range = 100 downTo 1 step 2
//    syntax diatas untuk membuat data range dari 100 ke 1
//    step untuk membuat data turunnya 2 angka

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)
}

