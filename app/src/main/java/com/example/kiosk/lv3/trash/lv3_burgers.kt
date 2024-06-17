package com.example.kiosk

open class trash_burgers(var name: String,var price: Int) {
    val thisMenu = arrayOf("빅맥버거", "상하이버거", "불고기버거")
    fun menuSelect(): Int {
        print("[0] 취소 ")
        for ((index, i) in thisMenu.withIndex()) {
            print("| [${index+1}]${i} ")
        }
        return readLine()!!.toInt()
    }
    var menu = Pair("", 0)
}
class BigmacBurger: trash_burgers("빅맥버거", 5900) {}
class SanghiBurger: trash_burgers("상하이버거", 5700) {}
class bulBurger: trash_burgers("불고기버거", 3200) {}