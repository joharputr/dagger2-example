package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //Deklarasi Variable dengan menggunakan Anotasi Inject
    @Inject
    lateinit var darkKnight: DarkKnight

    @Inject
    lateinit var lightKnight: LightKnight


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerBattleComponent.create().inject(this)

        click_me.setOnClickListener {
            //Menampilkan Data pada TextView yang diambil dari Fungsi setEquip dari kedua Class tersebut
            val getReport = lightKnight.setEquip() + " dan " + darkKnight.setEquip()
            report.text = getReport
        }
    }
}