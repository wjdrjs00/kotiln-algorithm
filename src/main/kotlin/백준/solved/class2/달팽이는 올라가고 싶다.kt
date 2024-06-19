package 백준.solved.class2

// https://www.acmicpc.net/problem/2869

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, v) = readLine().split(" ").map { it.toInt() }
    val day = (v - b - 1) / (a - b) + 1
    print(day)
}