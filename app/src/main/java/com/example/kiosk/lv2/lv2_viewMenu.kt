package com.example.kiosk

// 메뉴를 보여주고 선택시 계산으로 연결됩니다.
class lv2_viewMenu {
    val menuCategory = arrayOf("햄버거", "아이스크림", "음료", "맥주", "사이드")
    fun viewMenu (selectCategoryNum: Int) {
        println("${menuCategory[selectCategoryNum - 1]} 메뉴의 목록입니다.")
        print("[0]처음으로 돌아가기 ")
        /*
        ------- 클래스를 selectMenu에 집어넣고 사용이 가능한지 체크 -------
        fun viewMenu (selectCategory: Int, menuNum: Int) {
            println("${menuCategory[menuNum - 1]} 메뉴의 목록입니다.")
            println("[0]종료하기")
            val selectMenu: Any = when (selectCategory) {
                1 -> lv2_burgers()
                2 -> lv2_iceCreams()
                3 -> lv2_drinks()
                4 -> lv2_beers()
                5 -> lv2_sides()
                else -> println("잘못된 입력입니다.")
            }

            println("주문하실 메뉴를 선택해주세요")
        }
        -------------------------------------------------------------
        */

        when (selectCategoryNum) {
            1 -> {
                val selectCategory = lv2_burgers()
                for (i in 0 until selectCategory.thisMenu.size) {
                    print("| [${i+1}]${selectCategory.thisMenu[i]} ")
                }
                var selectMenu = readLine()!!.toInt()
                when (selectMenu) {
                    0 -> return
                    1 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu01().first, selectCategory.menu01().second)
                    2 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu02().first, selectCategory.menu02().second)
                    3 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu03().first, selectCategory.menu03().second)
                    else -> return
                }
            }
            2 -> {
                val selectCategory = lv2_iceCreams()
                for (i in 0 until selectCategory.thisMenu.size) {
                    print("| [${i+1}]${selectCategory.thisMenu[i]} ")
                }
                var selectMenu = readLine()!!.toInt()
                when (selectMenu) {
                    0 -> return
                    1 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu01().first, selectCategory.menu01().second)
                    2 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu02().first, selectCategory.menu02().second)
                    3 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu03().first, selectCategory.menu03().second)
                    else -> return
                }

            }
            3 -> {
                val selectCategory = lv2_drinks()
                for (i in 0 until selectCategory.thisMenu.size) {
                    print("| [${i+1}]${selectCategory.thisMenu[i]} ")
                }
                var selectMenu = readLine()!!.toInt()
                when (selectMenu) {
                    0 -> return
                    1 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu01().first, selectCategory.menu01().second)
                    2 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu02().first, selectCategory.menu02().second)
                    3 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu03().first, selectCategory.menu03().second)
                    else -> return
                }

            }
            4 -> {
                val selectCategory = lv2_beers()
                for (i in 0 until selectCategory.thisMenu.size) {
                    print("| [${i+1}]${selectCategory.thisMenu[i]} ")
                }
                var selectMenu = readLine()!!.toInt()
                when (selectMenu) {
                    0 -> return
                    1 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu01().first, selectCategory.menu01().second)
                    2 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu02().first, selectCategory.menu02().second)
                    3 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu03().first, selectCategory.menu03().second)
                    else -> return
                }

            }
            5 -> {
                val selectCategory = lv2_sides()
                for (i in 0 until selectCategory.thisMenu.size) {
                    print("| [${i+1}]${selectCategory.thisMenu[i]} ")
                }
                var selectMenu = readLine()!!.toInt()
                when (selectMenu) {
                    0 -> return
                    1 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu01().first, selectCategory.menu01().second)
                    2 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu02().first, selectCategory.menu02().second)
                    3 -> lv2_paidMenu().lv2_selectMenu(selectCategory.menu03().first, selectCategory.menu03().second)
                    else -> return
                }

            }
            else -> {
                println("잘못된 입력입니다.")
                return
            }
        }
        println()
        println("주문하실 메뉴를 선택해주세요.")
    }
}