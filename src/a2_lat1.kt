//latihan kotlin A2
fun main() {

    var a: Int = 10
    a = 20

    println("Nilai A=" + a)

    val b = 16
//    keyword val tidak bisa diubah variablenya
    println(b)

    println("masukkan nilai sisi")

    var sisi: Int = readLine()!!.toInt()
    var luas: Int ?
    luas = sisi * sisi * sisi
    println("luas kubus" + luas)

}

