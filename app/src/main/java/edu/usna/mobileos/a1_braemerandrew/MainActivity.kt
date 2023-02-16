package edu.usna.mobileos.a1_braemerandrew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var textView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.viewText)
        val butZero: Button = findViewById(R.id.zeroBut)
        butZero.setOnClickListener(this)
        val butOne: Button = findViewById(R.id.oneBut)
        butOne.setOnClickListener(this)
        val butTwo: Button = findViewById(R.id.twoBut)
        butTwo.setOnClickListener(this)
        val butThree: Button = findViewById(R.id.threeBut)
        butThree.setOnClickListener(this)
        val butFour: Button = findViewById(R.id.fourBut)
        butFour.setOnClickListener(this)
        val butFive: Button = findViewById(R.id.fiveBut)
        butFive.setOnClickListener(this)
        val butSix: Button = findViewById(R.id.sixBut)
        butSix.setOnClickListener(this)
        val butSeven: Button = findViewById(R.id.sevenBut)
        butSeven.setOnClickListener(this)
        val butEight: Button = findViewById(R.id.eightBut)
        butEight.setOnClickListener(this)
        val butNine: Button = findViewById(R.id.nineBut)
        butNine.setOnClickListener(this)
        val butAC: Button = findViewById(R.id.acBut)
        butAC.setOnClickListener(this)
        val butPlusMinus: Button = findViewById(R.id.plusMinusBut)
        butPlusMinus.setOnClickListener(this)
        val butPercent: Button = findViewById(R.id.percBut)
        butPercent.setOnClickListener(this)
        val butDivision: Button = findViewById(R.id.divisionBut)
        butDivision.setOnClickListener(this)
        val butMultiplication: Button = findViewById(R.id.multBut)
        butMultiplication.setOnClickListener(this)
        val butMinus: Button = findViewById(R.id.minusBut)
        butMinus.setOnClickListener(this)
        val butPlus: Button = findViewById(R.id.plusBut)
        butPlus.setOnClickListener(this)
        val butEqual: Button = findViewById(R.id.equalBut)
        butEqual.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.oneBut -> textView.setText("1")
            else -> print("no button")
        }
    }
}