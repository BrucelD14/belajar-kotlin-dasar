//Infix notation, biasa dilakukan di operasi matematika
//melakukan operasi terhadap 2 data
//hampir semua operasi matematika adalah infix notation
//tidak wajib menggunakan titik untuk membuatnya
//harus menjadi function extension
//harus memiliki 1 parameter
//parameternya tidak boleh varargs dan tidak boleh ada nilai default

infix fun String.to(type: String): String {
    if(type == "UP") {
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

fun main() {

    val result = "Brucel Duta" to "UP"
    println(result)

}
//contoh infix notation
