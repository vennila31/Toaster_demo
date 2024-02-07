package com.tw.toaster_demo

import android.content.Context
import android.widget.Toast

object ToasterDemo {
    fun show(context : Context , message : String){
        Toast.makeText(context , message , Toast.LENGTH_SHORT).show()
    }

}