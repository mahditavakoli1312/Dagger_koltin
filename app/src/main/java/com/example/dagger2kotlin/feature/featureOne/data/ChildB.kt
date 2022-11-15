package com.example.dagger2.feature.featureOne.data

import javax.inject.Inject

class ChildB @Inject constructor(val c: ChildC) {
    val name = "B"
}