package com.example.scikal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.tan

class MainActivity : AppCompatActivity() {
    lateinit var tvPrimary: TextView
    lateinit var tvSecondary: TextView
    lateinit var AcBtn: Button
    lateinit var CBtn: Button
    lateinit var Brack1Btn: Button
    lateinit var Brack2Btn: Button
    lateinit var sinBtn: Button
    lateinit var cosBtn: Button
    lateinit var tanBtn: Button
    lateinit var logBtn: Button
    lateinit var lnBtn: Button
    lateinit var factBtn: Button
    lateinit var squareBtn: Button
    lateinit var squareRootBtn: Button
    lateinit var InvBtn: Button
    lateinit var divBtn: Button
    lateinit var Btn1: Button
    lateinit var Btn2: Button
    lateinit var Btn3: Button
    lateinit var Btn4: Button
    lateinit var Btn5: Button
    lateinit var Btn6: Button
    lateinit var Btn7: Button
    lateinit var Btn8: Button
    lateinit var Btn9: Button
    lateinit var Btn0: Button
    lateinit var pieBtn: Button
    lateinit var pointBtn: Button
    lateinit var addBtn: Button
    lateinit var subBtn: Button
    lateinit var mulBtn: Button
    lateinit var equalBtn: Button








    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvPrimary=findViewById(R.id.tvPrimary)
        tvSecondary=findViewById(R.id.tvSecondary)
        AcBtn=findViewById(R.id.btnAc)
        CBtn=findViewById(R.id.btnC)
        Brack1Btn=findViewById(R.id.brack1)
        Brack2Btn=findViewById(R.id.brack2)
        sinBtn=findViewById(R.id.btnSin)
        cosBtn=findViewById(R.id.btnCos)
        tanBtn=findViewById(R.id.btnTan)
        logBtn=findViewById(R.id.btnLog)
        lnBtn=findViewById(R.id.btnLn)
        factBtn=findViewById(R.id.btnFact)
        squareBtn=findViewById(R.id.btnSq)
        squareRootBtn=findViewById(R.id.btnSqRoot)
        InvBtn=findViewById(R.id.btnInv)
        divBtn=findViewById(R.id.btnDiv)
        mulBtn=findViewById(R.id.btnMul)
        Btn1=findViewById(R.id.btn1)
        Btn2=findViewById(R.id.btn2)
        Btn3=findViewById(R.id.btn3)
        Btn4=findViewById(R.id.btn4)
        Btn5=findViewById(R.id.btn5)
        Btn6=findViewById(R.id.btn6)
        Btn7=findViewById(R.id.btn7)
        Btn8=findViewById(R.id.btn8)
        Btn9=findViewById(R.id.btn9)
        Btn0=findViewById(R.id.btn0)
        pieBtn=findViewById(R.id.btnPie)
        pointBtn=findViewById(R.id.btnDot)
        addBtn=findViewById(R.id.btnAdd)
        subBtn=findViewById(R.id.btnSub)
        equalBtn=findViewById(R.id.btnEqual)

