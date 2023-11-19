package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun main () {
    val x = 999
    val y = 0

    try{
        println("Division of $x and $y is: ${x/y}")
    } catch (exception: ArithmeticException) {
        println("Exception is handled...")
        println("$x and $y cannot be divided!!")
    }
}