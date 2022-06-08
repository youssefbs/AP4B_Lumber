package classCode.travailleur;

public class Bucheron extends Ouvrier {

    public Bucheron(float salaire, int productivite) {
        super(salaire, productivite);
    }

    public Bucheron() {
    }

    public void travail() {
        System.out.println("Je buche");
    }

    public void amelioration() {
        System.out.println("Je m'ameliore");
    }

}

}
