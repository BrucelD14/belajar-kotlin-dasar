//Syntax ini berisi operasi matematika

fun main() {

    val result = 10.0 / 3.0
//    jika ingin hasilnya menjadi desimal atau sampai desimal tambahkan titik 0 pada angka
//    titik 0 berfungsi untuk merubah tipe data number menjadi Double
    println(result)

    val result2 = 10 + 10 / 2
//    komputer akan membaca data diatas sebagai operasi matematika
//    jadi tidak perlu risau
    println(result2)

    var total: Int = 0

    val barang1 = 100
    total += barang1
//    kalau diartikan yaitu total = total + barang1

    val barang2 = 200
    total += barang2
//    kalau diartikan yaitu total = total + barang2

    val barang3 = 300
    total += barang3
//    kalau diartikan yaitu total = total + barang3

    println(total)

    total++
//    artinya total = total + 1
    total--
//    artinya total = total - 1
    println(total)

    val suhu = -5
//    untuk membuat angka negatif
//    kalo positif itu default jadi tak perlu ditambah plus
    println(suhu)

    val sehat = true
    println(!sehat)
//    tanda seru untuk menunjukan kebalikan
//    atau membuat hasilnya menjadi kebalikannya
}

