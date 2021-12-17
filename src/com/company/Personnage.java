package com.company;

import com.company.profils.IProfil;
import com.company.races.IRace;
import com.company.races.ModRaces;
import com.company.races.TypeCarac;


import java.util.ArrayList;
import java.util.List;

public class Personnage {

    public IProfil profil;
    public IRace race;
    public String nom;
    List<Caracteristique> caracteristiques = new ArrayList<Caracteristique>();

    public Personnage(IProfil profil, IRace race, String nom) {
        this.profil = profil;
        this.race = race;
        this.nom = nom;
        for (TypeCarac carac : TypeCarac.values()) {
            ModRaces modRaces = race.getModRaceList().stream().filter(item -> item.nom == carac).findAny().orElse(null);
            int baseValue = modRaces != null ? modRaces.getValue() : 0;
            Caracteristique caracteristique = new Caracteristique(carac, baseValue);
        }
    }
}
