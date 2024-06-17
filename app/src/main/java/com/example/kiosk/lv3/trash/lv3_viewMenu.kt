package com.example.kiosk

// 메뉴를 보여주고 선택시 계산으로 연결됩니다.
class trash_viewMenu {
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
                1 -> trash_burgers()
                2 -> trash_iceCreams()
                3 -> trash_drinks()
                4 -> trash_beers()
                5 -> trash_sides()
                else -> println("잘못된 입력입니다.")
            }

            println("주문하실 메뉴를 선택해주세요")
        }
        -------------------------------------------------------------
        */

        when (selectCategoryNum) {
            1 -> {
                val selectCategory = trash_burgers("", 0)
                when (selectCategory.menuSelect()) {
                    0 -> return
                    1 -> trash_paidMenu().trash_selectMenu(BigmacBurger().name, BigmacBurger().price)
                    2 -> trash_paidMenu().trash_selectMenu(SanghiBurger().name, SanghiBurger().price)
                    3 -> trash_paidMenu().trash_selectMenu(bulBurger().name, bulBurger().price)
                    else -> return
                }
            }
            2 -> {
                val selectCategory = trash_iceCreams("", 0)
                when (selectCategory.menuSelect()) {
                    0 -> return
                    1 -> trash_paidMenu().trash_selectMenu(SoftIceCream().name, SoftIceCream().price)
                    2 -> trash_paidMenu().trash_selectMenu(VanillaIceCream().name, VanillaIceCream().price)
                    3 -> trash_paidMenu().trash_selectMenu(ChocoIceCream().name, ChocoIceCream().price)
                    else -> return
                }

            }
            3 -> {
                val selectCategory = trash_drinks("", 0)
                when (selectCategory.menuSelect()) {
                    0 -> return
                    1 -> trash_paidMenu().trash_selectMenu(MilkShake().name, MilkShake().price)
                    2 -> trash_paidMenu().trash_selectMenu(Americano().name, Americano().price)
                    3 -> trash_paidMenu().trash_selectMenu(Sparkling().name, Sparkling().price)
                    else -> return
                }

            }
            4 -> {
                val selectCategory = trash_beers("", 0)
                when (selectCategory.menuSelect()) {
                    0 -> return
                    1 -> trash_paidMenu().trash_selectMenu(Bear500ml().name, Bear500ml().price)
                    2 -> trash_paidMenu().trash_selectMenu(Beal1000ml().name, Beal1000ml().price)
                    3 -> trash_paidMenu().trash_selectMenu(Soju().name, Soju().price)
                    else -> return
                }

            }
            5 -> {
                val selectCategory = trash_sides("", 0)
                when (selectCategory.menuSelect()) {
                    0 -> return
                    1 -> trash_paidMenu().trash_selectMenu(FridePotato().name, FridePotato().price)
                    2 -> trash_paidMenu().trash_selectMenu(HashBrowns().name, HashBrowns().price)
                    3 -> trash_paidMenu().trash_selectMenu(DriedPollack().name, DriedPollack().price)
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