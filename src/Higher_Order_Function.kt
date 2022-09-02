//Higher order function, function yang menggunakan function sebagai parameter atau mengembalikan function
//berguna ketika ingin membuat function yang general dan input yang fleksibel
//menjadikan lambda sebagai parameter

fun main() {

    fun hello(name: String, transformer: (String) -> String) : String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Brucel", lambdaUpper))
//  contohnya seperti diatas

    println(hello("Duta", {value: String -> value.toLowerCase()}))
//    atau cara simpelnya seperti diatas

    val result = hello("Brucel") {value: String ->
        value.toLowerCase()
    }
    println(result)
//    bisa juga digunakan trailing lambda seperti diatas
//    tapi hanya untuk lambda yang ada di parameter terakhir

}

