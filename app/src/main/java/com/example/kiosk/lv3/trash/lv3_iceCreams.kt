package com.example.kiosk

open class trash_iceCreams(var name: String,var price: Int) {
    val thisMenu = arrayOf("소프트아이스크림", "바닐라아이스크림", "초코아이스크림")
    fun menuSelect(): Int {
        print("[0] 취소 ")
        for ((index, i) in thisMenu.withIndex()) {
            print("| [${index+1}]${i} ")
        }
        return readLine()!!.toInt()
    }
    var menu = Pair("", 0)
}
class SoftIceCream: trash_iceCreams("소프트아이스크림", 1500) {}
class VanillaIceCream: trash_iceCreams("바닐라아이스크림", 1700) {}
class ChocoIceCream: trash_iceCreams("초코아이스크림", 2000) {}