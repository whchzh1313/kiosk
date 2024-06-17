package com.example.kiosk

class lv2_beers() {
    val thisMenu = arrayOf("생맥 500ml", "생맥 1000ml", "소주")
    fun menu01 (): Pair<String, Int> {
        var name = "생맥 500ml"
        var price = 4500
        var menu = Pair(name, price)
        return menu
    }
    fun menu02 (): Pair<String, Int> {
        var name = "생맥 1000ml"
        var price = 8000
        var menu = Pair(name, price)
        return menu
    }
    fun menu03 (): Pair<String, Int> {
        var name = "소주"
        var price = 5000
        var menu = Pair(name, price)
        return menu
    }
}