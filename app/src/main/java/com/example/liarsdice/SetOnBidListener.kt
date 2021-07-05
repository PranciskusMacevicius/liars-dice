package com.example.liarsdice

import kotlinx.android.synthetic.main.activity_game_mode.*

fun GameMode.setOnBidListener() {
    with(gameActivityDice) {
        diceBidSelect1.setOnClickListener {
            if (selectedBidAmount >= bidAmount1 &&
                selectedBidAmount >= bidAmount2 &&
                selectedBidAmount >= bidAmount3 &&
                selectedBidAmount >= bidAmount4 &&
                selectedBidAmount >= bidAmount5 &&
                selectedBidAmount >= bidAmount6
            ) {
                if (diceBidText1.text.equals("")) {
                    diceBidText1.text = ("${selectedBidAmount}x")
                    diceBidImage1.setImageResource(R.drawable.dice_1)
                    diceBidImage1.contentDescription = ("1")
                } else if (diceBidText2.text.equals("")) {
                    diceBidText2.text = ("${selectedBidAmount}x")
                    diceBidImage2.setImageResource(R.drawable.dice_1)
                    diceBidImage2.contentDescription = ("1")
                } else if (diceBidText3.text.equals("")) {
                    diceBidText3.text = ("${selectedBidAmount}x")
                    diceBidImage3.setImageResource(R.drawable.dice_1)
                    diceBidImage3.contentDescription = ("1")
                } else if (diceBidText4.text.equals("")) {
                    diceBidText4.text = ("${selectedBidAmount}x")
                    diceBidImage4.setImageResource(R.drawable.dice_1)
                    diceBidImage4.contentDescription = ("1")
                } else if (diceBidText5.text.equals("")) {
                    diceBidText5.text = ("${selectedBidAmount}x")
                    diceBidImage5.setImageResource(R.drawable.dice_1)
                    diceBidImage5.contentDescription = ("1")
                } else if (diceBidText6.text.equals("")) {
                    diceBidText6.text = ("${selectedBidAmount}x")
                    diceBidImage6.setImageResource(R.drawable.dice_1)
                    diceBidImage6.contentDescription = ("1")
                } else if (diceBidText7.text.equals("")) {
                    diceBidText7.text = ("${selectedBidAmount}x")
                    diceBidImage7.setImageResource(R.drawable.dice_1)
                    diceBidImage7.contentDescription = ("1")
                } else if (diceBidText8.text.equals("")) {
                    diceBidText8.text = ("${selectedBidAmount}x")
                    diceBidImage8.setImageResource(R.drawable.dice_1)
                    diceBidImage8.contentDescription = ("1")
                } else if (diceBidText9.text.equals("")) {
                    diceBidText9.text = ("${selectedBidAmount}x")
                    diceBidImage9.setImageResource(R.drawable.dice_1)
                    diceBidImage9.contentDescription = ("1")
                } else if (diceBidText10.text.equals("")) {
                    diceBidText10.text = ("${selectedBidAmount}x")
                    diceBidImage10.setImageResource(R.drawable.dice_1)
                    diceBidImage10.contentDescription = ("1")
                } else if (diceBidText11.text.equals("")) {
                    diceBidText11.text = ("${selectedBidAmount}x")
                    diceBidImage11.setImageResource(R.drawable.dice_1)
                    diceBidImage11.contentDescription = ("1")
                } else if (diceBidText12.text.equals("")) {
                    diceBidText12.text = ("${selectedBidAmount}x")
                    diceBidImage12.setImageResource(R.drawable.dice_1)
                    diceBidImage12.contentDescription = ("1")
                } else if (diceBidText13.text.equals("")) {
                    diceBidText13.text = ("${selectedBidAmount}x")
                    diceBidImage13.setImageResource(R.drawable.dice_1)
                    diceBidImage13.contentDescription = ("1")
                } else if (diceBidText14.text.equals("")) {
                    diceBidText14.text = ("${selectedBidAmount}x")
                    diceBidImage14.setImageResource(R.drawable.dice_1)
                    diceBidImage14.contentDescription = ("1")
                } else {
                    diceBidText15.text = ("${selectedBidAmount}x")
                    diceBidImage15.setImageResource(R.drawable.dice_1)
                    diceBidImage15.contentDescription = ("1")
                }

                bidAmount1 = selectedBidAmount + 1
                bidAmount2 = selectedBidAmount
                bidAmount3 = selectedBidAmount
                bidAmount4 = selectedBidAmount
                bidAmount5 = selectedBidAmount
                bidAmount6 = selectedBidAmount
                lastBid = R.drawable.dice_1
                lastBidAmount = selectedBidAmount

                if (playersXTurn == 1) {
                    playerText.text = ("Player's 1 Turn")
                    playersXTurn = 2
                } else {
                    playerText.text = ("Player's 2 Turn")
                    playersXTurn = 1
                }

                liarButton.visibility = android.view.View.VISIBLE
            }
        }

        diceBidSelect2.setOnClickListener {
            if (selectedBidAmount >= bidAmount2 &&
                selectedBidAmount >= bidAmount3 &&
                selectedBidAmount >= bidAmount4 &&
                selectedBidAmount >= bidAmount5 &&
                selectedBidAmount >= bidAmount6
            ) {
                if (diceBidText1.text.equals("")) {
                    diceBidText1.text = ("${selectedBidAmount}x")
                    diceBidImage1.setImageResource(R.drawable.dice_2)
                    diceBidImage1.contentDescription = ("2")
                } else if (diceBidText2.text.equals("")) {
                    diceBidText2.text = ("${selectedBidAmount}x")
                    diceBidImage2.setImageResource(R.drawable.dice_2)
                    diceBidImage2.contentDescription = ("2")
                } else if (diceBidText3.text.equals("")) {
                    diceBidText3.text = ("${selectedBidAmount}x")
                    diceBidImage3.setImageResource(R.drawable.dice_2)
                    diceBidImage3.contentDescription = ("2")
                } else if (diceBidText4.text.equals("")) {
                    diceBidText4.text = ("${selectedBidAmount}x")
                    diceBidImage4.setImageResource(R.drawable.dice_2)
                    diceBidImage4.contentDescription = ("2")
                } else if (diceBidText5.text.equals("")) {
                    diceBidText5.text = ("${selectedBidAmount}x")
                    diceBidImage5.setImageResource(R.drawable.dice_2)
                    diceBidImage5.contentDescription = ("2")
                } else if (diceBidText6.text.equals("")) {
                    diceBidText6.text = ("${selectedBidAmount}x")
                    diceBidImage6.setImageResource(R.drawable.dice_2)
                    diceBidImage6.contentDescription = ("2")
                } else if (diceBidText7.text.equals("")) {
                    diceBidText7.text = ("${selectedBidAmount}x")
                    diceBidImage7.setImageResource(R.drawable.dice_2)
                    diceBidImage7.contentDescription = ("2")
                } else if (diceBidText8.text.equals("")) {
                    diceBidText8.text = ("${selectedBidAmount}x")
                    diceBidImage8.setImageResource(R.drawable.dice_2)
                    diceBidImage8.contentDescription = ("2")
                } else if (diceBidText9.text.equals("")) {
                    diceBidText9.text = ("${selectedBidAmount}x")
                    diceBidImage9.setImageResource(R.drawable.dice_2)
                    diceBidImage9.contentDescription = ("2")
                } else if (diceBidText10.text.equals("")) {
                    diceBidText10.text = ("${selectedBidAmount}x")
                    diceBidImage10.setImageResource(R.drawable.dice_2)
                    diceBidImage10.contentDescription = ("2")
                } else if (diceBidText11.text.equals("")) {
                    diceBidText11.text = ("${selectedBidAmount}x")
                    diceBidImage11.setImageResource(R.drawable.dice_2)
                    diceBidImage11.contentDescription = ("2")
                } else if (diceBidText12.text.equals("")) {
                    diceBidText12.text = ("${selectedBidAmount}x")
                    diceBidImage12.setImageResource(R.drawable.dice_2)
                    diceBidImage12.contentDescription = ("2")
                } else if (diceBidText13.text.equals("")) {
                    diceBidText13.text = ("${selectedBidAmount}x")
                    diceBidImage13.setImageResource(R.drawable.dice_2)
                    diceBidImage13.contentDescription = ("2")
                } else if (diceBidText14.text.equals("")) {
                    diceBidText14.text = ("${selectedBidAmount}x")
                    diceBidImage14.setImageResource(R.drawable.dice_2)
                    diceBidImage14.contentDescription = ("2")
                } else {
                    diceBidText15.text = ("${selectedBidAmount}x")
                    diceBidImage15.setImageResource(R.drawable.dice_2)
                    diceBidImage15.contentDescription = ("2")
                }

                bidAmount1 = selectedBidAmount + 1
                bidAmount2 = selectedBidAmount + 1
                bidAmount3 = selectedBidAmount
                bidAmount4 = selectedBidAmount
                bidAmount5 = selectedBidAmount
                bidAmount6 = selectedBidAmount
                lastBid = R.drawable.dice_2
                lastBidAmount = selectedBidAmount

                if (playersXTurn == 1) {
                    playerText.text = ("Player's 1 Turn")
                    playersXTurn = 2
                } else {
                    playerText.text = ("Player's 2 Turn")
                    playersXTurn = 1
                }

                liarButton.visibility = android.view.View.VISIBLE
            }
        }

        diceBidSelect3.setOnClickListener {
            if (selectedBidAmount >= bidAmount3 &&
                selectedBidAmount >= bidAmount4 &&
                selectedBidAmount >= bidAmount5 &&
                selectedBidAmount >= bidAmount6
            ) {
                if (diceBidText1.text.equals("")) {
                    diceBidText1.text = ("${selectedBidAmount}x")
                    diceBidImage1.setImageResource(R.drawable.dice_3)
                    diceBidImage1.contentDescription = ("3")
                } else if (diceBidText2.text.equals("")) {
                    diceBidText2.text = ("${selectedBidAmount}x")
                    diceBidImage2.setImageResource(R.drawable.dice_3)
                    diceBidImage2.contentDescription = ("3")
                } else if (diceBidText3.text.equals("")) {
                    diceBidText3.text = ("${selectedBidAmount}x")
                    diceBidImage3.setImageResource(R.drawable.dice_3)
                    diceBidImage3.contentDescription = ("3")
                } else if (diceBidText4.text.equals("")) {
                    diceBidText4.text = ("${selectedBidAmount}x")
                    diceBidImage4.setImageResource(R.drawable.dice_3)
                    diceBidImage4.contentDescription = ("3")
                } else if (diceBidText5.text.equals("")) {
                    diceBidText5.text = ("${selectedBidAmount}x")
                    diceBidImage5.setImageResource(R.drawable.dice_3)
                    diceBidImage5.contentDescription = ("3")
                } else if (diceBidText6.text.equals("")) {
                    diceBidText6.text = ("${selectedBidAmount}x")
                    diceBidImage6.setImageResource(R.drawable.dice_3)
                    diceBidImage6.contentDescription = ("3")
                } else if (diceBidText7.text.equals("")) {
                    diceBidText7.text = ("${selectedBidAmount}x")
                    diceBidImage7.setImageResource(R.drawable.dice_3)
                    diceBidImage7.contentDescription = ("3")
                } else if (diceBidText8.text.equals("")) {
                    diceBidText8.text = ("${selectedBidAmount}x")
                    diceBidImage8.setImageResource(R.drawable.dice_3)
                    diceBidImage8.contentDescription = ("3")
                } else if (diceBidText9.text.equals("")) {
                    diceBidText9.text = ("${selectedBidAmount}x")
                    diceBidImage9.setImageResource(R.drawable.dice_3)
                    diceBidImage9.contentDescription = ("3")
                } else if (diceBidText10.text.equals("")) {
                    diceBidText10.text = ("${selectedBidAmount}x")
                    diceBidImage10.setImageResource(R.drawable.dice_3)
                    diceBidImage10.contentDescription = ("3")
                } else if (diceBidText11.text.equals("")) {
                    diceBidText11.text = ("${selectedBidAmount}x")
                    diceBidImage11.setImageResource(R.drawable.dice_3)
                    diceBidImage11.contentDescription = ("3")
                } else if (diceBidText12.text.equals("")) {
                    diceBidText12.text = ("${selectedBidAmount}x")
                    diceBidImage12.setImageResource(R.drawable.dice_3)
                    diceBidImage12.contentDescription = ("3")
                } else if (diceBidText13.text.equals("")) {
                    diceBidText13.text = ("${selectedBidAmount}x")
                    diceBidImage13.setImageResource(R.drawable.dice_3)
                    diceBidImage13.contentDescription = ("3")
                } else if (diceBidText14.text.equals("")) {
                    diceBidText14.text = ("${selectedBidAmount}x")
                    diceBidImage14.setImageResource(R.drawable.dice_3)
                    diceBidImage14.contentDescription = ("3")
                } else {
                    diceBidText15.text = ("${selectedBidAmount}x")
                    diceBidImage15.setImageResource(R.drawable.dice_3)
                    diceBidImage15.contentDescription = ("3")
                }

                bidAmount1 = selectedBidAmount + 1
                bidAmount2 = selectedBidAmount + 1
                bidAmount3 = selectedBidAmount + 1
                bidAmount4 = selectedBidAmount
                bidAmount5 = selectedBidAmount
                bidAmount6 = selectedBidAmount
                lastBid = R.drawable.dice_3
                lastBidAmount = selectedBidAmount

                if (playersXTurn == 1) {
                    playerText.text = ("Player's 1 Turn")
                    playersXTurn = 2
                } else {
                    playerText.text = ("Player's 2 Turn")
                    playersXTurn = 1
                }

                liarButton.visibility = android.view.View.VISIBLE
            }
        }

        diceBidSelect4.setOnClickListener {
            if (selectedBidAmount >= bidAmount4 &&
                selectedBidAmount >= bidAmount5 &&
                selectedBidAmount >= bidAmount6
            ) {
                if (diceBidText1.text.equals("")) {
                    diceBidText1.text = ("${selectedBidAmount}x")
                    diceBidImage1.setImageResource(R.drawable.dice_4)
                    diceBidImage1.contentDescription = ("4")
                } else if (diceBidText2.text.equals("")) {
                    diceBidText2.text = ("${selectedBidAmount}x")
                    diceBidImage2.setImageResource(R.drawable.dice_4)
                    diceBidImage2.contentDescription = ("4")
                } else if (diceBidText3.text.equals("")) {
                    diceBidText3.text = ("${selectedBidAmount}x")
                    diceBidImage3.setImageResource(R.drawable.dice_4)
                    diceBidImage3.contentDescription = ("4")
                } else if (diceBidText4.text.equals("")) {
                    diceBidText4.text = ("${selectedBidAmount}x")
                    diceBidImage4.setImageResource(R.drawable.dice_4)
                    diceBidImage4.contentDescription = ("4")
                } else if (diceBidText5.text.equals("")) {
                    diceBidText5.text = ("${selectedBidAmount}x")
                    diceBidImage5.setImageResource(R.drawable.dice_4)
                    diceBidImage5.contentDescription = ("4")
                } else if (diceBidText6.text.equals("")) {
                    diceBidText6.text = ("${selectedBidAmount}x")
                    diceBidImage6.setImageResource(R.drawable.dice_4)
                    diceBidImage6.contentDescription = ("4")
                } else if (diceBidText7.text.equals("")) {
                    diceBidText7.text = ("${selectedBidAmount}x")
                    diceBidImage7.setImageResource(R.drawable.dice_4)
                    diceBidImage7.contentDescription = ("4")
                } else if (diceBidText8.text.equals("")) {
                    diceBidText8.text = ("${selectedBidAmount}x")
                    diceBidImage8.setImageResource(R.drawable.dice_4)
                    diceBidImage8.contentDescription = ("4")
                } else if (diceBidText9.text.equals("")) {
                    diceBidText9.text = ("${selectedBidAmount}x")
                    diceBidImage9.setImageResource(R.drawable.dice_4)
                    diceBidImage9.contentDescription = ("4")
                } else if (diceBidText10.text.equals("")) {
                    diceBidText10.text = ("${selectedBidAmount}x")
                    diceBidImage10.setImageResource(R.drawable.dice_4)
                    diceBidImage10.contentDescription = ("4")
                } else if (diceBidText11.text.equals("")) {
                    diceBidText11.text = ("${selectedBidAmount}x")
                    diceBidImage11.setImageResource(R.drawable.dice_4)
                    diceBidImage11.contentDescription = ("4")
                } else if (diceBidText12.text.equals("")) {
                    diceBidText12.text = ("${selectedBidAmount}x")
                    diceBidImage12.setImageResource(R.drawable.dice_4)
                    diceBidImage12.contentDescription = ("4")
                } else if (diceBidText13.text.equals("")) {
                    diceBidText13.text = ("${selectedBidAmount}x")
                    diceBidImage13.setImageResource(R.drawable.dice_4)
                    diceBidImage13.contentDescription = ("4")
                } else if (diceBidText14.text.equals("")) {
                    diceBidText14.text = ("${selectedBidAmount}x")
                    diceBidImage14.setImageResource(R.drawable.dice_4)
                    diceBidImage14.contentDescription = ("4")
                } else {
                    diceBidText15.text = ("${selectedBidAmount}x")
                    diceBidImage15.setImageResource(R.drawable.dice_4)
                    diceBidImage15.contentDescription = ("4")
                }

                bidAmount1 = selectedBidAmount + 1
                bidAmount2 = selectedBidAmount + 1
                bidAmount3 = selectedBidAmount + 1
                bidAmount4 = selectedBidAmount + 1
                bidAmount5 = selectedBidAmount
                bidAmount6 = selectedBidAmount
                lastBid = R.drawable.dice_4
                lastBidAmount = selectedBidAmount

                if (playersXTurn == 1) {
                    playerText.text = ("Player's 1 Turn")
                    playersXTurn = 2
                } else {
                    playerText.text = ("Player's 2 Turn")
                    playersXTurn = 1
                }

                liarButton.visibility = android.view.View.VISIBLE
            }
        }

        diceBidSelect5.setOnClickListener {
            if (selectedBidAmount >= bidAmount5 &&
                selectedBidAmount >= bidAmount6
            ) {
                if (diceBidText1.text.equals("")) {
                    diceBidText1.text = ("${selectedBidAmount}x")
                    diceBidImage1.setImageResource(R.drawable.dice_5)
                    diceBidImage1.contentDescription = ("5")
                } else if (diceBidText2.text.equals("")) {
                    diceBidText2.text = ("${selectedBidAmount}x")
                    diceBidImage2.setImageResource(R.drawable.dice_5)
                    diceBidImage2.contentDescription = ("5")
                } else if (diceBidText3.text.equals("")) {
                    diceBidText3.text = ("${selectedBidAmount}x")
                    diceBidImage3.setImageResource(R.drawable.dice_5)
                    diceBidImage3.contentDescription = ("5")
                } else if (diceBidText4.text.equals("")) {
                    diceBidText4.text = ("${selectedBidAmount}x")
                    diceBidImage4.setImageResource(R.drawable.dice_5)
                    diceBidImage4.contentDescription = ("5")
                } else if (diceBidText5.text.equals("")) {
                    diceBidText5.text = ("${selectedBidAmount}x")
                    diceBidImage5.setImageResource(R.drawable.dice_5)
                    diceBidImage5.contentDescription = ("5")
                } else if (diceBidText6.text.equals("")) {
                    diceBidText6.text = ("${selectedBidAmount}x")
                    diceBidImage6.setImageResource(R.drawable.dice_5)
                    diceBidImage6.contentDescription = ("5")
                } else if (diceBidText7.text.equals("")) {
                    diceBidText7.text = ("${selectedBidAmount}x")
                    diceBidImage7.setImageResource(R.drawable.dice_5)
                    diceBidImage7.contentDescription = ("5")
                } else if (diceBidText8.text.equals("")) {
                    diceBidText8.text = ("${selectedBidAmount}x")
                    diceBidImage8.setImageResource(R.drawable.dice_5)
                    diceBidImage8.contentDescription = ("5")
                } else if (diceBidText9.text.equals("")) {
                    diceBidText9.text = ("${selectedBidAmount}x")
                    diceBidImage9.setImageResource(R.drawable.dice_5)
                    diceBidImage9.contentDescription = ("5")
                } else if (diceBidText10.text.equals("")) {
                    diceBidText10.text = ("${selectedBidAmount}x")
                    diceBidImage10.setImageResource(R.drawable.dice_5)
                    diceBidImage10.contentDescription = ("5")
                } else if (diceBidText11.text.equals("")) {
                    diceBidText11.text = ("${selectedBidAmount}x")
                    diceBidImage11.setImageResource(R.drawable.dice_5)
                    diceBidImage11.contentDescription = ("5")
                } else if (diceBidText12.text.equals("")) {
                    diceBidText12.text = ("${selectedBidAmount}x")
                    diceBidImage12.setImageResource(R.drawable.dice_5)
                    diceBidImage12.contentDescription = ("5")
                } else if (diceBidText13.text.equals("")) {
                    diceBidText13.text = ("${selectedBidAmount}x")
                    diceBidImage13.setImageResource(R.drawable.dice_5)
                    diceBidImage13.contentDescription = ("5")
                } else if (diceBidText14.text.equals("")) {
                    diceBidText14.text = ("${selectedBidAmount}x")
                    diceBidImage14.setImageResource(R.drawable.dice_5)
                    diceBidImage14.contentDescription = ("5")
                } else {
                    diceBidText15.text = ("${selectedBidAmount}x")
                    diceBidImage15.setImageResource(R.drawable.dice_5)
                    diceBidImage15.contentDescription = ("5")
                }

                bidAmount1 = selectedBidAmount + 1
                bidAmount2 = selectedBidAmount + 1
                bidAmount3 = selectedBidAmount + 1
                bidAmount4 = selectedBidAmount + 1
                bidAmount5 = selectedBidAmount + 1
                bidAmount6 = selectedBidAmount
                lastBid = R.drawable.dice_5
                lastBidAmount = selectedBidAmount

                if (playersXTurn == 1) {
                    playerText.text = ("Player's 1 Turn")
                    playersXTurn = 2
                } else {
                    playerText.text = ("Player's 2 Turn")
                    playersXTurn = 1
                }

                liarButton.visibility = android.view.View.VISIBLE
            }
        }

        diceBidSelect6.setOnClickListener {
            if (selectedBidAmount >= bidAmount6) {
                if (diceBidText1.text.equals("")) {
                    diceBidText1.text = ("${selectedBidAmount}x")
                    diceBidImage1.setImageResource(R.drawable.dice_6)
                    diceBidImage1.contentDescription = ("6")
                } else if (diceBidText2.text.equals("")) {
                    diceBidText2.text = ("${selectedBidAmount}x")
                    diceBidImage2.setImageResource(R.drawable.dice_6)
                    diceBidImage2.contentDescription = ("6")
                } else if (diceBidText3.text.equals("")) {
                    diceBidText3.text = ("${selectedBidAmount}x")
                    diceBidImage3.setImageResource(R.drawable.dice_6)
                    diceBidImage3.contentDescription = ("6")
                } else if (diceBidText4.text.equals("")) {
                    diceBidText4.text = ("${selectedBidAmount}x")
                    diceBidImage4.setImageResource(R.drawable.dice_6)
                    diceBidImage4.contentDescription = ("6")
                } else if (diceBidText5.text.equals("")) {
                    diceBidText5.text = ("${selectedBidAmount}x")
                    diceBidImage5.setImageResource(R.drawable.dice_6)
                    diceBidImage5.contentDescription = ("6")
                } else if (diceBidText6.text.equals("")) {
                    diceBidText6.text = ("${selectedBidAmount}x")
                    diceBidImage6.setImageResource(R.drawable.dice_6)
                    diceBidImage6.contentDescription = ("6")
                } else if (diceBidText7.text.equals("")) {
                    diceBidText7.text = ("${selectedBidAmount}x")
                    diceBidImage7.setImageResource(R.drawable.dice_6)
                    diceBidImage7.contentDescription = ("6")
                } else if (diceBidText8.text.equals("")) {
                    diceBidText8.text = ("${selectedBidAmount}x")
                    diceBidImage8.setImageResource(R.drawable.dice_6)
                    diceBidImage8.contentDescription = ("6")
                } else if (diceBidText9.text.equals("")) {
                    diceBidText9.text = ("${selectedBidAmount}x")
                    diceBidImage9.setImageResource(R.drawable.dice_6)
                    diceBidImage9.contentDescription = ("6")
                } else if (diceBidText10.text.equals("")) {
                    diceBidText10.text = ("${selectedBidAmount}x")
                    diceBidImage10.setImageResource(R.drawable.dice_6)
                    diceBidImage10.contentDescription = ("6")
                } else if (diceBidText11.text.equals("")) {
                    diceBidText11.text = ("${selectedBidAmount}x")
                    diceBidImage11.setImageResource(R.drawable.dice_6)
                    diceBidImage11.contentDescription = ("6")
                } else if (diceBidText12.text.equals("")) {
                    diceBidText12.text = ("${selectedBidAmount}x")
                    diceBidImage12.setImageResource(R.drawable.dice_6)
                    diceBidImage12.contentDescription = ("6")
                } else if (diceBidText13.text.equals("")) {
                    diceBidText13.text = ("${selectedBidAmount}x")
                    diceBidImage13.setImageResource(R.drawable.dice_6)
                    diceBidImage13.contentDescription = ("6")
                } else if (diceBidText14.text.equals("")) {
                    diceBidText14.text = ("${selectedBidAmount}x")
                    diceBidImage14.setImageResource(R.drawable.dice_6)
                    diceBidImage14.contentDescription = ("6")
                } else {
                    diceBidText15.text = ("${selectedBidAmount}x")
                    diceBidImage15.setImageResource(R.drawable.dice_6)
                    diceBidImage15.contentDescription = ("6")
                }

                bidAmount1 = selectedBidAmount + 1
                bidAmount2 = selectedBidAmount + 1
                bidAmount3 = selectedBidAmount + 1
                bidAmount4 = selectedBidAmount + 1
                bidAmount5 = selectedBidAmount + 1
                bidAmount6 = selectedBidAmount + 1
                lastBid = R.drawable.dice_6
                lastBidAmount = selectedBidAmount

                if (playersXTurn == 1) {
                    playerText.text = ("Player's 1 Turn")
                    playersXTurn = 2
                } else {
                    playerText.text = ("Player's 2 Turn")
                    playersXTurn = 1
                }

                liarButton.visibility = android.view.View.VISIBLE
            }
        }
    }
}