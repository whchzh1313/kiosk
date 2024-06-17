package com.example.kiosk

class lv2_sides() {
    val thisMenu = arrayOf("감자튀김", "해쉬브라운", "먹태")
    fun menu01 (): Pair<String, Int> {
        var name = "감자튀김"
        var price = 2000
        var menu = Pair(name, price)
        return menu
    }
    fun menu02 (): Pair<String, Int> {
        var name = "해쉬브라운"
        var price = 2400
        var menu = Pair(name, price)
        return menu
    }
    fun menu03 (): Pair<String, Int> {
        var name = "먹태"
        var price = 7500
        var menu = Pair(name, price)
        return menu
    }
}