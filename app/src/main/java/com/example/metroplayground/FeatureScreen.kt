package com.example.metroplayground

import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.Inject

interface Dependency

class FeatureScreen {
    @Inject
    lateinit var dependency: Dependency

    @ContributesTo(Unit::class)
    interface ServiceProvider {
        val dependency: Dependency // comment this line to break incremental
    }
}