package com.example.demo1.Lab1

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    do {
        println("-------------------------------- Menu --------------------------------")
        println("Chọn bài bạn muốn xem")
        println("1. Bài 2")
        println("2. Bài 3")
        println("3. Bài 4")
        println("4. Thoát")
        var luaChon: Int
        print("Nhập bài muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> bai2()
                2 -> bai3()
                3 -> bai4()
                4 -> exitProcess(0)
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)

}

fun bai2() {
    print("Nguyễn Duy Phong - PH36760\n")
    print("=========================\n")
    println("Quanh năm buôn bán ở mom sông")
    println("Nuôi đủ năm con với một chồng")
    println("\tlặn lội thân cờ khi quãng vắng")
    println("\teo sèo mặt nước buổi đò đồng")
    println("Một duyên hai nợ âu đành phận")
    println("Năm nắng mười mưa há chẳng công")
    println("\tCha mẹ thói đời \"ăn ở bạc\"")
    println("\tCó chồng hờ hững cũng như không")
}

fun bai3() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) {
        a = s.toDouble()
    }
    println("Nhập b:")
    s = readLine()
    if (s != null) {
        b = s.toDouble()
    }
    println("Tổng: " + (a + b))
    println("Hiệu: " + (a - b))
    println("Tích: " + (a * b))
    println("Thương: " + (a / b))
}

fun bai4() {

    do {
        println("------------------------------ Menu ------------------------------")
        println("10 bài ví dụ")
        println("1. Bài 1")
        println("2. Bài 2")
        println("3. Bài 3")
        println("4. Bài 4")
        println("5. Bài 5")
        println("6. Bài 6")
        println("7. Bài 7")
        println("8. Bài 8")
        println("9. Bài 9")
        println("10. Bài 10")
        println("0. Thoát")
        var luaChon: Int
        print("Nhập bài muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> vd1()
                2 -> vd2()
                3 -> vd3()
                4 -> vd4()
                5 -> vd5()
                6 -> vd6()
                7 -> vd7()
                8 -> vd8()
                9 -> vd9()
                10 -> vd10()
                0 -> exitProcess(0)
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)
}

fun vd1() {
    val foods = listOf("Bún bò", "Bún chả", "Bún riêu", "Bún đậu mắm tôm")
    for (food in foods) {
        println("Hôm nay ăn gì? ăn $food")
    }
}

fun vd2() {
    val foods = listOf("Bún bò Huế", "Bún chả", "Bún riêu", "Bún đậu mắm tôm")
    var indexFood = 1
    println("---------------- Menu ----------------")
    while (indexFood < foods.size) {
        for (food in foods) {
            println("${indexFood++} $food")
        }
    }
}

class Animal(var name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun vd3() {
    val zoo = Zoo(listOf(Animal("Hổ"), Animal("Sư tử"), Animal("Chó sói"), Animal("Báo")))

    for (animal in zoo) {
        println("Cẩn thận đó là một con ${animal.name}")
    }
}

val systemUsers: MutableList<String> = mutableListOf("Phong", "Thiên", "Long")
val sudoers: List<String> = systemUsers

fun addSystemUser(newUser: String) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<String> {
    return sudoers
}

fun vd4() {
    addSystemUser("Nam")
    println("Danh sách user: ${getSysSudoers().size}")
    var index = 1
    getSysSudoers().forEach { i ->
        println("Tên người dùng ${index++}: $i")
    }
}

val openIssues: MutableSet<String> =
    mutableSetOf("Phong", "Thiên", "Long")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "Đăng kí thành công." else "Tên đã tồn tại, yêu cầu bị từ chối."
}

fun vd5() {
    val aNewIssue: String = "Nam"
    val anIssueAlreadyIn: String = "Phong"

    println("$aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("$anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}

fun vd6() {
    val numbers = listOf(1,3,5,2,6,7,8,4,10)

    val positives = numbers.filter { x -> x %2 ==0 }

    val negatives = numbers.filter { y -> y %2 !=0 }

    println("Các số: $numbers")
    println("Số chia hết cho 2: $positives")
    println("Số không chia hết cho 2: $negatives")
}

fun vd7() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    println("Các số: $numbers")
    println("Nhân đôi: $doubled")
    println("Nhân ba: $tripled")
}

fun vd8(){
    val foods = listOf("Bún bò", "Bún chả", "Bún riêu", "Bún đậu mắm tôm", "Bánh tráng", "Bánh trưng", "Bánh giò")

    val first = foods.find { it.startsWith("Bún") }
    val last = foods.findLast { it.startsWith("Bún") }

    val second = foods.find { it.startsWith("Bánh") }
    val lastSecond = foods.findLast { it.startsWith("Bánh") }
    val nothing = foods.find { it.contains("Phở") }

    println("Từ đầu tiên bắt đầu bằng \"Bún\" là \"$first\"")
    println("Từ cuối cùng bắt đầu bằng \"Bún\" là \"$last\"")

    println("Từ đầu tiên bắt đầu bằng \"Bánh\" là \"$second\"")
    println("Từ cuối cùng bắt đầu bằng \"Bánh\" là \"$lastSecond\"")
    println("Từ đầu tiên chứa \"Phở\" là ${nothing?.let { "\"$it\"" } ?: "null"}")
}

fun vd9(){
    val numbers = listOf(1,3,5,2,6,7,8,4,10)

    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println("Các số: $numbers")
    println("Số đầu tiên $first")
    println("Số cuối cùng $last")
    println("Số chẵn đầu tiên $firstEven")
    println("Số lẻ cuối cùng $lastOdd")
}

fun vd10(){
    val numbers = listOf(1,3,5,2,6,7,8,4,10)

    val totalCount = numbers.count()
    val oddCount = numbers.count { it % 2 != 0 }
    println("Tổng các phần tử: $totalCount")
    println("Tổng các số lẻ: $oddCount")
}

