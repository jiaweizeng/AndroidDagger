package com.example.admin.androiddagger

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule

/**
 * Created by zjw on 2018/11/1.
 */
@Component(modules = [AndroidInjectionModule::class, AndroidSupportInjectionModule::class, MainModule::class, SecondModule::class])
interface AppComponent {
    fun inject(application: BalaApp)
}