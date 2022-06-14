package com.android.a339_mad

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*


class NewUserList : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var userRecyclerview : RecyclerView
    private lateinit var userArrayList : ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler)

        userRecyclerview = findViewById(R.id.recyclerview)
        userRecyclerview.layoutManager = LinearLayoutManager(this)
        userRecyclerview.setHasFixedSize(true)

        userArrayList = arrayListOf<User>()


        getUserData()

    }

    // Go to Update
    fun updatefunction(view: View)
    {
        val intent = Intent(this, update_popup::class.java)
        startActivity(intent)
        
    }
    

    // Delete Fun

    fun realdelet(view: View){

       var  delet= findViewById<ImageButton>(R.id.deletbtn)

       delet.setOnClickListener{
           val builder1 = AlertDialog.Builder(this)
           builder1.setMessage("Do you want to delete this item?")
           builder1.setCancelable(true)


           builder1.setPositiveButton(
               "Yes"
           )
           {
                   _, _ ->
                      dbref.child("user").child("title").removeValue()

              
           }

           builder1.setNegativeButton(
               "No"
           )
           { dialog, id -> dialog.cancel()
               Toast.makeText(this, " clicked No", Toast.LENGTH_SHORT).show()
           }

           val alert11 = builder1.create()
           alert11.show()
       }
    }



    private fun getUserData() {

        dbref = FirebaseDatabase.getInstance().getReference("user")

        dbref.addValueEventListener(object : ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {

                if (snapshot.exists()){

                    for (userSnapshot in snapshot.children){


                        val user = userSnapshot.getValue(User::class.java)
                        if (user != null) {
                            userArrayList.add(user)
                        }

                    }

                    userRecyclerview.adapter = NewAdapter(userArrayList)


                }

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")

            }


        })

    }
}
