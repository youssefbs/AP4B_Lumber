package classCode;

public abstract Amelioration {

    public int valeur;
    public int niveau;

    public Amelioration(int valeur, int niveau) {
        this.valeur = valeur;
        this.niveau = niveau;
    }

    public Amelioration() {
    }

    public int getValeur() {
        return valeur;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public abstract void amelioration();

    
}