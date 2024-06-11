package 이코테.그리디

/*
예제 3-1. 거스름돈
당신은 음식점의 계산을 도와주는 점원이다.
카운터에는 거스름돈으로 사용할 500원, 100원, 50 원, 10원짜리 동전이 무한히 존재한다고 가정한다.
손님에게 거슬러 줘야 할 돈이 N원일 때 거슬러 줘야 할 동전의 최소 개수를 구하라.
단, 거슬러 줘야 할 돈 N은 항상 10의 배수이다.
 */
fun main() = with(System.`in`.bufferedReader()) {
    var input = readLine().toInt()
    val money = intArrayOf(500, 100, 50, 10)
    var count = 0

    money.forEach {
        // 현재 금액을 동전으로 나눈 몫을 count에 더하고, 나머지를 다시 input에 저장
        count += input / it
        // 나머지를 다시 input에 저장
        input %= it
    }

    println(count)
}

/*
    풀이 1
    for (i in money.indices) {
        count += input / money[i]
        input %= money[i]
    }

    풀이 2
    money.forEach {
        count += input / it
        input %= it
    }

    풀이 3
    forEachIndexed를 사용하면 index를 사용할 수 있다.
    money.forEachIndexed { _, i ->
        count += input / i
        input %= i
    }
 */