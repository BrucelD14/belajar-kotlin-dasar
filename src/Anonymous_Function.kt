//Anonymous Function, mirip dengan lambda tetapi menggunakan kata kunci fun

fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.toUpperCase()
        }
    }
//contoh anonymous fun

    println(hello("Brucel", upper))
    println(hello("", upper))

    println(hello("Samudera", fun (value: String): String{
        return value.toLowerCase()
    }))
//    contoh anonymous fun
//    tanpa dimasukkan ke variabel

}
//lamda tidak untuk fun yang komplek
//karena itu gunakanlah Anonymous Fun
