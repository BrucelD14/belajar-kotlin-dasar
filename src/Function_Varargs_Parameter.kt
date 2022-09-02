//Varargs = Variabel Argument
//Varargs, datanya bisa menerima lebih dari satu input. Semacam array
//bisa digunakan di parameter posisinya akhir
//membuatnya menggunakan keyword vararg

fun hitungTotal(name: String, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total

}

fun main() {

    val result = hitungTotal("Brucel", 10, 20, 10, 20)
    println(result)

}
//Vararg harus di parameter terakhir
//varargs tidak terbatas datanya
//Vararg boleh kosong

