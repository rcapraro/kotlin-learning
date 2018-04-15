package com.sada.learning.builders.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

public final class ContratBuilderWithConsumer {
    private String numero;
    private Produit produit;
    private Date dateEffet;
    private List<Aliment> aliments;

    public ContratBuilderWithConsumer() {
        aliments = new ArrayList<>();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Date getDateEffet() {
        return dateEffet;
    }

    public void setDateEffet(Date dateEffet) {
        this.dateEffet = dateEffet;
    }

    public List<Aliment> getAliments() {
        return aliments;
    }

    public void setAliments(List<Aliment> aliments) {
        this.aliments = aliments;
    }

    public ContratBuilderWithConsumer with(Consumer<ContratBuilderWithConsumer> consumer) {
        consumer.accept(this);
        return this;
    }

    public Contrat build() {
        Contrat contrat = new Contrat(numero, produit, dateEffet, aliments);
        return contrat;
    }
}
