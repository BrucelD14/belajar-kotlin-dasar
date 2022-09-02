//function, first class citizens
//lambda expression, function yang tidak memiliki nama
//tidak perlu menggunakan keyword fun dan nama functionnya

fun toUpper(value: String): String = value.toUpperCase()

fun main() {

    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Brucel", "Duta")
    println(result)
//contoh lambda expression

    val sayHello: (String) -> String = {
        "Hello $it"
    }
//    cara menggunakan keyword it untuk mempersingkat lambda expression
//    hanya berlaku untuk satu parameter

    println(sayHello("Brucel"))

    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Brucel Samudera"))
//    contoh method reperence
//    funnya ada diatas
//    untuk membuat lambda expression sesuai dengan fun yang sudah ada

}

