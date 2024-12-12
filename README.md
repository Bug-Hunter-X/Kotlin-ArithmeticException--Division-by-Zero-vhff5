# Kotlin ArithmeticException: Division by Zero

This repository demonstrates a common Kotlin error: an `ArithmeticException` caused by division by zero.

The `bug.kt` file contains the erroneous code, which attempts to divide an integer by zero. The `bugSolution.kt` file shows how to handle this exception gracefully using a `try-catch` block.

## How to run

1. Clone the repository.
2. Open the project in your favorite Kotlin IDE (IntelliJ IDEA, Android Studio).
3. Run `bug.kt` to see the exception. 
4. Run `bugSolution.kt` to see the exception handled correctly.

## Solution

The best way to avoid this error is to add checks for zero before performing the division.