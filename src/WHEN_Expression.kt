//berisi tentang when expression
//contoh when expression dan cara membuatnya
//digunakan untuk percabangan
//when expression sangat sederhana
fun main() {

    var nilai = "A"

    when (nilai){
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Nice")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Damn!!!")
        }
    }
//contoh when expression

    when(nilai){
//        if(nilai == "A" || nilai == "B" || nilai == "C")
        "A", "B", "C" -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf, anda tidak lulus")
        }
    }
//contoh when expression multiple option

    nilai = "E"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("Selamat Anda Lulus")
        !in nilaiLulus -> println("MAAF. Tidak Lulus")
    }
//contoh when expression in

    val name = "Brucel"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is Not String")
    }
//contoh when expression is

    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Nice")
        nilaiUjian > 80 -> println("Good job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Jangan Menyerah, Coba lagi")
    }
//contoh when expression sebagai pengganti if else

}

