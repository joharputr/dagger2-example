package com.example.dagger2

import dagger.Component

@Component
interface BattleComponent {
    fun inject(context: MainActivity)
}