package 백준.solved.class2

// https://www.acmicpc.net/problem/2164

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val cards = ArrayDeque<Int>()

    for (i in 1..n) {
        cards.add(i)
    }

    while (cards.size > 1) {
        cards.removeFirst()
        cards.addLast(cards.removeFirst())
    }

    val lastCard = cards.first()  // 마지막 남은 카드
    println(lastCard)
}

/*
다른 풀이방법
Josephus(요세푸스 문제)
접근 방법
- N이 1인 경우, 답은 1입니다.
- N이 2인 경우, 답은 2입니다.
- 일반적인 경우:
    N이 2의 거듭제곱이면 마지막 남는 카드는 N입니다.
    그렇지 않으면 N보다 작은 가장 큰 2의 거듭제곱을 찾고, 이를 L이라 하면, 마지막 남는 카드는 2×(N−L)+1입니다.

예제
N=6인 경우:
- 6보다 작은 가장 큰 2의 거듭제곱은 4입니다.
- L = 4
- 마지막 남는 카드 번호는 2×(6−4)+1=5

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()

    // 2의 거듭제곱 중 n보다 작거나 같은 최대값 찾기
    var largestPowerOfTwo = 1
    while (largestPowerOfTwo * 2 <= n) {
        largestPowerOfTwo *= 2
    }

    // 남은 카드 계산
    val lastCard = 2 * (n - largestPowerOfTwo) + 1

    println(lastCard)
}
 */