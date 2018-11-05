package com.example.admin.androiddagger

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by zjw on 2018/11/1.
 */
@Module(subcomponents = [MainSubcomponent::class])
 abstract class MainModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder: MainSubcomponent.Builder): AndroidInjector.Factory<out Activity>

}