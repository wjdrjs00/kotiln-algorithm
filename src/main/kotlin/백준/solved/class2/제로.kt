package 백준.solved.class2

// https://www.acmicpc.net/problem/10773

fun main() = with(System.`in`.bufferedReader()) {
    val k = readLine()!!.toInt()
    val stack = ArrayDeque<Int>()

    repeat(k) {
        val command = readLine()!!.toInt()
        if (command == 0) {
            stack.removeLast()
        } else {
            stack.addLast(command)
        }
    }

    print(stack.sum())
}