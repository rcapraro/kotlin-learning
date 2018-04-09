package com.sada.learning.builders.java;

import java.util.Date;
import java.util.List;

public final class AlimentBuilder {
    private Integer ordre;
    private Date dateEntree;
    private Garantie garantie;

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public Date getDateEntree() {
        return dateEntree;
    }

    public void setDateEntree(Date dateEntree) {
        this.dateEntree = dateEntree;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    public Aliment build() {
        return new Aliment(ordre, dateEntree, garantie);
    }
}
