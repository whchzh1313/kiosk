package com.example.kiosk

class lv2_drinks() {
    val thisMenu = arrayOf("밀크쉐이크", "아메리카노", "탄산수")
    fun menu01 (): Pair<String, Int> {
        var name = "밀크쉐이크"
        var price = 2700
        var menu = Pair(name, price)
        return menu
    }
    fun menu02 (): Pair<String, Int> {
        var name = "아메리카노"
        var price = 1500
        var menu = Pair(name, price)
        return menu
    }
    fun menu03 (): Pair<String, Int> {
        var name = "탄산수"
        var price = 1900
        var menu = Pair(name, price)
        return menu
    }
}