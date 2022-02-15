package com.nepplus.kotlinbasic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//      btnLog가 눌리면 어떤코드를 실행할지, 할 일을 설정
        btnLog.setOnClickListener {

//          로그를 찍어보는 기능 실행 ->btnLog가 클릭될 때 마다 실행
            Log.d("메인화면", "로그 버튼 눌림 ")
            Log.d("메인화면","추가 로그 찍어보기")
            Log.e("메인화면","e로 로그찍기")
        }

        btnToast.setOnClickListener {
            //토스트 버튼이 눌리면, Toast를 만들고 (makeText) 보여주기(show)
            Toast.makeText(this, "토스트 자동완성", Toast.LENGTH_SHORT).show()
        }

        btnVariable.setOnClickListener {
            //변수에 대한 문법 연습용 코드
            //본인의 이름을 변수에 담아보자. -> 토스트로 띄우자.
/*            var myName :String
            myName="서정민"
            myName="홍길동"*/
            var myName="서정민"

/*            val friendName:String
            friendName="이선생"*/
//            friendName="김선생"
            val friendName="이선생"

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

/*            var myBirthYear:Int
            myBirthYear=1988*/
            var myBirthYear=1988


/*            var myHeight:Double
            myHeight=180.7*/
            var myHeight =180.7

        }
    }
}