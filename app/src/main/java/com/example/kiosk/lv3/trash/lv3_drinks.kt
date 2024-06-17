package com.example.kiosk

open class trash_drinks(var name: String,var price: Int) {
    val thisMenu = arrayOf("밀크쉐이크", "아메리카노", "탄산수")
    fun menuSelect(): Int {
        print("[0] 취소 ")
        for ((index, i) in thisMenu.withIndex()) {
            print("| [${index+1}]${i} ")
        }
        return readLine()!!.toInt()
    }
    var menu = Pair("", 0)
}
class MilkShake: trash_drinks("밀크쉐이크", 2700) {}
class Americano: trash_drinks("아메리카노", 1500) {}
class Sparkling: trash_drinks("탄산수", 1900) {}