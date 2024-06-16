package 백준.solved.class2

// https://www.acmicpc.net/problem/1929

import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(" ").map { it.toInt() }

    for (i in m..n) {
        if (isPrime(i)) {
            println(i)
        }
    }
}

// 소수판별 로직
private fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}


/*
다른 풀이방법 (에라토스트네스의 체 알고리즘 사용)

fun main() = with(System.`in`.bufferedReader()) {
    val (m, n) = readLine().split(" ").map { it.toInt() }
    val isPrime = BooleanArray(n + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    // 에라토스테네스의 체 알고리즘
    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..n step i) {
                isPrime[j] = false
            }
        }
    }

    // 결과 출력
    for (i in m..n) {
        if (isPrime[i]) {
            println(i)
        }
    }
}
 */