package com.example.kiosk

fun main() {


    fun menuSelect () {
        var menuNum = readLine()!!.toInt()
    }




    while (true) {
        println("메뉴를 골라주세요")
        println("[0]종료하기 | [1]햄버거 | [2]아이스크림 | [3]음료 | [4]맥주 | [5]사이드")

        var choiceMainMenu = readLine()!!.toInt()
        if (choiceMainMenu == 0) {
            break
        }
        when (choiceMainMenu) {
            1 -> {
                println("햄버거 메뉴를 선택하셨습니다.")
                trash_viewMenu().viewMenu(1)
            }
            2 -> {
                println("아이스크림 메뉴를 선택하셨습니다.")
                trash_viewMenu().viewMenu(2)
            }
            3 -> {
                println("음료 메뉴를 선택하셨습니다.")
                trash_viewMenu().viewMenu(3)
            }
            4 -> {
                println("맥주 메뉴를 선택하셨습니다.")
                trash_viewMenu().viewMenu(4)
            }
            5 -> {
                println("사이드 메뉴를 선택하셨습니다.")
                trash_viewMenu().viewMenu(5)
            }
            else -> {
                println("잘못된 입력 입니다.")
                println("다시 주문해 주세요.")
            }

        }
    } // console while
}
