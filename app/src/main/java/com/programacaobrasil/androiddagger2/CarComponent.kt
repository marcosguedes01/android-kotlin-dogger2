package com.programacaobrasil.androiddagger2

import dagger.Component

@Component
interface CarComponent {
    fun getCar():Car
}