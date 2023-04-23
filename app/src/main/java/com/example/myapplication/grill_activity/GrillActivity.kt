package com.example.myapplication.grill_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.R
import java.text.SimpleDateFormat
import java.util.*

class GrillActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grill)

        val cbClassic = findViewById<CheckBox>(R.id.cbClassic)
        val cbDouble = findViewById<CheckBox>(R.id.cbDouble)
        val cbBeacon = findViewById<CheckBox>(R.id.cbBeacon)
        val cbTriplle = findViewById<CheckBox>(R.id.cbTriplle)
        val cbChess = findViewById<CheckBox>(R.id.cbChess)
        val cbHalapeno = findViewById<CheckBox>(R.id.cbHalapeno)

        val etBillFinish = findViewById<EditText>(R.id.BillFinish)
        val etCardNUmber = findViewById<EditText>(R.id.ptCardNumber)

        val rbPayWithCard = findViewById<RadioButton>(R.id.rbPayWithCard)
        val rbPayingWhenCome = findViewById<RadioButton>(R.id.rbPayingWhenCome)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnPay = findViewById<Button>(R.id.btnPay)

        val lblBillCart = findViewById<TextView>(R.id.lblBillCart)

        /*if (rbPayWithCard.isChecked) {
            ptCardNUmber.isEnabled = true
        } else {
            ptCardNUmber.isEnabled = false
        }*/

        btnPay.setOnClickListener {
            if(rbPayWithCard.isChecked || rbPayingWhenCome.isChecked) {
                lblBillCart.setText("Vas racun")
                var suma = 0
                val stringBuilder = StringBuilder()
                stringBuilder.append("Naziv \t\t\t\t\t\t Cena \n ------------------------------------- \n")
                if (cbClassic.isChecked) {
                    stringBuilder.append("Classic Burger \t\t 570\n")
                    suma += 570
                }
                if (cbDouble.isChecked) {
                    stringBuilder.append("Double Burger \t\t 690\n")
                    suma += 690
                }
                if (cbBeacon.isChecked) {
                    stringBuilder.append("Beacon Burger \t 650\n")
                    suma += 650
                }
                if (cbChess.isChecked) {
                    stringBuilder.append("Chess Burger \t\t 690\n")
                    suma += 690
                }
                if (cbHalapeno.isChecked) {
                    stringBuilder.append("Halapeno Burger  630\n")
                    suma += 630
                }
                if (cbTriplle.isChecked) {
                    stringBuilder.append("Triplee Burger \t\t 830\n")
                    suma += 830
                }
                stringBuilder.append("------------------------------------- \n UKUPNO: \t\t\t\t\t$suma\n")
                stringBuilder.append("------------------------------------- \n VREME PLACANJA: \n \t")
                val calendar = Calendar.getInstance()
                val dateFormat = SimpleDateFormat("dd.MM.yyyy. HH:mm", Locale.getDefault())
                val dateTimeString = dateFormat.format(calendar.time)

                stringBuilder.append(dateTimeString)
                stringBuilder.append("\n\n\n::::::::::::::::KRAJ::::::::::::::::")
                etBillFinish.setText(stringBuilder.toString())
            }
            else{
                val builder = AlertDialog.Builder(this)
                builder.setMessage("Niste izabrali nacin placanja!")
                builder.setTitle("UPOZORENJE!")
                val dialog:AlertDialog = builder.create()
                dialog.show()
            }
        }

        btnAdd.setOnClickListener {
            lblBillCart.setText("Korpa")
            var suma = 0
            val stringBuilder = StringBuilder()
            stringBuilder.append("Naziv \t\t\t\t\t\t Cena \n ------------------------------------- \n")
            if (cbClassic.isChecked) {
                stringBuilder.append("Classic Burger \t\t 570\n")
                suma += 570
            }
            if (cbDouble.isChecked) {
                stringBuilder.append("Double Burger \t\t 690\n")
                suma += 690
            }
            if (cbBeacon.isChecked) {
                stringBuilder.append("Beacon Burger \t 650\n")
                suma += 650
            }
            if (cbChess.isChecked) {
                stringBuilder.append("Chess Burger \t\t 690\n")
                suma += 690
            }
            if (cbHalapeno.isChecked) {
                stringBuilder.append("Halapeno Burger  630\n")
                suma += 630
            }
            if (cbTriplle.isChecked) {
                stringBuilder.append("Triplee Burger \t\t 690\n")
                suma += 830
            }
            etBillFinish.setText(stringBuilder.toString())
        }
    }
}