package pt.ipt.dama.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find the button
        val auxRollTheDiceButton: Button = findViewById(R.id.rollTheDiceButton)
        // <=> val auxRollTheDiceButton = findViewById<Button>(R.id.rollTheDiceButton)
        auxRollTheDiceButton.setOnClickListener {
            rollTheDice()
        }
    }

    /**
     * 'roll' the dice
     *  ie, add a random value to the textview
     */
    private fun rollTheDice() {
        // get the random value
        val randomValue = Random().nextInt(6) + 1 // it will get values from 1 to 6
        // assign the random value to the TextView
        val auxDiceNumberTextView: TextView = findViewById(R.id.diceNumberTextView)
        auxDiceNumberTextView.text = randomValue.toString()


    }
}