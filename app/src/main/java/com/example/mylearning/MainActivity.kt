package com.example.mylearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButton = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButton)
            val cheese = cbCheese.isChecked
            val butter = cbButter.isChecked
            val ghee = cbGhee.isChecked

            val orderString = "You Selected a meal with\n"+
                    "${meat.text}"+
                    (if (cheese) "\nCheese" else "") +
                    (if (butter) "\nButter" else "") +
                    (if (ghee) "\nGhee" else "")
          tvResult.text = orderString.toString()
        }


    }
}