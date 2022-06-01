package classCode.emplacement;

import classCode.Joueur;

public class Ligne extends Terrain {
    private float prix;
    private boolean etat;
    // tableau de machine

    public Ligne(float width, float height, float x, float y, float prix) {
        super(width, height, x, y);
        this.prix = prix;
        this.etat = false;
    }

    public boolean acheter(Joueur j){
        if(j.reduireArgent(this.prix)){
            etat=true;
            return true;
        }
        return false;
    }
}
