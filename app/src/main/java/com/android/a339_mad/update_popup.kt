package com.android.a339_mad

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase


class update_popup : AppCompatActivity() {
  var dbref= FirebaseDatabase.getInstance().getReference("user")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.android.a339_mad.R.layout.update_popup)

    }

//    fun updatef(view: View){
//
//        val titleu=findViewById<EditText>(com.android.a339_mad.R.id.update_title).toString()
//        val descu=findViewById<EditText>(com.android.a339_mad.R.id.update_desc).toString()
//        val updatebtn=findViewById<Button>(com.android.a339_mad.R.id.updatebtn_popup)
//
//
//        updatebtn.setOnClickListener(){
//            updatedata(titleu, descu)
//            intent.getStringExtra("title").toString()
//            intent.getStringExtra("desc").toString()
//
//        }
//
//
//    }
// private  fun  updatedata(titleu: String, descu: String) {
//
//
//     val user = mapOf<String,String>(
//
//         "titleu" to titleu,
//         "descu" to descu,
//
//     )
//
//
//     //dbref.child("user").updateChildren(user).addOnSuccessListener
//
//     dbref.child("user").child("title").updateChildren(user)
//         .addOnSuccessListener{
//
////         titleu.text.clear()
////         descu.text.clear()
////         binding.lastname.text.clear()
////         binding.age.text.clear()
//         Toast.makeText(this,"Successfuly Updated",Toast.LENGTH_SHORT).show()
//
//
//     }.addOnFailureListener{
//
//         Toast.makeText(this,"Failed to Update",Toast.LENGTH_SHORT).show()
//
//     }



}


