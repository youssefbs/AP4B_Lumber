package classCode.emplacement;

public class Arbre extends Terrain {
    private int quantiteBois;
    private boolean etat;

    public Arbre(float width, float height, float x, float y, int quantiteBois) {
        super(width, height, x, y);
        this.quantiteBois = quantiteBois;
        this.etat = true;
    }

    public int getQuantiteBois() {
        return quantiteBois;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
}
