//dafault parameter cocok untuk jenis parameter yang sekiranya tidak wajib diisi

fun hello(firstName: String, lastName: String? = null){
//    cara diatas untuk membuat default parameter
//    default parameter agar parameternya tidak wajib diisi

    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {

    hello("Brucel")
    hello("Duta", "Samudera")
    hello("Ntahlah")

}
//jenis function yang tidak mengembalikan nilai

