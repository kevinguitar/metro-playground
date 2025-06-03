package com.example.metroplayground

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Includes
import dev.zacsweers.metro.Named

@DependencyGraph(AppScope::class, isExtendable = true)
interface AppGraph {
    @DependencyGraph.Factory
    interface Factory {
        fun create(@Includes stringProvider: StringProvider): AppGraph
    }
}

interface StringProvider {
    @Named("string")
    val string: String
}