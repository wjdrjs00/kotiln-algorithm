package 백준.solved.class2

// https://www.acmicpc.net/problem/2839

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt() // 설탕의 총kg
    var count = 0 // 설탕을 담은 봉지의 개수

    var sugar = n

    while (sugar >= 0) {
        if (sugar % 5 == 0) {
            count += sugar / 5
            print(count)
            return
        }
        sugar -= 3
        count++
    }
    print(-1)
}