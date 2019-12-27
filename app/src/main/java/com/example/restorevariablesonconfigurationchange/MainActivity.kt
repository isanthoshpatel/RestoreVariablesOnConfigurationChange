package com.example.restorevariablesonconfigurationchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_increment.setOnClickListener {
            count++
            tv_count.setText(count.toString())
        }
        bt_decrement.setOnClickListener {
            count--
            tv_count.setText(count.toString())
        }
 /*

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count")
        }
  */

    }//onCreate

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putInt("count", count)
    }

     override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
         count = savedInstanceState.getInt("count")

         tv_count.setText(count.toString())
       }

}//MainActivity
