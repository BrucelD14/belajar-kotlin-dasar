//jika higher order function dilakukan secara terus menerus/banyak sekali perulangan
//maka performanya akan menurun
//mengubah higher order functon menjadi inline function
//inline function, higher order function akan di duplicate agar tidak terjadi pemanggilan lambda yang berulang-ulang

inline fun hello(name: () -> String): String {
    return "hello ${name()}"
}

inline fun namaku(
        firstName: () -> String,
        noinline lastname: () -> String
): String {
    return "Hola ${firstName()} ${lastname()}"
}

fun main() {

    for (i in 0..100) {
        println(hello { "Duta" })
    }

    for (i in 0..50) {
        println(namaku({ "Brucel" }, { "Duta" }))
    }

}
//saat membuat function inline maka semua parameternya menjadi inline
//gunakan keyword noinline untuk membuat 1/beberapa parameter menjadi objek biasa

