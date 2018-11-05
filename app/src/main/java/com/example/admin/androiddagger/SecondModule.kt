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

@Module(subcomponents = [SecondComponent::class])
abstract class SecondModule {

    @Binds
    @IntoMap
    @ActivityKey(SecondActivity::class)
    abstract fun bindSecondActivityInjectorFactory(builder: SecondComponent.Builder): AndroidInjector.Factory<out Activity>

}