        Btn0.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"0")
        }
        Btn1.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"1")
        }
        Btn2.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"2")
        }
        Btn3.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"3")
        }
        Btn4.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"4")
        }
        Btn5.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"5")
        }
        Btn6.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"6")
        }
        Btn7.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"7")
        }
        Btn8.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"8")

        }
        Btn9.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"9")
        }
        pointBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+".")
        }
        addBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"+")
        }
        divBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"/")
        }
        Brack1Btn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"(")
        }
        Brack2Btn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+")")
        }
        pieBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"3.142")
            tvSecondary.text=(tvSecondary.text.toString())
        }
        sinBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"sin")
        }
        cosBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"cos")
        }
        tanBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"tan")
        }
        InvBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"^"+"(-1)")
        }
        lnBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"ln")
        }
        logBtn.setOnClickListener{
            tvPrimary.text=( tvPrimary.text.toString()+"log")
        }
        subBtn.setOnClickListener{
           val str:String=tvPrimary.text.toString()
            if(!str.get(index=str.length-1).equals("-")){
                tvPrimary.text=(tvPrimary.text.toString()+"-")
            }
        }
        mulBtn.setOnClickListener{
            val str:String=tvPrimary.text.toString()
            if(!str.get(index=str.length-1).equals("*")){
                tvPrimary.text=(tvPrimary.text.toString()+"*")
            }
        }
        squareRootBtn.setOnClickListener{
           if(tvPrimary.text.toString().isEmpty()){
               Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
           }
            else{
                val str:String=tvPrimary.text.toString()
               val r=Math.sqrt(str.toDouble())
               val result=r.toString()
               tvPrimary.text=result
           }
        }
        AcBtn.setOnClickListener{
            tvPrimary.text=""
            tvSecondary.text=""
        }
        CBtn.setOnClickListener{
        var str:String=tvPrimary.text.toString()
        if(!str.equals("")){
            str=str.substring(0,str.length-1)
            tvPrimary.text=str
        }
        }
        squareBtn.setOnClickListener{
            if(tvPrimary.text.toString().isEmpty()){
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
                val d:Double=tvPrimary.text.toString().toDouble()
                val square=d*d
                tvPrimary.text=square.toString()
                tvPrimary.text=square.toString()
                tvSecondary.text=square.toString()
            }
        }
        factBtn.setOnClickListener{
            if(tvPrimary.text.toString().isEmpty()){
                Toast.makeText(this, "please enter a valid number", Toast.LENGTH_SHORT).show()
            }
            else{
              val  value:Int=tvPrimary.text.toString().toInt()
                val fact:Int=factorial(value)
                tvPrimary.text=fact.toString()
                tvSecondary.text=fact.toString()
            }}

        equalBtn.setOnClickListener{
        val str:String=tvPrimary.text.toString()
            val result:Double=evaluate(str)
            val r=result.toString()
            tvPrimary.text=r
            tvSecondary.text=str


    }
}
    fun factorial(n:Int):Int{
        return if(n==1||n==0)1 else n*factorial(n-1)
    }
}
fun evaluate(str: String): Double {
    return object : Any() {
        // on below line we are creating variable
        // for tracking the position and char pos.
        var pos = -1
        var ch = 0

        // below method is for moving to next character.
        fun nextChar() {
            // on below line we are incrementing our position
            // and moving it to next position.
            ch = if (++pos < str.length) str[pos].toInt() else -1
        }

        // this method is use to check the extra space
        // present int the expression and removing it.
        fun eat(charToEat: Int): Boolean {
            while (ch == ' '.toInt()) nextChar()
            // on below line we are checking the char pos
            // if both is equal then we are returning it to true.
            if (ch == charToEat) {
                nextChar()
                return true
            }
            return false
        }

        // below method is to parse our
        // expression and to get the ans
        // in this we are calling a parse
        // expression method to calculate the value.
        fun parse(): Double {
            nextChar()
            val x = parseExpression()
            if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
            return x
        }

        // in this method we will only perform addition and
        // subtraction operation on the expression.
        fun parseExpression(): Double {
            var x = parseTerm()
            while (true) {
                if (eat('+'.toInt())) x += parseTerm() // addition
                else if (eat('-'.toInt())) x -= parseTerm() // subtraction
                else return x
            }
        }

        // in below method we will perform
        // only multiplication and division operation.
        fun parseTerm(): Double {
            var x = parseFactor()
            while (true) {
                if (eat('*'.toInt())) x *= parseFactor() // multiplication
                else if (eat('/'.toInt())) x /= parseFactor() // division
                else return x
            }
        }

        // below method is use to parse the factor
        fun parseFactor(): Double {
            //on below line we are checking for addition
            // and subtraction and performing unary operations.
            if (eat('+'.toInt())) return parseFactor() // unary plus
            if (eat('-'.toInt())) return -parseFactor() // unary minus
            // creating a double variable for ans.
            var x: Double
            // on below line we are creating
            // a variable for position.
            val startPos = pos
            // on below line we are checking
            // for opening and closing parenthesis.
            if (eat('('.toInt())) { // parentheses
                x = parseExpression()
                eat(')'.toInt())
            } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) {
                // numbers
                while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                // on below line we are getting sub string from our string using start and pos.
                x = str.substring(startPos, pos).toDouble()
            } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) {
                // on below function we are checking for the operator in our expression.
                while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                val func = str.substring(startPos, pos)
                // calling a method to parse our factor.
                x = parseFactor()
                // on below line we are checking for square root.
                x =
                    if (func == "sqrt") Math.sqrt(x)
                    // on below line we are checking for sin function
                    // and calculating sin function using Math class.
                    else if (func == "sin") Math.sin(
                        Math.toRadians(x)
                        // on below line we are calculating the cos value
                    ) else if (func == "cos") Math.cos(
                        Math.toRadians(x)
                        // on below line we are calculating
                        // the tan value of our expression.
                    ) else if (func == "tan")
                        Math.tan(Math.toRadians(x))
                    // on below line we are calculating
                    // log value of the expression.
                    else if (func == "log")
                        Math.log10(x)
                    // on below line we are calculating
                    // ln value of expression.
                    else if (func == "ln") Math.log(x)
                    // f we get any error then
                    // we simply return the exception.
                    else throw RuntimeException(
                        "Unknown function: $func"
                    )
            } else {
                // if the condition not satisfy then we are returning the exception
                throw RuntimeException("Unexpected: " + ch.toChar())
            }
            // on below line we are calculating the power of the expression.
            if (eat('^'.toInt())) x = Math.pow(x, parseFactor()) // exponentiation
            return x
        }
        // at last calling a parse for our expression.
    }.parse()
}



