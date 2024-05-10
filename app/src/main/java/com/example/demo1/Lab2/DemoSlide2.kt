//package com.example.demo1.Lab2
//
//fun main(args: Array<String>) {
//    //làm việc với safety
//
////    val tenSv : String? = "Nguyễn Duy Phong"
////    if(tenSv != null){
////        val maSV = getThongTin(tenSv!!)
////        println("Mã số sinh viên của $tenSv là $maSV")
////    }
//////    val maSV = getThongTin(tenSv!!)
////}
////
////fun getThongTin(tenSv: String): String? {
////    when (tenSv){
////        "Nguyễn Duy Phong" -> {return "PH36760"}
////        "Nguyễn Thiên Thiên" -> {return "PH12345"}
////        "Trần Hoàng Long" -> {return "PH56789"}
////    }
////    return ""
//
//    val sv1: SinhVien = SinhVien("Nguyễn Duy Phong", "PH36760", 9.5f)
//    val sv2: SinhVien = SinhVien("Nguyễn Thiên Thiên", "PH12345", 9.5f)
//    val sv3: SinhVien = SinhVien("Trần Hoàng Long", "PH45678", 9.5f, false, 20)
//
//    sv2.daTotNghiep = false
//    sv2.tuoi = 20
//
////    println(sv1.getThongTin())
////    println(sv2.getThongTin())
////    println(sv3.getThongTin())
//
//    //tạo và xử lý danh sách sinh viên
//    val listSV = mutableListOf<SinhVien>()
//    listSV.add(sv1)
//    listSV.add(sv2)
//    listSV.add(sv3)
//
//    //cách 1: duyệt nhanh
////    for (sv in listSV){
////        println(sv.getThongTin())
////    }
//
//    //cách 2: duyệt có index
//    println("----------------")
////    println("Duyệt có index")
//    println("List sinh viên")
//    for (i in listSV.indices) {
//
//        println("Thông tin $i : ${listSV.get(i).getThongTin()}")
//    }
//    //xoá phần tử ở cuối
//    listSV.removeAt(listSV.size - 1)
//    println("----------------")
//    println("Xoá phần tử cuối cùng")
//    for (i in listSV.indices) {
//
//        println("Thông tin $i : ${listSV.get(i).getThongTin()}")
//    }
//
//
//    //update thông tin
//    var updateSV = listSV.get(0)
//    updateSV.tenSV = "Nguyễn Đức Trọng"
//    updateSV.maSv = "PH23413"
//    updateSV.diemTb = 8.9f
//    updateSV.daTotNghiep = false
//    updateSV.tuoi = 19
//    println("----------------")
//    println("Update sinh viên đầu tiên")
//    for (i in listSV.indices) {
//        println("Thông tin $i : ${listSV.get(i).getThongTin()}")
//    }
//
//
//}