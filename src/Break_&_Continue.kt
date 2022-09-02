//break & continue, keyword yang bisa digunakan di semua perulangan kotlin
//break digunakan untuk menghentikan seluruh perulangan
//continue untuk menghentikan perulangan yg sedang berjalan, dan langsung melanjutkan ke perulangan selanjutnya

fun main() {

    var i = 0

    while (true) {
        println("Hello ke $i")
        i++

        if (i > 1000) {
            break
        }

    }
//    contoh menggunakan break untuk menghentikan perulagan
//    syntax diatas contohnya apabila perulangan lebih dari 1000 maka akan langsung berhenti

    for (i in 1..1000){

        if (i % 2 == 0){
            continue
        }

        println("angka ke $i")
    }
//contoh penggunaan continue
//    syntax diatas contohnya apabila data perulangan habis dibagi 2,
//    maka langsung berhenti dan lanjut ke perulangan berikutnya

}

