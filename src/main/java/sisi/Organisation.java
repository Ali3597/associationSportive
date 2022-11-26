package sisi;

import java.util.ArrayList;

public class Organisation {
    private String nom;
    private Double budget;
    private ArrayList<Tournoi> nosTournois;

    Organisation(String nom,double budget ){
        this.nom = nom;
        this.budget = budget;
        this.nosTournois =  new ArrayList<Tournoi>();
    }

    public boolean creerTournoi(Tournoi tournoi) {
        return true;
    }

    public boolean inscrireEquipeTournoi(Tournoi tournoi, Club club) {
        return true;
    }

    public void declarerVainqueur(Tournoi tournoi,Club premier, Club second, Club troisieme) {

    }

}
