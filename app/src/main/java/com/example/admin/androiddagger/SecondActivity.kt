package com.example.admin.androiddagger

import android.os.Bundle
import android.util.Log
import javax.inject.Inject

/**
 * Created by zjw on 2018/11/1.
 */
class SecondActivity: BaseActivity() {

    @Inject
    lateinit var className:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("eee=second","-------$className")
    }
}