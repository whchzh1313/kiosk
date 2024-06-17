package com.example.kiosk.lv3

open class MainMenu (var name: String,var desc: String) {
    fun getName(mainMenuNum: Int): String {
        print(" [${mainMenuNum+1}]${name}")
        return name
    }
    fun selectName(): String {
        println("${name} 카테고리를 선택하셨습니다.")
        return name
    }
}