package com.example.ch04_1_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
//    lateinit var edt1 : EditText;
//    lateinit var edt2 : EditText;
//
//    lateinit var btn1 : Button;
//    lateinit var btn2 : Button;
//    lateinit var btn3 : Button;
//    lateinit var btn4 : Button;
//
//    lateinit var tv1 : TextView;


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1.java 객체 만들기, 2.바인딩까지
        var edt1 : EditText = findViewById<EditText>(R.id.Edit1)
        var edt2 : EditText = findViewById<EditText>(R.id.Edit2)

        var btn1 : Button = findViewById<Button>(R.id.BtnAdd)
        var btn2 : Button = findViewById<Button>(R.id.BtnSub)
        var btn3 : Button = findViewById<Button>(R.id.BtnMul)
        var btn4 : Button = findViewById<Button>(R.id.BtnDiv)
        var btn5 : Button = findViewById<Button>(R.id.BtnRem)

        var tv1 : TextView = findViewById<TextView>(R.id.TextResult)
        
        //3.이벤트 처리(버튼) -> 에딧텍스트에서 값 가져와서, -> result 텍스트뷰에 출력
        btn1.setOnTouchListener { v, motionEvent ->

            //EditText형 -> String 형으로
            var str1 : String = edt1.text.toString()
            var str2 : String = edt2.text.toString()

            //String 형 -> Integer형으로
            if(str1.trim().equals("") || str2.trim().equals(""))//둘 중에 하나라도 공백이면
            {
                Toast.makeText(applicationContext,"값이 입력해주세요!",Toast.LENGTH_SHORT).show();
            }
            else //지대로 된거임
            {
                var n1: Int = Integer.parseInt(str1)
                var n2: Int = Integer.parseInt(str2)

                var result: Int = n1 + n2

                tv1.setText("계산 결과: " + result.toString())
            }
            false
        }

        //3.이벤트 처리(버튼) -> 에딧텍스트에서 값 가져와서, -> result 텍스트뷰에 출력
        btn2.setOnTouchListener { v, motionEvent ->

            tv1.setText("계산 결과: "+(Integer.parseInt(edt1.text.toString())
                                   - Integer.parseInt(edt2.text.toString())).toString())

            false
        }

        btn3.setOnTouchListener { v, motionEvent ->

            //EditText형 -> String 형으로
            var str1 : String = edt1.text.toString()
            var str2 : String = edt2.text.toString()

            //String 형 -> Integer형으로
            if(str1.trim().equals("") || str2.trim().equals(""))//둘 중에 하나라도 공백이면
            {
                Toast.makeText(applicationContext,"값이 입력해주세요!",Toast.LENGTH_SHORT).show();
            }
            else //지대로 된거임
            {
                var n1: Int = Integer.parseInt(str1)
                var n2: Int = Integer.parseInt(str2)

                var result: Int = n1 * n2

                tv1.setText("계산 결과: " + result.toString())
            }

            false
        }

        btn4.setOnTouchListener { v, motionEvent ->

            //EditText형 -> String 형으로
            var str1 : String = edt1.text.toString()
            var str2 : String = edt2.text.toString()

            if(str1.trim().equals("") || str2.trim().equals(""))//둘 중에 하나라도 공백이면
            {
                Toast.makeText(applicationContext,"값이 입력해주세요!",Toast.LENGTH_SHORT).show();
            }
            else //지대로 된거임
            {
                if(str2.trim() == "0")
                {
                    Toast.makeText(applicationContext,"0으로 나눌수 없어요!",Toast.LENGTH_SHORT).show();
                }
                else //0아님
                {
                    var n1: Double = str1.toDouble()
                    var n2: Double = str2.toDouble()

                    var result: Double = (((n1 / n2)*100).toInt())/100.0

                    tv1.setText("계산 결과: " + result.toString())
                }
               
            }

            false
        }

//        btn5.setOnTouchListener { v, motionEvent ->
//
//            //EditText형 -> String 형으로
//            var str1 : String = edt1.text.toString()
//            var str2 : String = edt2.text.toString()
//
//            //String 형 -> Integer형으로
//            var n1 : Int = Integer.parseInt(str1)
//            var n2 : Int = Integer.parseInt(str2)
//
//            var result : Int = n1 % n2
//
//            tv1.setText("계산 결과: "+result.toString())
//
//            false
//        }

        btn5.setOnClickListener {
            //EditText형 -> String 형으로
            var str1 : String = edt1.text.toString().trim()
            var str2 : String = edt2.text.toString().trim()

            if(str1 == "" || str2 == "")//둘 중에 하나라도 공백이면
            {
                Toast.makeText(applicationContext,"값이 입력해주세요!",Toast.LENGTH_SHORT).show();
            }
            else //지대로 된거임
            {
                //String 형 -> Integer형으로
                var n1 : Int = Integer.parseInt(str1)
                var n2 : Int = Integer.parseInt(str2)

                var result : Int = n1 % n2

                tv1.setText("계산 결과: "+result.toString())
            }


        }

    }
}