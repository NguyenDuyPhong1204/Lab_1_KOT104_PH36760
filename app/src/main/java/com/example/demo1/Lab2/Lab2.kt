package com.example.demo1.Lab2


import kotlin.system.exitProcess

fun main() {
    do {
        println("-------------------------------- Menu --------------------------------")
        println("Chọn bài bạn muốn xem")
        println("1. Bài 1")
        println("2. Bài 2")
        println("3. Bài 3")
        println("4. Bài 4")
        println("5. Thoát")
        var luaChon: Int
        print("Nhập bài muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> bai1()
                2 -> bai2()
                3 -> bai3()
                4 -> bai4()
                5 -> exitProcess(0)
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)
}

fun bai1() {
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0) {
        println("Phương trình vô số nghiệm")
    } else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
}

fun bai2() {
    var month = 0
    println("Nhập tháng:")
    val s: String? = readLine()
    if (s != null) month = s.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
}

fun bai3() {
    var year = 0
    var s: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s = readLine()
        while (s == null || s.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s = readLine()
        }
        year = s.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s = readLine()
        if (s == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")
}

fun bai4() {
    do {
        println("-------------------------------- Menu --------------------------------")
        println("Chọn chức năng bạn muốn thực hiện")
        println("1. Hiển thị danh sách sinh viên")
        println("2. Thêm sinh viên")
        println("3. Xoá sinh viên")
        println("4. Cập nhật sinh viên")
        println("5. Thoát")
        var luaChon: Int
        print("Nhập chức năng muốn xem: ")
        var s = readlnOrNull()
        if (s != null) {
            luaChon = s.toInt()
            when (luaChon) {
                1 -> listSV()
                2 -> addSinhVien()
                3 -> xoaSinhVien()
                4 -> updateSinhVien()
                5 -> break
                else -> println("Vui lòng chọn lại");
            }
        }
    } while (s != null)
}

var listSV = mutableListOf<SinhVien>()
fun listSV() {
    println("----------------")
//    println("Duyệt có index")
    println("List sinh viên")
    for (i in listSV.indices) {
        println("Thông tin $i : ${listSV.get(i).getThongTin()}")
    }
}
//do {
//    println("Nhập 1 năm:")
//    s = readLine()
//    while (s == null || s.toInt() < 0) {
//        println("Nhập sai năm, nhập lại:")
//        s = readLine()
//    }
//    year = s.toInt()
//    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//        println("Năm $year là năm nhuần")
//    } else {
//        println("Năm $year không phải là năm nhuần")
//    }
//    print("Tiếp không?(c/k):")
//    s = readLine()
//    if (s == "k")
//        break;
//} while (true)
//println("Kết thúc chương trình")
fun addSinhVien() {
    var tenSv: String = "";
    var maSV: String = "";
    var diemTB: Float = 0.0f;
    var daTN: Boolean = false;
    var tuoi: Int = 0;
    var s: String?

    do {
        print("Nhập tên sinh viên: ")
        s = readlnOrNull()
        if (s != null) {
            tenSv = s.toString()
        }
        print("Nhập mã sinh viên: ")
        s = readlnOrNull()
        if (s != null) {
            maSV = s.toString()
        }
        print("Nhập điểm trung bình: ")
        s = readlnOrNull()
        if (s != null) {
            diemTB = s.toFloat()
        }
        print("Đã tốt nghiệp: ")
        s = readlnOrNull()
        if (s != null) {
            daTN = s.toBoolean()
        }
        print("Nhập tuổi sinh viên: ")
        s = readlnOrNull()
        if (s != null) {
            tuoi = s.toInt()
        }
        var sv: SinhVien = SinhVien(tenSv, maSV, diemTB, daTN, tuoi)

        listSV.add(sv)

        println("Có nhập tiếp không(c/k)?:")
        s = readlnOrNull()
        if(s == "k") {
            break
        }
    }while (true)

}

fun xoaSinhVien() {
    println("-------------------------------------")
    println("Xoá sinh viên theo mã sinh viên")

    var masv: String = ""
    var s: String?
    print("Nhập mã sinh viên muốn xoá")
    s = readlnOrNull()
    if (s != null) {
        masv = s.toString()
    }
    var found = false
    for (sinhVien in listSV) {
        if (sinhVien.maSv.equals(masv)) {
            found = true
            sinhVien.getThongTin()
            var xacNhan: String = ""
            println("Bạn có muốn xoá không (Y/N)?:")
            s = readlnOrNull()
            if (s != null) {
                xacNhan = s.toString()
                if (xacNhan.equals("Y")) {
                    listSV.remove(sinhVien)
                    println("Đã xoá")
                    break
                } else if (xacNhan.equals("N")) {
                    println("Không xoá")
                    break;
                }
            }
        }
    }
    if (!found) {
        println("Không tìm thấy mã sinh viên")
    }

}

fun updateSinhVien() {
    println("-------------------------------------")
    println("Cập nhật sinh viên theo mã sinh viên")
    var tenSv: String = "";
    var maSV: String = "";
    var diemTB: Float = 0.0f;
    var daTN: Boolean = false;
    var tuoi: Int = 0;
    var s: String?
    print("Nhập mã sinh viên muốn cập nhật: ")
    s = readlnOrNull()
    if (s != null) {
        maSV = s.toString()
    }

    var found = false
    for (sinhVien in listSV) {
        if (sinhVien.maSv.equals(maSV)) {
            found = true
            println("Thông tin sinh viên cần cập nhật:")
            sinhVien.getThongTin()

            // Yêu cầu người dùng nhập thông tin mới
            println("Nhập thông tin mới:")
            print("Nhập tên sinh viên: ")
            s = readlnOrNull()
            if (s != null) {
                tenSv = s.toString()
            }
            print("Nhập điểm trung bình: ")
            s = readlnOrNull()
            if (s != null) {
                diemTB = s.toFloat()
            }
            print("Đã tốt nghiệp: ")
            s = readlnOrNull()
            if (s != null) {
                daTN = s.toBoolean()
            }
            print("Nhập tuổi sinh viên: ")
            s = readlnOrNull()
            if (s != null) {
                tuoi = s.toInt()
            }

            // Cập nhật thông tin mới cho sinh viên
            if (tenSv != null) sinhVien.tenSV = tenSv
            if (diemTB != null) sinhVien.diemTb = diemTB
            if (daTN != null) sinhVien.daTotNghiep = daTN
            if (tuoi != null) sinhVien.tuoi = tuoi

            println("Đã cập nhật thông tin")
            break
        }
    }

    if (!found) {
        println("Không tìm thấy sinh viên có mã: $maSV")
    }
}
