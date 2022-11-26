package sisi;

import java.util.ArrayList;

public class Tournoi {
    private ArrayList<Club> clubParticipant;
    private int nbMaximumPArticipants;
    private double cashPrice;
    private double prixParticipation;
    private double prixCreation;
    private Sport sport;
    private Sportif[] gagnants;

    public double getPrixParticipation(){
        return this.prixParticipation;
    }

    public void addParticipant(){
        
    }

    public void definirPrixCreation(){

    }

    public void setGagnants(Sportif[] gagnants){
        this.gagnants = gagnants;
    }

    public boolean tournoiPlein(){
        return true;
    }
}
