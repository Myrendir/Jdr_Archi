package com.company.races;

import java.util.ArrayList;
import java.util.List;

public class Nain implements IRace {

    List<ModRaces> modRaces = new ArrayList<ModRaces>();

    public Nain() {
        ModRaces constitution = new ModRaces(TypeCarac.CONSTITUTION, +2);
        ModRaces dexterite = new ModRaces(TypeCarac.DEXTERITE, -2);
        this.modRaces.add(constitution);
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
