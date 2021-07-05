package com.example.liarsdice

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game_mode.*

class GameMode : AppCompatActivity() {
    var playersXTurn = 0

    val gameActivityDice = GameActivityDice(6)

    override fun onBackPressed() {
        val intent = Intent(this@GameMode, MainActivity::class.java)
        startActivity(intent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_mode)

        restartButton.setOnClickListener {
            val intent = Intent(this@GameMode, GameMode::class.java)
            startActivity(intent)
        }

        rollModeButton.setOnClickListener {
            val intent = Intent(this@GameMode, MainActivity::class.java)
            startActivity(intent)
        }

        with(gameActivityDice) {
            plusButton.setOnClickListener {
                if (selectedBidAmount < 10) {
                    diceBidSelectText1.text = ("${++selectedBidAmount}x")
                }

                diceBidSelectText2.text = ("${selectedBidAmount}x")
                diceBidSelectText3.text = ("${selectedBidAmount}x")
                diceBidSelectText4.text = ("${selectedBidAmount}x")
                diceBidSelectText5.text = ("${selectedBidAmount}x")
                diceBidSelectText6.text = ("${selectedBidAmount}x")
            }

            minusButton.setOnClickListener {
                if (selectedBidAmount > 1) {
                    diceBidSelectText1.text = ("${--selectedBidAmount}x")
                }

                diceBidSelectText2.text = ("${selectedBidAmount}x")
                diceBidSelectText3.text = ("${selectedBidAmount}x")
                diceBidSelectText4.text = ("${selectedBidAmount}x")
                diceBidSelectText5.text = ("${selectedBidAmount}x")
                diceBidSelectText6.text = ("${selectedBidAmount}x")
            }

            rollButton.setOnClickListener {
                rollDices()
            }

            playersDices.setOnClickListener {
                if (playersDices.text.equals("show player's 1 dices")) {
                    diceImage1.setImageResource(players1List[num])
                    diceImage1.contentDescription = num++.toString()
                    diceImage2.setImageResource(players1List[num])
                    diceImage2.contentDescription = num++.toString()
                    diceImage3.setImageResource(players1List[num])
                    diceImage3.contentDescription = num++.toString()
                    diceImage4.setImageResource(players1List[num])
                    diceImage4.contentDescription = num++.toString()
                    diceImage5.setImageResource(players1List[num])
                    diceImage5.contentDescription = num.toString()
                    playersDices.text = ("show player's 2 dices")
                } else {
                    diceImage1.setImageResource(players2List[num])
                    diceImage1.contentDescription = num++.toString()
                    diceImage2.setImageResource(players2List[num])
                    diceImage2.contentDescription = num++.toString()
                    diceImage3.setImageResource(players2List[num])
                    diceImage3.contentDescription = num++.toString()
                    diceImage4.setImageResource(players2List[num])
                    diceImage4.contentDescription = num++.toString()
                    diceImage5.setImageResource(players2List[num])
                    diceImage5.contentDescription = num.toString()
                    playersDices.text = ("show player's 1 dices")
                }

                num = 0
            }

            liarButton.setOnClickListener {

                if (lastBidDices() >= lastBidAmount) {
                    if (playersXTurn == 1) {
                        hintText.text = ("Player 1 Wins")
                    } else {
                        hintText.text = ("Player 2 Wins")
                    }

                    hintText.visibility = View.VISIBLE
                } else {
                    if (playersXTurn == 2) {
                        hintText.text = ("Player 1 Wins")
                    } else {
                        hintText.text = ("Player 2 Wins")
                    }

                    hintText.visibility = View.VISIBLE
                }

                diceBidSelectText1.visibility = View.INVISIBLE
                diceBidSelectText2.visibility = View.INVISIBLE
                diceBidSelectText3.visibility = View.INVISIBLE
                diceBidSelectText4.visibility = View.INVISIBLE
                diceBidSelectText5.visibility = View.INVISIBLE
                diceBidSelectText6.visibility = View.INVISIBLE

                diceBidSelect1.visibility = View.INVISIBLE
                diceBidSelect2.visibility = View.INVISIBLE
                diceBidSelect3.visibility = View.INVISIBLE
                diceBidSelect4.visibility = View.INVISIBLE
                diceBidSelect5.visibility = View.INVISIBLE
                diceBidSelect6.visibility = View.INVISIBLE

                plusButton.visibility = View.INVISIBLE
                minusButton.visibility = View.INVISIBLE
                liarButton.visibility = View.INVISIBLE
            }
        }

        dicesVisibilitySwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                diceImage1.visibility = View.VISIBLE
                diceImage2.visibility = View.VISIBLE
                diceImage3.visibility = View.VISIBLE
                diceImage4.visibility = View.VISIBLE
                diceImage5.visibility = View.VISIBLE
            } else {
                diceImage1.visibility = View.INVISIBLE
                diceImage2.visibility = View.INVISIBLE
                diceImage3.visibility = View.INVISIBLE
                diceImage4.visibility = View.INVISIBLE
                diceImage5.visibility = View.INVISIBLE
            }
        }

        setOnBidListener()
    }

    private fun rollDices() {
        with(gameActivityDice) {
            repeat(5) {
                val diceRoll = roll()
                sum += diceRoll
                val drawableResource = when (roll()) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

                list.add(drawableResource)
            }

            if (timeRoll == 1) {
                playerText.text = ("Player 2")
                sumPlayer1 = sum
                dicesVisibilitySwitch.visibility = View.VISIBLE
                timeRoll++
            } else if (timeRoll == 2) {
                sumPlayer2 = sum

                if (sumPlayer1 > sumPlayer2) {
                    playerText.text = ("Player 1 Starts")
                    playersXTurn = 1
                } else {
                    playerText.text = ("Player 2 Starts")
                    playersXTurn = 2
                }

                hintText.visibility = View.INVISIBLE
                timeRoll++
            } else if (timeRoll == 3) {
                if (playersXTurn == 1) {
                    players1List.addAll(list)
                    playersXTurn = 2
                    playerText.text = ("Player's 2 Roll")
                } else {
                    players2List.addAll(list)
                    playersXTurn = 1
                    playerText.text = ("Player's 1 Roll")
                }

                list.clear()
                timeRoll++
            } else if (timeRoll == 4) {
                if (playersXTurn == 1) {
                    players1List.addAll(list)
                    playersXTurn = 2
                    playersDices.text = ("show player's 2 dices")
                    playerText.text = ("Player's 2 Turn")
                } else {
                    players2List.addAll(list)
                    playersXTurn = 1
                    playersDices.text = ("show player's 1 dices")
                    playerText.text = ("Player's 1 Turn")
                }

                diceBidSelectText1.visibility = View.VISIBLE
                diceBidSelectText2.visibility = View.VISIBLE
                diceBidSelectText3.visibility = View.VISIBLE
                diceBidSelectText4.visibility = View.VISIBLE
                diceBidSelectText5.visibility = View.VISIBLE
                diceBidSelectText6.visibility = View.VISIBLE

                diceBidSelect1.visibility = View.VISIBLE
                diceBidSelect2.visibility = View.VISIBLE
                diceBidSelect3.visibility = View.VISIBLE
                diceBidSelect4.visibility = View.VISIBLE
                diceBidSelect5.visibility = View.VISIBLE
                diceBidSelect6.visibility = View.VISIBLE

                plusButton.visibility = View.VISIBLE
                minusButton.visibility = View.VISIBLE
                rollButton.visibility = View.INVISIBLE
                playersDices.visibility = View.VISIBLE
            }

            sum = 0

            if (playersXTurn == 1 && timeRoll > 3) {
                diceImage1.setImageResource(players2List[num])
                diceImage1.contentDescription = num++.toString()
                diceImage2.setImageResource(players2List[num])
                diceImage2.contentDescription = num++.toString()
                diceImage3.setImageResource(players2List[num])
                diceImage3.contentDescription = num++.toString()
                diceImage4.setImageResource(players2List[num])
                diceImage4.contentDescription = num++.toString()
                diceImage5.setImageResource(players2List[num])
                diceImage5.contentDescription = num.toString()
            } else if (playersXTurn == 2 && timeRoll > 3) {
                diceImage1.setImageResource(players1List[num])
                diceImage1.contentDescription = num++.toString()
                diceImage2.setImageResource(players1List[num])
                diceImage2.contentDescription = num++.toString()
                diceImage3.setImageResource(players1List[num])
                diceImage3.contentDescription = num++.toString()
                diceImage4.setImageResource(players1List[num])
                diceImage4.contentDescription = num++.toString()
                diceImage5.setImageResource(players1List[num])
                diceImage5.contentDescription = num.toString()
            } else {
                diceImage1.setImageResource(list[num])
                diceImage1.contentDescription = num++.toString()
                diceImage2.setImageResource(list[num])
                diceImage2.contentDescription = num++.toString()
                diceImage3.setImageResource(list[num])
                diceImage3.contentDescription = num++.toString()
                diceImage4.setImageResource(list[num])
                diceImage4.contentDescription = num++.toString()
                diceImage5.setImageResource(list[num])
                diceImage5.contentDescription = num.toString()
                list.clear()
            }

            num = 0
        }
    }
}

