import profils.IProfil;
import races.IRace;
import races.ModRaces;
import races.TypeCarac;


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
            ModRaces modRaces = race.getModRaceList().stream().findAny(item -> item.nom == carac);
            int baseValue = modRaces ? modRaces.getValue() : 0;
            Caracteristique caracteristique = new Caracteristique(carac, );
        }
    }
}
