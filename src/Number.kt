//cara membuat data number dan contohnya
fun main() {
    var tree: Int = 300
    var age: Byte = 25
//    contoh data number integer

    var sample: Float = 10.10F
    var banyak: Double = 1406.1111
//    contoh data number floating point

    var binary: Int = 0b0101010101
//    contoh literal/bilangan biner

    var price: Long = 705_000_300L
//    contoh underscore in number

    var priceInt: Int = price.toInt()

    var doubleBinary: Double = binary.toDouble()
//    contoh conversion

    println(age)
    println(sample)
    println(tree)
    println(banyak)
    println(binary)
    println(price)
    println(priceInt)
    println(doubleBinary)
}