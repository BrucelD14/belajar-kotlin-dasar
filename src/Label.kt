//label = penanda
//semua expression bisa diberi label
//membuatnya = nama label diikuti tanda @ (tanpa sepasi)

fun labelBreak(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (i > 5) {
                break@loopI
            }
            println("$i * $j = ${i * j}")

        }
    }
}

fun labelContinue(){
    loopI@ for (i in 1..10){
        loopJ@ for (j in 1..10){
            if (j == 5){
                continue@loopI
            }
            println("$i * $j = ${i * j}")
        }
    }
}

fun main() {

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@{
        if (it == "") {
            return@test
        } else {
            println("Brucel")
        }
    }

}
//saat terdesak barulah gunakan label

//bisa digunakan untuk integrasi dengan break, continue, return
//penggunaannya seperti diatas
