//Recursive function, function yang memanggil function dirinya sendiri
//kasus yang biasa menggunakan recursive function adalah "factorial"
//ciri recursive, memanggil dirinya sendiri dalam fun nya

fun main() {

    fun factorialLoop(value: Int): Int {
        var result = 1
        for (i in value downTo 1) {
         result *= i
        }
        return result
    }
    println(factorialLoop(10))
//diatas contoh mengerjakan factorial menggunakan loop

    fun factorialRecursive(value: Int): Int {
        return when(value){
            1 -> 1
            else -> value * factorialRecursive(value - 1)
        }
    }
    println(factorialRecursive(10))
}
//diatas mengerjakan factoial menggunakan fun recursive
//ada tanda recursive call di sebelah kiri syntax

//mengerjakan factorial menggunakan loop dan recursive function
