package classCode.emplacement;

import classCode.Joueur;

import java.util.ArrayList;

public class Foret extends Terrain {
    private int nombreArbre;
    private float prix;

    private boolean foretAchete;

    private ArrayList<Arbre> tabArbre;

    public Foret(float width, float height, float x, float y, int nombreArbre, float prix, ArrayList<Arbre> tabArbre) {
        super(width, height, x, y);
        this.nombreArbre = nombreArbre;
        this.prix = prix;
        this.tabArbre = (ArrayList<Arbre>)tabArbre.clone();
        foretAchete=false;
    }

    public int getNombreArbre() {
        return nombreArbre;
    }

    public float getPrix() {
        return prix;
    }

    public boolean isForetAchete() {
        return foretAchete;
    }

    public ArrayList<Arbre> getTabArbre() {
        return tabArbre;
    }

    public boolean acheter(Joueur j){
        if(j.reduireArgent(this.prix)){
            foretAchete=true;
            return true;
        }
        return false;
    }
}
