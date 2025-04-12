package com.example.metroplayground

import dev.zacsweers.metro.ContributesBinding
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Inject

@DependencyGraph(Unit::class)
interface AppGraph

@Inject
@ContributesBinding(Unit::class)
class DependencyImpl : Dependency
