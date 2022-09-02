//Named argument, fitur dimana bisa menyebutkan nama parameter saat memanggil function
//jadi tidak wajib mengetahui posisi tiap argument

fun fullName(
        firstName: String,
        middleName: String,
        lastName: String

) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {

    fullName("Brucel", "Duta", "Samudera")
    fullName(
            lastName = "Samudera",
            firstName = "Brucel",
            middleName = "Duta"
    )

}
//jika parameter biasa, memasukkan parameternya harus berurutan sesuai functionnya
//sedangkan kalo named argumen, memasukkan parameternya tidak harus berurutan tetapi harus disebut nama parameternya
//diatas adalah contoh named argument
//parameter gak bisa dicampur
//Jenis function yang tidak mengembalikan nilai
