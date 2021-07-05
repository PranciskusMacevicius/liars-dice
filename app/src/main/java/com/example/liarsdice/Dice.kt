package com.example.liarsdice

abstract class Dice(private val numSides: Int) {
    abstract var amount: Int

    val list = mutableListOf<Int>()

    fun roll(): Int {
        return (1..numSides).random()
    }

    var num = 0
}

class RollActivityDice(numSides: Int) : Dice(numSides) {
    override var amount = 5
}

class GameActivityDice(numSides: Int) : Dice(numSides) {
    override var amount = 0

    var selectedBidAmount = 1
    var lastBid = 0
    var lastBidAmount = 0
    var lastIndex = 0
    var sum = 0
    var sumPlayer1 = 0
    var sumPlayer2 = 0
    var timeRoll = 1

    var bidAmount1 = 1
    var bidAmount2 = 1
    var bidAmount3 = 1
    var bidAmount4 = 1
    var bidAmount5 = 1
    var bidAmount6 = 1

    var players1List = mutableListOf<Int>()
    var players2List = mutableListOf<Int>()

    fun lastBidDices(): Int {
        val bothPlayersList = players1List + players2List

        repeat(bothPlayersList.size) {
            when (bothPlayersList[lastIndex++]) {
                lastBid -> amount++
            }
        }

        return amount
    }
}
