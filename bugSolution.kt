```kotlin
fun calculate(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: Division by zero")
        0 // Or any appropriate default value
    }
}

fun main() {
    val result1 = calculate(10, 0)
    println(result1) // Output: Error: Division by zero, 0
    val result2 = calculate(10,2)
    println(result2) //Output: 5
}
```