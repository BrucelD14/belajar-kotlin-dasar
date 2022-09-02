//Untuk mempermudah mengembalikan nilai dalam if & when
//contoh penggunaanya

fun main() {

    fun sayHello(name: String = ""): String {
        return when(name){
            "" -> "Hello Broh"
            else -> "Hello $name"
        }
//        return if (name == ""){
//            "Hello Broh!"
//        }else{
//            "Hello $name"
//        }
    }

    println(sayHello())
    println(sayHello("Brucel"))

}
//cara diatas dibuat agar lebih sederhana
