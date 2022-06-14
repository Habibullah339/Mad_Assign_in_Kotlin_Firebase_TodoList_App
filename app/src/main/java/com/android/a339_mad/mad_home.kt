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



//    fun onButtonShowPopupWindowClick(view: View?) {
//
//        // inflate the layout of the popup window
//        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        val popupView: View = inflater.inflate(R.layout.popup_window, null)
//
//        // create the popup window
//        val width = LinearLayout.LayoutParams.WRAP_CONTENT
//        val height = LinearLayout.LayoutParams.WRAP_CONTENT
//        val focusable = true // lets taps outside the popup also dismiss it
//        val popupWindow = PopupWindow(popupView, width, height, focusable)
//
//        // show the popup window
//        // which view you pass in doesn't matter, it is only used for the window tolken
//        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0)
//
//        // dismiss the popup window when touched
//        popupView.setOnTouchListener(object : View.OnTouchListener {
//            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
//                popupWindow.dismiss()
//                return true
//            }
//        })
//    }

    fun onButtonShowPopupWindowClick(view: View?){
        val intent = Intent(this@mad_home, popup_window::class.java)
        startActivity(intent)
    }

fun newsfeed(view: View?){
    val intent =Intent(this, NewUserList::class.java)
    startActivity(intent)
}

}