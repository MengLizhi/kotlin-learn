package com.lizhiblue.happybirthday


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    final var TAG:String = "LIZHI-Main";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: -------------------")



        var textVeiw = TextView(this);
        textVeiw.setText("aa")
        textVeiw.setTextSize(60F);

        var customText = CustomText()

        var frameLayout =  findViewById<FrameLayout>(R.id.frameLayout);
        frameLayout.addView(textVeiw)

        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, customText).commit()

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: -----------------")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: -------------------")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: -------------------")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: -------------------")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: -------------------")
    }
}
