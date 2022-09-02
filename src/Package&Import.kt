//package, tempat yang bisa digunakan untuk mengorganisir kode program yang kita buat
//menggunakan package untuk merapikan kode kotlin
//penamaan package menggunakan huruf kecil semua
//untuk membuat sub package gunakan tanda titik .
//contoh penamaan package
//com.xmalaka.belajar.util
//xmalaka.com adalah nama perusahaannya/company. biasanya dibalik
//belajar adalah nama package nya
//util adalah nama sub package

//untuk menggunakan file yang ada dalam package kita bisa gunakan import
//secara standar, file kotlin hanya bisa mengakses file kotlin lainnya
// yang berada dalam package yang sama
//saat mengimport kita bisa memilih bagian tertentu ataupun semua file
//berikut contohnya
//gunakan keyword import untuk mengimport file
//gunakan tanda bintang untuk mengimport semua file

//import com.xmalaka.belajar.util.sayHello

import com.xmalaka.belajar.util.*

fun main() {

    sayHello("Brucel")
    sayGoodBye("Duta")

}
