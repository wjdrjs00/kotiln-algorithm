package 백준.solved.class2

// https://www.acmicpc.net/problem/2292

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()

    var count = 1
    var room = 1

    while (n > room) {
        room += 6 * count
        count++
    }

    print(count)
}