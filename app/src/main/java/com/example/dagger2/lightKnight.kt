package com.example.dagger2
import javax.inject.Inject

//Membuat Class dan Menambahkan Construtor
class LightKnight @Inject constructor() {

    var senjata: Senjata = Senjata()

    //Membuat Fungsi yang mengembalikan Nilai String
    fun setEquip(): String {
        return "Kolempok LightKnight Bertempur Menggunakan ${senjata.pedang()}"
    }
}