package classCode.travailleur;

public class Planteur extends Ouvrier {

    public Planteur(float salaire, int productivite) {
        super(salaire, productivite);
    }

    public Planteur() {
    }

    public void travail() {
        System.out.println("Je plante");
    }

    public void amelioration() {
        System.out.println("Je m'ameliore");
    }

}
}
