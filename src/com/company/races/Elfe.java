package com.company.races;

import java.util.ArrayList;
import java.util.List;

public class Elfe implements IRace {

    List<ModRaces> modRaces = new ArrayList<ModRaces>();

    public Elfe() {
        ModRaces force = new ModRaces(TypeCarac.FORCE, -2);
        ModRaces dexterite = new ModRaces(TypeCarac.DEXTERITE, 2);
        this.modRaces.add(force);
        this.modRaces.add(dexterite);
    }

    @Override
    public List<ModRaces> getModRaceList() {
        return this.modRaces;
    }

    @Override
    public void setModRaceList(List<ModRaces> modRaceList) {
        this.modRaces = modRaceList;
    }
}
