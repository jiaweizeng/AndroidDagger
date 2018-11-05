package com.example.admin.androiddagger

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var claName:String
    @Inject
    lateinit var student: Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("eee=main","-------$claName----------$student")
    }

    fun mainClick(view: View){
        when(view.id){
            R.id.btn_second->startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}
