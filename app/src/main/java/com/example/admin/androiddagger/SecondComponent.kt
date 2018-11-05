package com.example.admin.androiddagger

import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

/**
 * Created by zjw on 2018/11/1.
 */
@Subcomponent(modules = [AndroidInjectionModule::class, SecondComponent.SubModule::class])
interface SecondComponent : AndroidInjector<SecondActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<SecondActivity>() {
    }

    @Module
    class SubModule {
        @Provides
        fun provideName(): String {
            return SecondActivity::class.java.name
        }
    }

}