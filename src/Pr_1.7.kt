fun factorial(n: Int): Int {
    if (n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}
fun main() {
    print("Enter Number: ")
    val num = readLine()!!.toInt()
    println("Factorial of $num = ${factorial(num)}")
}