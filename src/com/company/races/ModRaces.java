package com.company.races;

public class ModRaces {

    public TypeCarac nom;
    public int value;

    public ModRaces(TypeCarac nom, int value) {
        this.nom = nom;
        this.value = value;
    }

    public TypeCarac getNom() {
        return nom;
    }

    public void setNom(TypeCarac nom) {
        this.nom = nom;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
