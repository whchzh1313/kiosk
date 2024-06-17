package com.example.kiosk
fun main() {
    val menuList = arrayOf("햄버거", "아이스크림", "음료", "맥주", "사이드")
    val burgers = arrayOf(arrayOf("빅맥버거", "5900"), arrayOf("상하이버거", "5700"), arrayOf("불고기버거", "3200"))
    val iceCream = arrayOf(arrayOf("소프트아이스크림", "1500"), arrayOf("바닐라아이스크림", "1700"), arrayOf("초코아이스크림", "2000"))
    val drink = arrayOf(arrayOf("밀크쉐이크", "2700"), arrayOf("아메리카노", "1500"), arrayOf("탄산수", "1900"))
    val beer = arrayOf(arrayOf("생맥 500ml", "4500"), arrayOf("생맥 1000ml", "8000"), arrayOf("소주", "5000"))
    val side = arrayOf(arrayOf("감자튀김", "2000"), arrayOf("해쉬브라운", "2400"), arrayOf("먹태", "7500"))
    var choiceSubMenu = 0


    var lv1_kioskRun: Boolean = true

    fun lv1_selectMenu (choiceMenuNum: Int, choiceMenu: Array<Array<String>>) {
        println("${choiceMenu[choiceMenuNum-1][0]}의 가격은 ${choiceMenu[choiceMenuNum-1][1]}원입니다. 결제하시겠습니까?")
        println("[0]취소하기 [1]결제하기 [2]메뉴 추가하기(준비중)")
        var lv1_buyMenu = readLine()!!.toInt()
        when (lv1_buyMenu) {
            0 -> {
                println("결제가 취소되었습니다.")
                println("키오스크를 다시 시작합니다.")
                return
            }
            1 -> {
                println("${choiceMenu[choiceMenuNum-1][1]}원 결제가 완료되었습니다.")
                println("키오스크를 다시 시작합니다.")
                return
            }
            2 -> {
                println("아직 준비중인 메뉴입니다.")
                return
            }
        }
    }

    fun lv1_viewMenu (choiceMenu: Array<Array<String>>, menuNum: Int) {
        println("${menuList[menuNum - 1]} 메뉴의 목록입니다.")
        println("[0]이전으로")
        for (i in 0 until choiceMenu.size) {
            println("[${i+1}]${choiceMenu[i][0]} : ${choiceMenu[i][1]}원")
        }
        println("주문하실 메뉴를 선택해주세요")
        var choiceMenuNum = readLine()!!.toInt()
        if (choiceMenuNum == 0) {
            return
        }
        lv1_selectMenu(choiceMenuNum, choiceMenu)
    }

    while (lv1_kioskRun) {
        println("메뉴판을 골라주세요")
        println("[0]종료하기 | [1]햄버거 | [2]아이스크림 | [3]음료 | [4]맥주 | [5]사이드")
        var choiceMainMenu = readLine()!!.toInt()
        if (choiceMainMenu == 0) {
            break
        }
        when (choiceMainMenu) {
            1 -> {
                println("햄버거 메뉴를 선택하셨습니다.")
                lv1_viewMenu(burgers, choiceMainMenu)
            }
            2 -> {
                println("아이스크림 메뉴를 선택하셨습니다.")
                lv1_viewMenu(iceCream, choiceMainMenu)
            }
            3 -> {
                println("음료 메뉴를 선택하셨습니다.")
                lv1_viewMenu(drink, choiceMainMenu)
            }
            4 -> {
                println("맥주 메뉴를 선택하셨습니다.")
                lv1_viewMenu(beer, choiceMainMenu)
            }
            5 -> {
                println("사이드 메뉴를 선택하셨습니다.")
                lv1_viewMenu(side, choiceMainMenu)
            }
            else -> {
                println("잘못된 입력 입니다.")
                println("다시 주문해 주세요.")
            }

        }
    } // console while
}

