package com.sada.learning.builders.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ContratBuilder {
    private String numero;
    private Produit produit;
    private Date dateEffet;
    private List<Aliment> aliments;

    public ContratBuilder() {
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

    public Contrat build() {
        Contrat contrat = new Contrat(numero, produit, dateEffet, aliments);
        return contrat;
    }
}
