package sisi;
import java.util.Date;

public class Sportif {

    String nom;
    String prenom;
    Date dateNaissance;
    Club club;
    double prestige;

    Sportif(String nom,String prenom, Date dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.club = null;
        this.prestige = 0;
    }

    public boolean isAdulte() {
		return true;
	}

    public boolean integrerClub(Club club){
        return true;
    }

    public void actualiserPrestige(double prestige){
        this.prestige += prestige;
    }

	public void afficherInformations() {
		System.out.print(" to do " );
	}

}
