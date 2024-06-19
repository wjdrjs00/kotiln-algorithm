package 백준.solved.class2

fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val gcd = gcd(a, b)
    val lcm = a * b / gcd

    println(gcd)
    println(lcm)
}

// 유클리드 호제법을 이용한 최대공약수 함수
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
