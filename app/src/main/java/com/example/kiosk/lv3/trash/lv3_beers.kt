package com.example.kiosk

open class trash_beers(var name: String,var price: Int) {
    val thisMenu = arrayOf("생맥 500ml", "생맥 1000ml", "소주")
    fun menuSelect(): Int {
        print("[0] 취소 ")
        for ((index, i) in thisMenu.withIndex()) {
            print("| [${index+1}]${i} ")
        }
        return readLine()!!.toInt()
    }
    var menu = Pair("", 0)
}
class Bear500ml: trash_beers("생맥 500ml", 4500) {}
class Beal1000ml: trash_beers("생맥 1000ml", 8000) {}
class Soju: trash_beers("소주", 5000) {}