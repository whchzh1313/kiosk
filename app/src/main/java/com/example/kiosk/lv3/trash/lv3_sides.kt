package com.example.kiosk

open class trash_sides(var name: String,var price: Int) {
    val thisMenu = arrayOf("감자튀김", "해쉬브라운", "먹태")
    fun menuSelect(): Int {
        print("[0] 취소 ")
        for ((index, i) in thisMenu.withIndex()) {
            print("| [${index+1}]${i} ")
        }
        return readLine()!!.toInt()
    }
    var menu = Pair("", 0)
}
class FridePotato: trash_sides("감자튀김", 2700) {}
class HashBrowns: trash_sides("해쉬브라운", 1500) {}
class DriedPollack: trash_sides("먹태", 1900) {}