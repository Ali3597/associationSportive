package sisi;

public enum Sport {
    
    FOOTBALL(1.8,22),
    VOLLEYBALL(0.9,18),
    RUGBY(1.4,30),
    BASKETBALL(1.2,15),
    HANDBALL(0.8,24);

    Double prestige;
    int nbMaxParClub;

    Sport(Double prestige, int nbMaxParClub) {
        this.prestige = prestige;
        this.nbMaxParClub = nbMaxParClub;
    }
}
