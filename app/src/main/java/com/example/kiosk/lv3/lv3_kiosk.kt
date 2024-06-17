package com.example.kiosk.lv3

var mainMenu = mutableListOf<MainMenu>()
var subMenu = mutableListOf<SubMenu>()
fun init() {
    mainMenu = mutableListOf(
        MainMenu("햄버거","패티가 두장 들어있는 햄버거가 많습니다."),
        MainMenu("아이스크림","시원합니다 엄청이요."),
        MainMenu("음료","얼음을 빼도 음료수는 늘어나지 않습니다."),
        MainMenu("술","청소년은 마실 수 없습니다."),
        MainMenu("사이드","튀김류, 구이류, 그외 안주들이 들어가 있습니다.")
    )
    subMenu = mutableListOf(
        SubMenu("술", "생맥 500ml", "mp50이 회복됩니다.", 4500),
        SubMenu("술", "생맥 1000ml", "mp100이 회복됩니다.", 8000),
        SubMenu("술", "소주", "mp160이 회복됩니다.", 5000),
        SubMenu("햄버거","빅맥버거", "패티가 두장입니다", 5900),
        SubMenu("햄버거","상하이버거", "패티가 튀긴놈입니다.", 5700),
        SubMenu("햄버거","불고기버거", "불고기가 들어있습니다.", 3200),
        SubMenu("음료","밀크쉐이크", "우유를 얼리고 갈아버렸습니다.", 2700),
        SubMenu("음료","아메리카노", "원두콩을 볶고 갈아버린걸 내린물입니다.", 1500),
        SubMenu("음료","탄산수", "탄산이 들어가있습니다.", 1900),
        SubMenu("아이스크림","소프트아이스크림", "우유로 만든 아이스크림입니다.", 1500),
        SubMenu("아이스크림","바닐라아이스크림", "바나나향이 짙은 아이스크림입니다.", 1700),
        SubMenu("아이스크림","초코아이스크림", "저희집 고양이 이름은 초코입니다. 근데 당사자는 못먹습니다.", 2000),
        SubMenu("사이드","감자튀김", "감자를 튀겼습니다.", 2700),
        SubMenu("사이드","해쉬브라운", "감자를 갈아서 뭉치고 튀겼습니다.", 1500),
        SubMenu("사이드","먹태", "바삭해요 엄청이요.", 1900)
    )
}

fun main() {

    init()




    fun selector (): Int {
        var selector = readLine()!!.toInt()
        if (selector == 0) {
            println("선택을 취소하셨습니다.")
        }
        return selector
    }


    while (true) {
        var setMenu: String = ""
        var choiceCategory = mutableListOf<SubMenu>()

        println("카테고리를 골라주세요")

        print("[0]처음으로 돌아가기 ")
        for ((index,i) in mainMenu.withIndex()) {
            i.getName(index)
        }
        println()
        when (selector()) {
            0 -> {
                continue
            }
            1 -> {
                setMenu = mainMenu[0].selectName()
            }
            2 -> {
                setMenu = mainMenu[1].selectName()
            }
            3 -> {
                setMenu = mainMenu[2].selectName()
            }
            4 -> {
                setMenu = mainMenu[3].selectName()
            }
            5 -> {
                setMenu = mainMenu[4].selectName()
            }
            else -> {
                println("잘못된 입력 입니다.")
                println("다시 주문해 주세요.")
            }
        }

        println("메뉴를 골라주세요")
        println("[0]처음으로 돌아가기")
        for ((index,i) in subMenu.withIndex()) {
            if (subMenu[index].type == setMenu){
                choiceCategory += subMenu[index]
                i.viewMenuList(choiceCategory.size)
            }
        }
        when (selector()) {
            0 -> {
                continue
            }
            1 -> {
                choiceCategory[0].choiceName()
            }
            2 -> {
                choiceCategory[1].choiceName()
            }
            3 -> {
                choiceCategory[2].choiceName()
            }
            else -> {
                println("잘못된 입력 입니다.")
                println("다시 주문해 주세요.")
            }
        }
    } // console while
}
