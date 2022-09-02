//Data Array adalah data yang berisi kumpulan data
//Data array hanya berisi kumpulan data yang sama
//array bersifat statis dan tak berubah
//data array tidak bisa ditambah ataupun dikurangi
//ukuran data array harus diatur dari awal

fun main() {

    val names: Array<String> = arrayOf("Brucel", "Bintang", "Amel")
//     Membuat data array menggunakan kata kunci Array

    names.set(0, "Duta")
//    cara diatas untuk mengubah isi data
//    caranya set(index, value)

    println(names[0])
//    cara diatas untuk menampilkan data ke berapa
//    data pertama itu dimulai dari 0

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])
//    contoh array Int

//    contoh array null
    val members: Array<String?> = arrayOfNulls(4)
    members[0] = "Brucel"
    members[1] = "Brucel"
    members[2] = "Brucel"
    members[3] = "Brucel"
    println(members[0])
}

