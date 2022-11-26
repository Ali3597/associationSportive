package sisi;
import java.util.Date;

public class Sportif {

    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Club club;
    private double prestige;

    Sportif(String nom,String prenom, Date dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.club = null;
        this.prestige = 0;
    }

    public double getPrestige(){
        return this.prestige;
    }

    public void setClub(Club club){
        this.club = club;
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
