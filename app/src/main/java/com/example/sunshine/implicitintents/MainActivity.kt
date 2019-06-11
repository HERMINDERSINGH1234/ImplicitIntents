package com.example.sunshine.implicitintents

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
//val KEY_1="NAME"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// for the calling of the particular website...
        /* button.setOnClickListener{
        intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/"))
            startActivity(intent)
            }
            */

        //for the calling of the any website with the help of the edit text ..

        /* button.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.${edt1.text.toString()}"))
            startActivity(intent)

        }
        // for the doubt that in this the ip address is not found in this... why ?????????????????????????????????????????????????????????
        */

        // this is the implicit intent for the call dialer in the view of the   #tel#  use of the fact ...,.,.,,.,.,

        /* button.setOnClickListener{
            intent=Intent(Intent.ACTION_DIAL, Uri.parse("tel:${edt1.text.toString()}"))
            startActivity(intent)
        }
          */

        // for this is the implicit intent for the gmail view of the fact that the speed is the high in this

      /*
         button.setOnClickListener {
            intent = Intent(Intent.ACTION_SEND, Uri.parse("mailto:${edt1.text.toString()}"))

            intent.putExtra(Intent.EXTRA_SUBJECT, "HEllo Noobs") //subject
            intent.putExtra(Intent.EXTRA_TEXT, "Byee")//body
            startActivity(intent)


        }
        */


        /// or

       /* button.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.putExtra(Intent.EXTRA_TEXT, "byeee")//body


            //  very very very very very very imp to open any of the createchooser for the email of the

            startActivity(Intent.createChooser(i, "Send Email"))
        }
        */

    }
}