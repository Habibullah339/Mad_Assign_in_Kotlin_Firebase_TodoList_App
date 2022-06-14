package com.android.a339_mad

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.FirebaseFirestore


class mad_home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mad_home)
    }





    fun onButtonShowPopupWindowClick(view: View?){
        val intent = Intent(this@mad_home, popup_window::class.java)
        startActivity(intent)
    }

fun newsfeed(view: View?){
    val intent =Intent(this, NewUserList::class.java)
    startActivity(intent)
}

}
