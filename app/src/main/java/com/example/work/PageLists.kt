package com.example.work

object PageLists {
    val introSlides = listOf(
        Intro(R.drawable.moscow_kremlin, "0", "2"),
        Intro(R.drawable.saint_petersburg, "1", ""),
        Intro(R.drawable.taganrog, "2", "")
    )
    val Moscow = listOf(
        Intro(R.drawable.theatre_bolshoi,"0",null),
        Intro(R.drawable.red_square,"1", null),
        Intro(R.drawable.arbat_street,"2", null)

    )
    val Saint_Petersburg = listOf(
        Intro(R.drawable.hermitage,"0",null),
        Intro(R.drawable.peterhof,"1",null),
        Intro(R.drawable.pnp_fortress,"2",null),
    )

    val Taganrog = listOf(
        Intro(R.drawable.stone_stairs,"0",null),
        Intro(R.drawable.chekhovs_house,"1",null),
        Intro(R.drawable.chekhovs_shop,"2",null)
        )
}