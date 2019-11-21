package com.example.fragments

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)



        fabSnackbar.setOnClickListener {

              val intent = Intent(this,ScrollViewActivity::class.java)





            startActivity(intent)



        }

        fabSnackbar.setOnLongClickListener{

            Snackbar.make(it, "Its SnackBar", Snackbar.LENGTH_LONG).setAction("Action") {

                newToast("New Toast From Extension", Toast.LENGTH_LONG)

            }.show()

            true
        }



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        return when (item.itemId) {
            R.id.menuSettings -> true
            else -> super.onOptionsItemSelected(item)


        }


    }


    fun AppCompatActivity.newToast(text: String, length: Int = Toast.LENGTH_SHORT) {

        Toast.makeText(this, text, length).show()

    }


}









