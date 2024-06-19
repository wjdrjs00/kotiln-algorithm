package 백준.solved.class2

// https://www.acmicpc.net/problem/2798

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val cardList = readLine()!!.split(" ").map { it.toInt() }.sorted()

    var closestSum = 0

    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j + 1 until n) {
                val sum = cardList[i] + cardList[j] + cardList[k]
                if (sum > m) {
                    break
                }
                if (sum > closestSum) {
                    closestSum = sum
                }
            }
        }
    }

    print(closestSum)
}