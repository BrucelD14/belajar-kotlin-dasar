//extension function, kemampuan menambahkan function pada tipe data yang sudah ada
//extension function, fitur yang sangat powerfull, bijaklah menggunakannya karna akan sulit dimengerti
//cara membuat dan contoh extension function

fun String.hello(): String = "Hello $this"
//cara membuat extension function seperti diatas
//fun kemudian tipe data lalu titik dan nama function

fun String.printHello(): Unit = println("Hello $this")

fun String.hola(): Unit = println("Holaa $this")

fun main() {

    val name = "Brucel"

    println(name.hello())

    name.printHello()

    "Duta".printHello()

    "Samudera".hola()

}
//Biasanya digunakan untuk data milik orang lain yang sudah tidak bisa diubah

