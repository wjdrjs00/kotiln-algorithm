package 백준.solved.class2

// https://www.acmicpc.net/problem/4153

fun main() = with(System.`in`.bufferedReader()) {
    fun Int.square(): Int = this * this

    while (true) {
        val (x, y, z) = readLine().split(" ").map { it.toInt() }

        if (x == 0 && y == 0 && z == 0) break

        val sides = listOf(x, y, z).sorted()
        if (sides[0].square() + sides[1].square() == sides[2].square()) {
            println("right")
        } else {
            println("wrong")
        }
    }
}