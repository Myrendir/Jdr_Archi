package com.company.profils;

public class Guerrier implements IProfil {
    int pv = 10;
    int niveau = 1;


    @Override
    public int getPv() {
        return this.pv;
    }

    @Override
    public void setPv(int pv) {
        this.pv = pv;
    }


    @Override
    public int getNiveau() {
        return this.niveau;
    }

    @Override
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }


    @Override
    public void incrementNiveau() {
        this.niveau++;
    }
}
