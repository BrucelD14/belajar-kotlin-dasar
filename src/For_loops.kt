//belajar for loops kotlin
//for loops adalah perulangan
//for loops digunakan untuk melakkukan perulangan iterasi dari data iterator (array, string, DLL)
fun main() {

    val array = arrayOf("Brucel", "Duta", "Samudera", "Liaa", "Togok", "gomel")

    var total = 0

    for (name in array) {
        println(name)
        total++
    }
//for loops menggunakan keyword for
//    syntax diatas dilakukan untuk mengulang data array
//    jadi untuk menampilkan data tidak harus ditulis satu satu

    println("Total perulangan = $total")
//digunakan untuk mengetahui terjadi berapa kali pengulangan

    for (i in 0..100 ) {
        println(i)
    }
//    untuk pengulangan data range, diatas contohnya mengulang data dari 0-100

    for (n in 0..100 step 4) {
        println(n)
    }
//step untuk memberi perintah langkah
//    diatas contohnya ulang dari 0-100 langkah 4

    for (o in 60 downTo 0 step 3 ) {
        println(o)
    }
//    down to untuk mengulang dari atas ke bawah atau contohnya dari 60 ke 0

    val ukuranArray = array.size - 1
    for (z in 0..ukuranArray) {
        println("Index $z = ${array.get(z)}")
    }
//bisa juga dikombinasikan seperti contoh diatas
//    kombinasi antara data range dan array
//    belum terlalu ngerti, cari tau terosss

}

