package com.sada.learning.builders.java;

import java.util.Date;
import java.util.List;

public class Contrat {

    private String numero;
    private Produit produit;
    private Date dateEffet;
    private List<Aliment> alimentsList;

    public Contrat(String numero, Produit produit, Date dateEffet, List<Aliment> alimentsList) {
        this.numero = numero;
        this.produit = produit;
        this.dateEffet = dateEffet;
        this.alimentsList = alimentsList;
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

    public List<Aliment> getAlimentsList() {
        return alimentsList;
    }

    public void setAlimentsList(List<Aliment> alimentsList) {
        this.alimentsList = alimentsList;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "numero='" + numero + '\'' +
                ", produit=" + produit +
                ", dateEffet=" + dateEffet +
                ", alimentsList=" + alimentsList +
                '}';
    }
}
