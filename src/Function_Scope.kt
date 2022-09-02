//function scope, ruang lingkup dimana sebuah function bisa diakses
//funtion didalam function untuk membatasi penggunaan function

fun satu(){
//    error
//    contohHelloWorld()

}

fun dua(){
//    error
//    contohHelloWorld()
}

fun main() {

    fun contohHelloWorld(){
    println("Hello World")
    }

    contohHelloWorld()

}
//jika functionnya sejajar dengan fun main, maka functionnya dapat diakses di file kotlin manapun
//contohnya seperti diatas, function tesebut hanya bisa diakses melalui fun main itu saja
//ini untuk menghindari bentrok antar function
