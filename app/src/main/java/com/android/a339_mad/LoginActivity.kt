package com.android.a339_mad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class LoginActivity: AppCompatActivity()

{
    val ref= FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun loginf(view: View)

    {
        val email=findViewById<EditText>(R.id.login_email)
        val password=findViewById<EditText>(R.id.login_password)
        val loginbtn=findViewById<Button>(R.id.login_btn)

        loginbtn.setOnClickListener(){


            ref.signInWithEmailAndPassword(

                email.text.toString().trim(),
                password.text.toString().trim())
                .addOnCompleteListener(){
                    if (it.isSuccessful){
                        val intent =Intent(this@LoginActivity, mad_home::class.java)
                        startActivity(intent)
                        Toast.makeText(this, " Login  Success", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, " Login Failed, Try Again", Toast.LENGTH_SHORT).show()

                    }
                }
        }



//    val intent =Intent(this@MainActivity, mad_home::class.java)
//    startActivity(intent)

    }


    fun click2(view: View)
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        //Toast.makeText(this,"I am X Neutral",Toast.LENGTH_SHORT).show()
    }

}