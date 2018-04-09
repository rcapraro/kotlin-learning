package com.sada.learning.builders.kotlin

import com.sada.learning.builders.java.*
import java.math.BigDecimal
import java.util.*

@DslMarker
annotation class ContractMarker

fun main(args: Array<String>) {

    //we can remove parenthesis as the last parameter is a lambda
    //we can also remove "this" keyword
    val contrat = createContrat {
        numero = "1A"
        produit = Produit.AUTO
        dateEffet = Date()

        aliment {
            dateEntree = Date()
            ordre = 1
            garantie {
                code = "GAR1"
                libelle = "GARANTIE 1"
                franchise = BigDecimal("1000")

                garantie {  } //add @ContractMarker to the builder and it should not compile
            }
        }

        aliment {
            dateEntree = Date()
            ordre = 2
            garantie {
                code = "GAR2"
                libelle = "GARANTIE 2"
                franchise = BigDecimal("5000")
            }
        }
    }

    println(contrat)
}

@ContractMarker
private fun createContrat(c: ContratBuilder.() -> Unit): Contrat {
    val builder = ContratBuilder()
    c(builder)
    return builder.build()
}

private fun ContratBuilder.aliment(a: AlimentBuilder.() -> Unit) {
    aliments.add(AlimentBuilder().apply(a).build())
}

@ContractMarker
private fun AlimentBuilder.garantie(g: GarantieBuilder.() -> Unit) {
    garantie = GarantieBuilder().apply(g).build();
}