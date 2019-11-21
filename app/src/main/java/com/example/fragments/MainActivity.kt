package com.example.fragments

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fabSnackbar.setOnClickListener {

         Snackbar.make(it,"Its SnackBar",Snackbar.LENGTH_LONG).setAction("Action") {

             newToast("New Toast From Extension",Toast.LENGTH_LONG)

         }.show()

        }
    }
}


fun AppCompatActivity.newToast(  text:String,length:Int = Toast.LENGTH_SHORT){

    Toast.makeText(this, text, length).show()

}