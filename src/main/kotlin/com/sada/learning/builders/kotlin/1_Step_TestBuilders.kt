package com.sada.learning.builders.kotlin

import com.sada.learning.builders.java.*
import java.math.BigDecimal
import java.util.*

/**
 * 1 -copy / paste builder code
 */
fun main(args: Array<String>) {

    val contratBuilder = ContratBuilder()
    contratBuilder.numero = "1A"
    contratBuilder.produit = Produit.AUTO
    contratBuilder.dateEffet = Date()

    val garantieBuilder = GarantieBuilder()
    garantieBuilder.code = "GAR1"
    garantieBuilder.libelle = "GARANTIE 1"
    garantieBuilder.franchise = BigDecimal("1000")

    val garantieBuilder2 = GarantieBuilder()
    garantieBuilder2.code = "GAR2"
    garantieBuilder2.libelle = "GARANTIE 2"
    garantieBuilder2.franchise = BigDecimal("5000")

    val alimentBuilder = AlimentBuilder()
    alimentBuilder.dateEntree = Date()
    alimentBuilder.ordre = 1
    alimentBuilder.garantie = garantieBuilder.build()

    val alimentsBuilder2 = AlimentBuilder()
    alimentsBuilder2.dateEntree = Date()
    alimentsBuilder2.ordre = 2
    alimentsBuilder2.garantie = garantieBuilder2.build()

    contratBuilder.aliments = Arrays.asList(alimentBuilder.build(), alimentsBuilder2.build())

    val contrat = contratBuilder.build()

    println(contrat)

}