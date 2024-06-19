package 백준.solved.class2

// https://www.acmicpc.net/problem/2231

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    var result = 0

    for (i in 1..n) {
        val sum = i + i.toString().map { it - '0' }.sum()
        if (sum == n) {
            result = i
            break
        }
    }

    println(if (result > 0) result else 0)
}
