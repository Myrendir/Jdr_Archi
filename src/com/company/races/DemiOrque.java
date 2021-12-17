package com.company.races;

import java.util.ArrayList;
import java.util.List;

public class DemiOrque implements IRace {


    List<ModRaces> modRaces = new ArrayList<ModRaces>();

    public DemiOrque() {
        ModRaces force = new ModRaces(TypeCarac.FORCE, 2);
        ModRaces intelligence = new ModRaces(TypeCarac.INTELLIGENCE, -2);
        ModRaces charisme = new ModRaces(TypeCarac.CHARISME, -2);
        this.modRaces.add(force);
        this.modRaces.add(intelligence);
        this.modRaces.add(charisme);
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
