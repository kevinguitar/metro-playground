package com.example.metroplayground

import com.example.common.ContributedInterface1
import com.example.common.ContributedInterface2
import com.example.common.ContributedInterface3
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesBinding
import dev.zacsweers.metro.Inject
import dev.zacsweers.metro.binding

@Inject
@ContributesBinding(AppScope::class, binding = binding<ContributedInterface1>())
@ContributesBinding(AppScope::class, binding = binding<ContributedInterface2>())
@ContributesBinding(AppScope::class, binding = binding<ContributedInterface3>())
class ExampleClass : ContributedInterface1, ContributedInterface2 {
    override fun interface1() {
        TODO("Not yet implemented")
    }

    override fun interface3() {
        TODO("Not yet implemented")
    }

    override fun interface2() {
        TODO("Not yet implemented")
    }

}