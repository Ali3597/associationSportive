package sisi;

import java.util.ArrayList;

public class Club {
    private Sport sport;
    private double budget;
    private ArrayList<Sportif> sportifs;
    private ArrayList<Tournoi> historiqueTournoi;

    Club(Sport sport, double budget) {
        this.sport = sport;
        this.budget = budget;
        this.sportifs = new ArrayList<Sportif>();
        this.historiqueTournoi = new ArrayList<Tournoi>();
    }

    public boolean participerTournoi(Tournoi tournoi) {
        double aPayer = tournoi.getPrixParticipation();
        if  (this.budget > aPayer & !tournoi.tournoiPlein() ){
            this.historiqueTournoi.add(tournoi);
            return false;
        }

        return false;
    }
    public void refinancerClub(double montant){
        this.budget += montant;
    }
    
    public Boolean integrerSportif(Sportif sportif) {
        if (this.placeClub() ){
            this.sportifs.add(sportif);
            return true;
        }else if (sportif.getPrestige() > this.avoirSportifAvecMoinsPrestige().getPrestige() ) {
            Sportif sportifEjecte = this.avoirSportifAvecMoinsPrestige();
            this.ejecterSportif(sportifEjecte);
            this.sportifs.add(sportif);
            return true;
        }
        return false;
    }

    public void ejecterSportif(Sportif sportif){
        this.sportifs.remove(sportif);
        sportif.setClub(null);
    }

    public boolean placeClub(){
        if (this.sportifs.size() < this.sport.nbMaxParClub   ){
            return true;
        }
        return false;
    }
    public Sportif avoirSportifAvecMoinsPrestige(){
        Sportif moinsPrestigieux = this.sportifs.get(0);
        for(int i = 1 ; i < this.sportifs.size(); i++){
            if( this.sportifs.get(i).getPrestige() <= moinsPrestigieux.getPrestige()){
                moinsPrestigieux = this.sportifs.get(i);
            }
        }
        return moinsPrestigieux;
    }

    public void aficherTournoisVainqueur(){
        System.out.print(" to do " );
    }

}
