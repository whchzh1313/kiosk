package com.example.kiosk

class lv2_iceCreams() {
    val thisMenu = arrayOf("소프트아이스크림", "바닐라아이스크림", "초코아이스크림")
    fun menu01 (): Pair<String, Int> {
        var name = "소프트아이스크림"
        var price = 1500
        var menu = Pair(name, price)
        return menu
    }
    fun menu02 (): Pair<String, Int> {
        var name = "바닐라아이스크림"
        var price = 1700
        var menu = Pair(name, price)
        return menu
    }
    fun menu03 (): Pair<String, Int> {
        var name = "초코아이스크림"
        var price = 2000
        var menu = Pair(name, price)
        return menu
    }
}