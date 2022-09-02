//recursive function memiliki keterbatatasan
//jika recursive yang kita buat memanggil dirinya terlalu dalam/terlalu banyak
// maka akan terjadi error stack overflow
//solusinya adalah menggunakan tail recursive function
//tetapi ada syaratnya
//seperti dibawah contohnya

fun main() {

    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0){
            display(value - 1)
        }
    }

    tailrec fun factorialRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else ->factorialRecursive(value - 1, total * value)
        }
    }

    println(factorialRecursive(10))

}
//gunakan keyword tailrec diawal fun untuk membuatnya menjadi tail recursive funtion
// fun yang mau dijadiin tail recursive harus hanya memanggil fun itu sendiri tidak boleh ada tambahan
