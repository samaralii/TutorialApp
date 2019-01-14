package com.samaralii.firstapp

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn.setOnClickListener {

            val e = edittext.text.toString()

//            Toast.makeText(this@MainActivity, e, Toast.LENGTH_SHORT).show()


            val i = Intent(this@MainActivity, SecondActivity::class.java)
            i.putExtra("data", e)
            startActivity(i)

        }

    }

}
