package com.example.admin.androiddagger

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

/**
 * Created by zjw on 2018/11/1.
 */
@Subcomponent(modules = [AndroidInjectionModule::class, MainSubcomponent.SubModule::class])
interface MainSubcomponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>() {

    }

    @Module
    class SubModule {
        @Provides
        fun provideName(): String {
            return MainActivity::class.java.name
        }
        @Provides
    fun provideStudent():Student{
            return Student()
        }
    }

}