package com.sada.learning.builders.java;

import java.util.Date;

public class Aliment {

    private Integer ordre;
    private Date dateEntree;
    private Garantie garantie;

    public Aliment(Integer ordre, Date dateEntree, Garantie garantie) {
        this.ordre = ordre;
        this.dateEntree = dateEntree;
        this.garantie = garantie;
    }

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

    @Override
    public String toString() {
        return "Aliment{" +
                "ordre=" + ordre +
                ", dateEntree=" + dateEntree +
                ", garantie=" + garantie +
                '}';
    }
}


