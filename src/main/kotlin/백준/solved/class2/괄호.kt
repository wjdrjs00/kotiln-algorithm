package 백준.solved.class2

// https://www.acmicpc.net/problem/9012

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine()!!.toInt()

    for (i in 0 until t) {
        val ps = readLine()!!
        println(if (checkVps(ps)) "YES" else "NO")
    }
}

fun checkVps(ps: String): Boolean {
    val stack = mutableListOf<Char>()

    for (char in ps) {
        if (char == '(') {
            stack.add(char)
        } else {
            if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '(') {
                return false
            }
        }
    }

    return stack.isEmpty()
}

// 다른 풀이 방법
// ArrayDeque는 스택과 큐 모두로 사용할 수 있는 더 효율적인 자료 구조
fun checkVpsWithDeque(ps: String): Boolean {
    val stack = ArrayDeque<Char>() // 더 효율적인 스택 자료 구조 사용

    for (char in ps) {
        if (char == '(') {
            stack.addLast(char) // 스택에 추가
        } else {
            if (stack.isEmpty() || stack.removeLast() != '(') {
                return false // 스택이 비어있거나 짝이 맞지 않으면 false 반환
            }
        }
    }

    return stack.isEmpty() // 모든 문자를 처리한 후 스택이 비어있으면 true 반환
}