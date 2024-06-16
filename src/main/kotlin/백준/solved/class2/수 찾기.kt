package 백준.solved.class2


// https://www.acmicpc.net/problem/1920

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val nSet = readLine().split(" ").map { it.toInt() }.toHashSet()
    val m = readLine()!!.toInt()
    val mArray = readLine().split(" ").map { it.toInt() }

    val output = StringBuilder()
    mArray.forEach { num ->
        if (num in nSet) {
            output.append("1\n")
        } else {
            output.append("0\n")
        }
    }
    print(output)
}