package com.example.common

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesGraphExtension
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.Named

@ContributesGraphExtension(Unit::class)
interface LoggedInGraph {
    fun inject(member: LoggedInScreen)

    @ContributesGraphExtension.Factory(scope = AppScope::class)
    interface Factory {
        fun createLoggedInGraph(): LoggedInGraph
    }
}

class LoggedInScreen {
    @Inject @Named("string")
    lateinit var string: String
}