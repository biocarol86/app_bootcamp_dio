package com.thor.todolist.extensions

import android.icu.text.MessageFormat.format
import android.text.format.DateFormat.format
import com.google.android.material.textfield.TextInputLayout
import java.lang.String.format
import java.text.MessageFormat.format
import java.text.SimpleDateFormat
import java.util.*

private val locale = Locale("pt", "BR")

fun Date.format() : String{
    return SimpleDateFormat("dd/MM/yyyy", locale).format(this)
}

var TextInputLayout.text : String
 get() = editText?.text?.toString() ?:""
 set(value){
     editText?.setText(value)
 }