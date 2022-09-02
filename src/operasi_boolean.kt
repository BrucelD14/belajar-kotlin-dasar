//digunakan untuk menggabungkan 2 nilai boolean
//berisi operasi boolean
//contoh operasi boolean

fun main() {

    val nilaiUjian = 80
    val nilaiAbsen = 80
    val nilaiExtra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
//    val apakahLulus = ((apakahLulusUjian && apakahLulusAbsen) && apakahLulusExtra)
    println(apakahLulus)
//    kalau menggunakan && 2 variabel tersebut harus true agar hasilnya true
//    jika operasinya lebih dari 1, dia akan mulai dioperasi secara berturut
//    operasi 1 dan operasi 2 dulu terus selanjutnya
//    tidak masalah jika lebih dari 1 tipe operasi seperti && atau || atau !



}

