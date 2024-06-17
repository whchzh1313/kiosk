package com.example.kiosk

class trash_paidMenu () {

    fun trash_selectMenu (choiceMenu: String, choiceMenuPrice: Int) {
        println("${choiceMenu}의 가격은 ${choiceMenuPrice}원입니다. 결제하시겠습니까?")
        println("[0]취소하기 [1]결제하기 [2]메뉴 추가하기 (준비중인 메뉴입니다.)")
        var lv1_buyMenu = readLine()!!.toInt()
        when (lv1_buyMenu) {
            0 -> {
                println("결제가 취소되었습니다.")
                println("키오스크를 다시 시작합니다.")
            }
            1 -> {
                println("${choiceMenuPrice}원 결제가 완료되었습니다.")
                println("키오스크를 다시 시작합니다.")
            }
            2 -> {
                println("해당 내용은 현재 사용할 수 없는 메뉴입니다. 키오스크를 다시 시작합니다.")
            }
        }
        println("")
        println("─────────────────────────────────────────")
        println("")
        return
    }


}