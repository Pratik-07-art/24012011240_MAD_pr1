fun addition(a: Int, b: Int): Int {
    return a + b
}

fun subtraction(a: Int, b: Int): Int {
    return a - b
}

fun multiplication(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    print("Enter first number: ")
    val num1 = readLine()!!.toInt()
    print("Enter second number: ")
    val num2 = readLine()!!.toInt()
    println("Addition of $num1, $num2 is ${addition(num1, num2)}")
    println("Subtraction of $num1, $num2 is ${subtraction(num1, num2)}")
    println("Multiplication of $num1, $num2 is ${multiplication(num1, num2)}")
    println("Division of $num1, $num2 is ${division(num1, num2)}")
}