package com.example.kiosk.lv3

class SubMenu (var type: String, name: String, desc: String, var price: Int): MainMenu(name, desc) {
    fun viewMenuList(mainMenuNum: Int): String {
        println("[${mainMenuNum}]${name} ${desc} ${price}원입니다.")
        return name
    }
    fun choiceName(): String {
        println("${name}메뉴 ${price} 원 결제 해드리겠습니다.")
        return name
    }
}