package classCode.emplacement;

import java.util.ArrayList;

public class Machine  extends Terrain{
    private int tempsProduction;
    private String typeProduit;
    private float prix;
    private ArrayList<Float> prixAmelioration;
    private int niveau;

    public Machine(float width, float height, float x, float y, int tempsProduction, String typeProduit, float prix, ArrayList<Float> prixAmelioration, int niveau) {
        super(width, height, x, y);
        this.tempsProduction = tempsProduction;
        this.typeProduit = typeProduit;
        this.prix = prix;
        this.prixAmelioration = (ArrayList<Float>)prixAmelioration.clone();
        this.niveau = niveau;
    }

    public int getTempsProduction() {
        return tempsProduction;
    }

    public String getTypeProduit() {
        return typeProduit;
    }

    public float getPrix() {
        return prix;
    }

    public ArrayList<Float> getPrixAmelioration() {
        return prixAmelioration;
    }

    public int getNiveau() {
        return niveau;
    }


}
