package com.example.metroplayground

import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Includes

@DependencyGraph
interface FeatureGraph {
    fun inject(screen: FeatureScreen)

    @DependencyGraph.Factory
    interface Factory {
        fun create(
            @Includes serviceProvider: FeatureScreen.ServiceProvider
        ): FeatureGraph
    }
}