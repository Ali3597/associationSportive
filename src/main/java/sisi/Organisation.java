package sisi;

import java.util.ArrayList;
import java.util.Date;

public class Organisation {
    private String nom;
    private Double budget;
    private ArrayList<Tournoi> nosTournois;

    Organisation(String nom,double budget ){
        this.nom = nom;
        this.budget = budget;
        this.nosTournois =  new ArrayList<Tournoi>();
    }

    public boolean creerTournoi(int nbMaximumParticipants,int nbMinimumParticipants,double cashPrice,Sport sport,Date dateDebut,double prixParticipation) {
        Tournoi tournoi = new Tournoi(nbMaximumParticipants, nbMinimumParticipants, cashPrice, sport, dateDebut, prixParticipation);
        if (nbMaximumParticipants > nbMinimumParticipants & tournoi.getPrixParticipation() < this.budget &  tournoi.getDateDebut().compareTo(new Date()) > 0 ){
            this.nosTournois.add(tournoi);
            return true;
        }
        return false;
    }

    public boolean monTournoi(Tournoi tounoi){
        if(this.nosTournois.contains(tounoi)){
            return true;
        }
        return false;
    }

    public boolean inscrireEquipeTournoi(Tournoi tournoi, Club club) {
        if (this.monTournoi(tournoi) & !tournoi.tournoiPlein()){
            tournoi.addClub(club);
        }
        return true;
    }

    public void declarerVainqueur(Tournoi tournoi,Club premier, Club second, Club troisieme) {
        if (this.monTournoi(tournoi)){
            tournoi.setGagnants(new Club[]{premier,second,troisieme} );
        }

    }

}
