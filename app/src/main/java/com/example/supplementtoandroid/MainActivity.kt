package com.example.supplementtoandroid

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), NavigationInterface {

    val blankFragment = BlankFragment()
    val blankFragment2 = BlankFragment2()
    val blankFragment3 = BlankFragment3()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, blankFragment).commit()
    }

    override fun navigate(view: View) {
        when (view.id) {
            R.id.fab_add -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, blankFragment2).addToBackStack("SCREEN_2").commit()

            R.id.imageView_back1 -> supportFragmentManager.popBackStack()
            R.id.imageView_back -> supportFragmentManager.popBackStack()
            R.id.textView -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, blankFragment3).addToBackStack("SCREEN_3").commit()
        }
    }


}