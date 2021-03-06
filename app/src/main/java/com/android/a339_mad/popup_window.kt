package com.android.a339_mad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import org.w3c.dom.Text
import java.util.function.ToDoubleBiFunction


class popup_window: AppCompatActivity(){

private lateinit var db:DatabaseReference
private lateinit var title: TextView
private  lateinit var desc:TextView
private lateinit var popup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.popup_window)


    }
    fun realadd(view: View){
        title= findViewById(R.id.popup_add_titile)
        desc=findViewById(R.id.popup_desc)
        popup=findViewById(R.id.popup_add_btn)

        popup.setOnClickListener(){
          val mtitle=title.text.toString()
            val mdesc=desc.text.toString()
           db= FirebaseDatabase.getInstance().getReference("user")
            val user= todolist(mtitle, mdesc)
            db.child(mtitle).setValue(user).addOnSuccessListener {

                Toast.makeText(this@popup_window, "Data Saved", Toast.LENGTH_SHORT).show();
                val intent =Intent(this@popup_window, mad_home::class.java)
               startActivity(intent)
            }
                .addOnFailureListener{
                    Toast.makeText(this@popup_window, "Failed, Data Not Saved !!", Toast.LENGTH_SHORT).show();
                }
        }


    }




}
