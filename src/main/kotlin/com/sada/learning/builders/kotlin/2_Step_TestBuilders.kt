package com.sada.learning.builders.kotlin

import com.sada.learning.builders.java.*
import java.math.BigDecimal
import java.util.*
import java.util.function.Consumer

fun main(args: Array<String>) {

    val contrat = createContrat(object : Consumer<ContratBuilder> {
        override fun accept(t: ContratBuilder) {
            t.numero = "1A"
            t.produit = Produit.AUTO
            t.dateEffet = Date()

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

            t.aliments = Arrays.asList(alimentBuilder.build(), alimentsBuilder2.build())
        }
    })

    println(contrat)
}

private fun createContrat(contratBuilderConsumer: Consumer<ContratBuilder>): Contrat {
    val builder = ContratBuilder()
    contratBuilderConsumer.accept(builder)
    return builder.build()
}