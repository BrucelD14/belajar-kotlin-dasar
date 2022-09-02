//cara membuat data string
fun main() {
    var firstname: String = "Brucel"
    var lastname: String = "Duta Samudera"
//    untuk satu baris string menggunakan tanda titik dua

    var addres: String = """
        Jalan in aja, Dusun IV, Gunung Para II,
        Kecamatan Dolok Merawan,
        Kabupaten Serdang Bedagai,
        Sumatera Utara,
        Indonesia
    """.trimIndent()
//    Untuk string yang lebih dari satu baris menggunakan titik dua 3kali
//    dan diakhirnya ditambahkan trimindent agar tidak ada jarak pada string

    println(firstname)
    println(lastname)
    println(addres)

    var fullname: String = firstname + " " + lastname
    println(fullname)
//syntax diatas untuk menggabungkan firsname dan lastname
//tambahkan spasi antara firstname dan lastname agar ada jarak antar kata
//tapi cara menggabungkan string diatas tidak disarankan

    var fullName: String = "$firstname $lastname"
    println(fullName)
//contoh menggabungkan string menggunakan string templete
//tapi contoh diatas hanya untuk karakter sederhana/sedikit

    var desc: String = "$fullName.length = ${fullName.length}"
    println(desc)
//contoh menggabungkan string untuk string yang lebih komplex
//dan cara mengetahui jumlah huruf/characternya

}
