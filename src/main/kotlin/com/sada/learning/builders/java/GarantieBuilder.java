package com.sada.learning.builders.java;

import java.math.BigDecimal;

public final class GarantieBuilder {
    private String code;
    private String libelle;
    private BigDecimal franchise;

    public GarantieBuilder() {
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

    public Garantie build() {
        Garantie garantie = new Garantie(code, libelle, franchise);
        return garantie;
    }
}
