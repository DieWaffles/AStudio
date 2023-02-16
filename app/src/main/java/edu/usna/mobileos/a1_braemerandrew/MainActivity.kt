package edu.usna.mobileos.a1_braemerandrew

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var textView : TextView
    lateinit var topView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.viewText)
        topView = findViewById(R.id.viewTop)
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
        val butPeriod: Button = findViewById(R.id.periodBut)
        butPeriod.setOnClickListener(this)

        if(resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            //do code here
            val firstArray: ArrayList<View> = findViewById<View>(R.id.oneCol).getTouchables()
            firstArray.addAll(findViewById<View>(R.id.twoCol).getTouchables())
            firstArray.addAll(findViewById<View>(R.id.threeCol).getTouchables())
            firstArray.addAll(findViewById<View>(R.id.fourCol).getTouchables())
            firstArray.addAll(findViewById<View>(R.id.fiveCol).getTouchables())
            firstArray.addAll(findViewById<View>(R.id.sixCol).getTouchables())
            firstArray.addAll(findViewById<View>(R.id.lastCol).getTouchables())
            for(e in firstArray){
                val newBut: Button = findViewById(e.id)
                newBut.setOnClickListener(this)
            }
        }
    }

    override fun onClick(v: View?) {
        var x: Button? = v as Button
        var num: String? = x?.getText().toString()
        if(num == "=" || num == "AC") {
            textView.setText("")
            topView.setText("")
        }
        else{
            var currText = textView.getText()
            currText = "$currText$num"
            textView.setText(currText)
            topView.setText(num)
        }
    }
}