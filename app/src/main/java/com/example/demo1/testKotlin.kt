package com.example.demo1

fun main (){
    print("Hello world")


    var a : Int
    a = 5
    val b = 2
    var c = a + b

    val mess : String = "Tong hai so $a vaf $b la : $c"

    println(mess)

    // chia
    val x = 10
    val y = 5.5f
    val kq = chia(x,y)
    println(kq)

    // khai bao va su dung mang
    val arrX = intArrayOf(1,2,3,4,5,6)
    val arrY = arrayOf(1.5f, "A", 1)
    println("Giá trị đầu tiên của mảng arrX: ${arrX[0]}")
    println("Giá trị đầu tiên của mảng arrY: ${arrY[0]}")
}

fun chia(x : Int, y : Float): String{
    if(y == 0f){
        return  "so y khong duoc = 0"
    }
    val thuong = x / x
    return "Thong $x / $y = $thuong"
}