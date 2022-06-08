package classCode.travailleur;

public abstract class Travailleur {

    protected float salaire;
    protected int productivite;

    public Travailleur(float salaire, int productivite) {
        this.salaire = salaire;
        this.productivite = productivite;
    }

    public Travailleur() {
    }

    public float getSalaire() {
        return salaire;
    }

    public int getProductivite() {
        return productivite;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public void setProductivite(int productivite) {
        this.productivite = productivite;
    }

    public abstract void travail();

}
