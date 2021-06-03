package com.example.projet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button : Button = findViewById(R.id.button)
        Button.setOnClickListener{citationHasard()}
    }
    private fun citationHasard() {
        val teste = Hasard()
        val personnageHasard = teste.test()
        val citationModifie : TextView= findViewById(R.id.exempleCitation)
        citationModifie.text = personnageHasard.toString()
        val changementCitation = when(personnageHasard){
            1 -> citationModifie.text = "Les faibles ne choisisent pas leurs façon de mourir"
            2 -> citationModifie.text ="Le roi des pirates, ce sera moi ! "
            3 -> citationModifie.text ="Je dessinerais une carte du monde entier "
            4 -> citationModifie.text ="Les animes c'est pour les enfants sah"
            else -> citationModifie.text ="Dans ce monde de chien autant etre le plus sauvage!"

        }
        val imageModifie : ImageView = findViewById(R.id.imageView)
        val changementImage = when(personnageHasard){
            1 -> R.drawable.law
            2 -> R.drawable.luffy
            3 -> R.drawable.nami
            4 -> R.drawable.one_piece
            else -> R.drawable.kaneki

        }
        imageModifie.setImageResource(changementImage)
        imageModifie.contentDescription = personnageHasard.toString()
    }



    class Hasard() {
        fun test(): Int {
            return (1..5).random()
        }
    }
}