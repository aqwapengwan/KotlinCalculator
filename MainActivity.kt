package android.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {
    var firstNumber = ""
    var secondNumber = ""
    var operator = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun textStringer (view: View){
        val resultTextView = findViewById<EditText>(R.id.result)
        var countString = resultTextView.text.toString()
        val b = (view as Button).text.toString()
        countString += b
        resultTextView.setText(countString)
    }

    fun clear (view: View){
        val resultTextView = findViewById<EditText>(R.id.result)
        resultTextView.setText("")
    }

    fun addition (view: View){
        val resultTextView = findViewById<EditText>(R.id.result)
        var countString = resultTextView.text.toString()
        val scanner = Scanner(countString)
        var line = scanner.nextLine()
        for(x in line) {
            if (x.isDigit()) {
                firstNumber += x
            }
        }
        operator = 1
        resultTextView.setText("")
    }

    fun subtraction (view: View){
        val resultTextView = findViewById<EditText>(R.id.result)
        var countString = resultTextView.text.toString()
        val scanner = Scanner(countString)
        var line = scanner.nextLine()
        for(x in line) {
            if (x.isDigit()) {
                firstNumber += x
            }
        }
        operator = 2
        resultTextView.setText("")
    }

    fun multiplication (view: View){
        val resultTextView = findViewById<EditText>(R.id.result)
        var countString = resultTextView.text.toString()
        val scanner = Scanner(countString)
        var line = scanner.nextLine()
        for(x in line) {
            if (x.isDigit()) {
                firstNumber += x
            }
        }
        operator = 3
        resultTextView.setText("")
    }

    fun division (view: View){
        val resultTextView = findViewById<EditText>(R.id.result)
        var countString = resultTextView.text.toString()
        val scanner = Scanner(countString)
        var line = scanner.nextLine()
        for(x in line) {
            if (x.isDigit()) {
                firstNumber += x
            }
        }
        operator = 4
        resultTextView.setText("")
    }

    fun equalsTotal (view: View){
        var endNum = 0.0
        val resultTextView = findViewById<EditText>(R.id.result)
        var countString = resultTextView.text.toString()
        val scanner = Scanner(countString)
        var line = scanner.nextLine()
        for(x in line){
            if(x.isDigit()){
                secondNumber += x
            }
        }
        if(operator == 1){
            endNum = firstNumber.toDouble() + secondNumber.toDouble()
        } else if (operator == 2){
            endNum = firstNumber.toDouble() - secondNumber.toDouble()
        } else if (operator == 3){
            endNum = firstNumber.toDouble() * secondNumber.toDouble()
        } else if (operator == 4){
            endNum = firstNumber.toDouble() / secondNumber.toDouble()
        }
        resultTextView.setText(endNum.toString())
    }

    fun countMe (view: View){
        // Get the text view
        val showCountTextView = findViewById<TextView>(R.id.result)

        val countString = showCountTextView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        showCountTextView.text = count.toString()
    }
}
