package com.sada.learning.builders.java;

import java.math.BigDecimal;

public class Garantie {

    private String code;
    private String libelle;
    private BigDecimal franchise;

    public Garantie(String code, String libelle, BigDecimal franchise) {
        this.code = code;
        this.libelle = libelle;
        this.franchise = franchise;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public BigDecimal getFranchise() {
        return franchise;
    }

    public void setFranchise(BigDecimal franchise) {
        this.franchise = franchise;
    }


    @Override
    public String toString() {
        return "Garantie{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", franchise=" + franchise +
                '}';
    }
}
