package app.sano.picchi.flashcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apple = CustomWord(R.drawable.furit_mark12_ringo,"りんご","apple")
        val berry = CustomWord(R.drawable.furit_mark11_ichigo,"いちご","strawberry")
        val cherry = CustomWord(R.drawable.furit_mark17_cherry,"さくらんぼ","cherry")
        val mikan = CustomWord(R.drawable.furit_mark18_mikan,"みかん","orange")
        val momo = CustomWord(R.drawable.furit_mark15_momo,"もも","Peach")

        addWord(apple)
        addWord(berry)
        addWord(cherry)
        addWord(mikan)
        addWord(momo)




//        //インスタンスを生成する
//        val nameTextView = TextView(applicationContext)
//        //TextViewクラスのtextプロパティに代入する
//        nameTextView.text = apple.name
//
//        //LinearLayoutインスタンスを生成する
//        val layout = LinearLayout(this.applicationContext)
//
//        //LinearLayoutの方向をHORIZONTALに設定する
//        layout.orientation = LinearLayout.HORIZONTAL
//
//        //imageViewのインスタンスを生成
//        val imageView = ImageView(this)
//
//        //appleが持っているリソースIDを使って画面をimageView設定する
//        imageView.setImageResource(apple.resId)
//
//        //小さい枠にImageViewとTextViewを入れる
//        layout.addView(imageView)
//        layout.addView(nameTextView)
//
//        //全体の枠に小さな枠を入れる
//        container.addView(layout)


    }

    private fun addWord(customWord: CustomWord){
        val nameTextView = TextView(this)
        nameTextView.text = customWord.name

        val name2TextView = TextView(this)
        name2TextView.text = customWord.name2

        val layout =LinearLayout(this)
        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)
        imageView.setImageResource(customWord.resId)

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(name2TextView)


        container.addView(layout)


    }

}
