package 백준.solved.class2

// https://www.acmicpc.net/problem/10828

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()  // 명령의 수
    val stack = ArrayDeque<Int>() // 스택 구현
    val output = StringBuilder()  // 출력을 효율적으로 모으기 위한 StringBuilder

    repeat(n) {
        val command = readLine()!!.split(" ")
        when (command[0]) {
            "push" -> {
                val x = command[1].toInt()
                stack.addLast(x)
            }

            "pop" -> {
                output.append(if (stack.isEmpty()) -1 else stack.removeLast()).append('\n')
            }

            "size" -> {
                output.append(stack.size).append('\n')
            }

            "empty" -> {
                output.append(if (stack.isEmpty()) 1 else 0).append('\n')
            }

            "top" -> {
                output.append(if (stack.isEmpty()) -1 else stack.last()).append('\n')
            }
        }
    }

    print(output)
}
