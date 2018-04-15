package com.sada.learning.builders.java;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Consumer;

public class TestBuildersWithConsumer {

    public static void main(String[] args) {

        final ContratBuilderWithConsumer contratBuilder = new ContratBuilderWithConsumer();
        contratBuilder.with(it -> {
            it.setNumero("1A");
            it.setProduit(Produit.AUTO);
            it.setDateEffet(new Date());

            final GarantieBuilder garantieBuilder = new GarantieBuilder();
            garantieBuilder.setCode("GAR1");
            garantieBuilder.setLibelle("GARANTIE 1");
            garantieBuilder.setFranchise(new BigDecimal("1000"));

            final GarantieBuilder garantieBuilder2 = new GarantieBuilder();
            garantieBuilder2.setCode("GAR2");
            garantieBuilder2.setLibelle("GARANTIE 2");
            garantieBuilder2.setFranchise(new BigDecimal("5000"));

            final AlimentBuilder alimentBuilder = new AlimentBuilder();
            alimentBuilder.setDateEntree(new Date());
            alimentBuilder.setOrdre(1);
            alimentBuilder.setGarantie(garantieBuilder.build());

            final AlimentBuilder alimentBuilder2 = new AlimentBuilder();
            alimentBuilder2.setDateEntree(new Date());
            alimentBuilder2.setOrdre(1);
            alimentBuilder2.setGarantie(garantieBuilder2.build());

            it.setAliments(Arrays.asList(alimentBuilder.build(), alimentBuilder2.build()));
        });

        final Contrat contrat = contratBuilder.build();
        System.out.println(contrat);

    }
}
