package classCode.transport;

public class Chariot extends MoyenTransport implements Ameliorable {

    public Chariot(String nom, String codeMoyenTransport, int capacite, int vitesse) {
        super(nom, codeMoyenTransport, capacite, vitesse);
    }

    public Chariot() {
    }

    @Override
    public void afficher() {
        System.out.println("Chariot : " + getNom() + " " + getCodeMoyenTransport() + " " + getCapacite() + " " + getVitesse());
    }


}
