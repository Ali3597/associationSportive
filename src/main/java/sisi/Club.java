package sisi;

import java.util.ArrayList;


public class Club {
    Sport sport;
    double budget;
    ArrayList<Sportif> Sportifs;
    double argentRemporte;
    ArrayList<Tournoi> historiqueTournoi;

    Club(Sport sport, double budget) {
        this.sport = sport;
        this.budget = budget;
        this.Sportifs = new ArrayList<Sportif>();
        this.argentRemporte = 0;
        this.historiqueTournoi = new ArrayList<Tournoi>();
    }

    public boolean participerTournoi(Tournoi tournoi) {
        return true;
    }

    public void refinancerClub(double montant){
        
    }

    public Boolean sportifCapableIntegration(Sportif sportif) {
        return true;
    }

    public Sportif avoirSportifAvecMoinsPrestige(){
        return new Sportif(null, null, null);
    }

    public void aficherTournoisVainqueur(){

    }

}
