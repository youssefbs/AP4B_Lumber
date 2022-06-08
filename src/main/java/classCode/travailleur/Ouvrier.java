package classCode.travailleur;

public abstract class Ouvrier extends Travailleur implements Formable {

    public Ouvrier(float salaire, int productivite) {
        super(salaire, productivite);
    }

    public Ouvrier() {
    }

    public abstract void amelioration();



}