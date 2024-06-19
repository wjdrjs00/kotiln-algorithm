package 백준.solved.class2

// https://www.acmicpc.net/problem/10814

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val user = mutableListOf<Triple<Int, String, Int>>()

    repeat(n) { index ->
        val (age, name) = readLine().split(" ")
        user.add(Triple(age.toInt(), name, index))
    }

    user.sortWith(compareBy({ it.first }, { it.third }))

    user.forEach {
        println("${it.first} ${it.second}")
    }
}


/*
더 개선된 풀이방법 (data class 사용)
data class User(val age: Int, val name: String, val order: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine()!!.toInt()
    val users = mutableListOf<User>()

    repeat(n) { index ->
        val (age, name) = readLine().split(" ")
        users.add(User(age.toInt(), name, index))
    }

    users.sortWith(compareBy({ it.age }, { it.order }))

    users.forEach {
        println("${it.age} ${it.name}")
    }
}
 */