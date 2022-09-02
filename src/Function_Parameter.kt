//parameter adalah data yang dikirim dari luar function
//bisa menambahkan lebih dari satu parameter
//parameter tidak wajib ada di function
//wajib diisi jika function diberi parameter

fun sayHello(firstName:String, lastName:String?){
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}
//contoh parameter
//parameter harus diluar func

fun main() {

    sayHello("Brucel", "Liaa")
    sayHello("Duta", null)
    sayHello("Samudera", "Rezaa")

}
//ditulis null jika datanya null
//function yang tidak mengembalikan nilai
