package 백준.solved.class2

import kotlin.math.sqrt

// https://www.acmicpc.net/problem/1978


fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val nCount = readLine().split(" ").map { it.toInt() }
    var result = 0

    for (num in nCount) {
        if (isPrime(num)) {
            result++
        }
    }

    print(result)
}


// 소수판별 로직
fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}