class Matrix(val rows: Int, val columns: Int) {
    val data = Array(rows) { IntArray(columns) }
    operator fun plus(other: Matrix): Matrix {
        val result = Matrix(rows, columns)
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                result.data[i][j] = data[i][j] + other.data[i][j]
            }
        }
        return result
    }
    operator fun minus(other: Matrix): Matrix {
        val result = Matrix(rows, columns)
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                result.data[i][j] = data[i][j] - other.data[i][j]
            }
        }
        return result
    }
    operator fun times(other: Matrix): Matrix {
        val result = Matrix(rows, other.columns)
        for (i in 0 until rows) {
            for (j in 0 until other.columns) {
                for (k in 0 until columns) {
                    result.data[i][j] += data[i][k] * other.data[k][j]
                }
            }
        }
        return result
    }
    override fun toString(): String {
        var result = ""
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                result += data[i][j].toString() + " "
            }
            result += "\n"
        }
        return result
    }
}
fun main() {
    val matrix1 = Matrix(2, 2)
    matrix1.data[0][0] = 1
    matrix1.data[0][1] = 2
    matrix1.data[1][0] = 3
    matrix1.data[1][1] = 4
    val matrix2 = Matrix(2, 2)
    matrix2.data[0][0] = 5
    matrix2.data[0][1] = 6
    matrix2.data[1][0] = 7
    matrix2.data[1][1] = 8
    println("Matrix 1:")
    println(matrix1)
    println("Matrix 2:")
    println(matrix2)
    println("Addition:")
    println(matrix1 + matrix2)
    println("Subtraction:")
    println(matrix1 - matrix2)
    println("Multiplication:")
    println(matrix1 * matrix2)
}