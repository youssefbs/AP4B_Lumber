package classCode.transport;

public class Camion extends MoyenTransport implements Ameliorable {


    public Camion(String nom, String codeMoyenTransport, int capacite, int vitesse) {
        super(nom, codeMoyenTransport, capacite, vitesse);
    }

    public Camion() {
    }

    @Override
    public void afficher() {
        System.out.println("Camion : " + getNom() + " " + getCodeMoyenTransport() + " " + getCapacite() + " " + getVitesse());
    }

}

