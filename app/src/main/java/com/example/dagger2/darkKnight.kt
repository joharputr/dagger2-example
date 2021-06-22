package com.example.dagger2

import javax.inject.Inject

class DarkKnight @Inject constructor() {

    //Membuat Fungsi yang Mengembalikan Nilai String
    fun setEquip(): String {
        return "Kolempok DarkKnight Bertempur Menggunakan tombak"
    }
}