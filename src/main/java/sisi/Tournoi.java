package sisi;

import java.util.ArrayList;
import java.util.Date;

public class Tournoi {
    private ArrayList<Club> clubsParticipant;
    private int nbMaximumParticipants;
    private int nbMinimumParticipants;
    private double cashPrice;
    private Date dateDebut;
    private double prixParticipation;
    private Sport sport;
    private Club[] gagnants;


    Tournoi(int nbMaximumParticipants,int nbMinimumParticipants,double cashPrice,Sport sport,Date dateDebut,double prixParticipation ){
        this.nbMaximumParticipants =nbMaximumParticipants;
        this.nbMinimumParticipants = nbMinimumParticipants;
        this.cashPrice =cashPrice;
        this.sport = sport;
        this.dateDebut = dateDebut;
        this.prixParticipation = prixParticipation;
        this.gagnants = new Club[3];
        this.clubsParticipant = new ArrayList<Club>();


    }

    public double getPrixParticipation(){
        return this.prixParticipation;
    }
    public Date getDateDebut(){
        return this.dateDebut;
    }

    public int getNbMaximumParticipants(){
        return this.nbMaximumParticipants;
    }
    public int getNbMinimumParticipants() {
        return this.nbMinimumParticipants;
    }

    public  Club[] getGagnants(){
        return this.gagnants;
    }
  

    public Sport getSport(){
        return this.sport;
    }

    public double getCashPrice(){
        return this.cashPrice;
    }
   

    public void addClub(Club club){
        this.clubsParticipant.add(club);
    }

    public double getPrixCreation(){
        return  (this.nbMaximumParticipants * (10 * this.sport.prestige )) +this.cashPrice;
    }

    public void setGagnants(Club[] gagnants){
        this.gagnants = gagnants;
    }

    public boolean tournoiPlein(){
        if(this.nbMaximumParticipants < this.clubsParticipant.size()){
            return  false;
        }
        return true;
    }
}
