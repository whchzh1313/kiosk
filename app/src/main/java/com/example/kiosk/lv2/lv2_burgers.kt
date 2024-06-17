package com.example.kiosk

class lv2_burgers() {
    val thisMenu = arrayOf("빅맥버거", "상하이버거", "불고기버거")
    fun menu01 (): Pair<String, Int> {
        var name = "빅맥버거"
        var price = 5900
        var menu = Pair(name, price)
        return menu
    }
    fun menu02 (): Pair<String, Int> {
        var name = "상하이버거"
        var price = 5700
        var menu = Pair(name, price)
        return menu
    }
    fun menu03 (): Pair<String, Int> {
        var name = "불고기버거"
        var price = 3200
        var menu = Pair(name, price)
        return menu
    }
}