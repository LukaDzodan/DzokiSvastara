package com.example.myapplication.counter_activity

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import com.example.myapplication.R

class CounterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val ime = Dzoki().ime

        val btn = findViewById<Button>(R.id.btnAddNumber)
        val lbl = findViewById<TextView>(R.id.lbl1)
        val lbl2 = findViewById<TextView>(R.id.tvCounter)
        val rb_za1 = findViewById<RadioButton>(R.id.rnOption1)
        val rb_za2 = findViewById<RadioButton>(R.id.rbOption2)
        val rb_za5 = findViewById<RadioButton>(R.id.rbOption3)


        var brojac = 0
        var desetice = 0
        btn.setOnClickListener() {
            if (rb_za5.isChecked) {
                val vrednost = brojac
                brojac += 5
                if (brojac / 10 > vrednost / 10) {
                    desetice++
                    lbl2.text = "Usli ste u $desetice. deseticu!"
                }

            } else if (rb_za2.isChecked) {
                val vrednost = brojac
                brojac += 2
                if (brojac / 10 > vrednost / 10) {
                    desetice++
                    lbl2.text = "Usli ste u $desetice. deseticu!"
                }

            } else {
                val vrednost = brojac
                brojac += 1
                if (brojac / 10 > vrednost / 10) {
                    desetice++
                    lbl2.text = "Usli ste u $desetice. deseticu!"
                }
            }
            lbl.text = brojac.toString()
            ////////////////////////////////////////////
            /*if(brojac == 10)
            {
                lbl2.text = "Cestitamo stigli ste do 10"
            }*/
            //////////////////////////////////////////////
            /*for(i in 0..brojac step 1 )
            {
            if(i%10==0)
            {
                lbl2.text = "Cestitamo stigli ste do " + i
            }
                else
            {
                lbl2.text = "Ovde ce pisati kada se uveca zasvaku deseticu! "
            }
            }
             */
        }
    }
}