package com.android.a339_mad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
  val ref= FirebaseAuth.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



fun signupf(view: View)

{
    val email=findViewById<EditText>(R.id.signup_email)
    val password=findViewById<EditText>(R.id.signup_password)
    val signupbtn=findViewById<Button>(R.id.signup_btn)
   signupbtn.setOnClickListener(){


       ref.createUserWithEmailAndPassword(

            email.text.toString().trim(),
           password.text.toString().trim())
           .addOnCompleteListener(){
               if (it.isSuccessful){
                   val intent =Intent(this@MainActivity, mad_home::class.java)
                  startActivity(intent)
                   Toast.makeText(this, " SignUp  Success", Toast.LENGTH_SHORT).show()
               }else{
                   Toast.makeText(this, " SignUp Failed, Try Again", Toast.LENGTH_SHORT).show()

               }
           }
   }



//    val intent =Intent(this@MainActivity, mad_home::class.java)
//    startActivity(intent)

}



    fun click(view: View)
    {
        val intent =Intent(this@MainActivity, LoginActivity::class.java)
        startActivity(intent)
        //Toast.makeText(this,"I am Habibullah",Toast.LENGTH_SHORT).show()
    }
}