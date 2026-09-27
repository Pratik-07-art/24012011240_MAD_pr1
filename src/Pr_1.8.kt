import java.util.Arrays
fun main() {
    val a = intArrayOf(10, 90, 60, 80, 100)
    println("Array using intArrayOf():")
    println(a.joinToString())
    val b = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println("2D Array using deepToString():")
    println(Arrays.deepToString(b))
    println("2D Array using contentDeepToString():")
    println(b.contentDeepToString())
    println("Using range:")
    for (i in 0..4) {
        print("${a[i]} ")
    }
    println()
    println("Using downTo:")
    for (i in 4 downTo 0) {
        print("${a[i]} ")
    }
    println()
    println("Using until:")
    for (i in 0 until 5) {
        print("${a[i]} ")
    }
    val numbers = intArrayOf(56, 23, 49, 12, 2)
    println()
    println("Before sorting:")
    println(numbers.joinToString())
    numbers.sort()
    println("After sorting using built-in function:")
    println(numbers.joinToString())
    val numbers2 = intArrayOf(56, 23, 49, 12, 2)
    println("Before sorting without built-in function:")
    println(numbers2.joinToString())
    for (i in 0 until 5) {
        for (j in i + 1 until 5) {
            if (numbers2[i] > numbers2[j]) {
                val temp = numbers2[i]
                numbers2[i] = numbers2[j]
                numbers2[j] = temp
            }
        }
    }
    println("After sorting without built-in function:")
    println(numbers2.joinToString())
}