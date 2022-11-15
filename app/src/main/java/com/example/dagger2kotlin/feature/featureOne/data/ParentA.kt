package com.example.dagger2.feature.featureOne.data

import javax.inject.Inject

class ParentA @Inject constructor(val b: ChildB) {
    val name = "A"
}