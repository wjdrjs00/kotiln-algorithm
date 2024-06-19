package 백준.solved.class2

// https://www.acmicpc.net/problem/11650

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val points = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (x, y) = readLine().split(" ").map { it.toInt() }
        points.add(Pair(x, y))
    }

    points.sortWith(compareBy({ it.first }, { it.second }))

    points.forEach {
        println("${it.first} ${it.second}")
    }
}
