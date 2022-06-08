package classCode.transport;

public abstract class MoyenTransport {

    private string nom;
    private string codeMoyenTransport;
    private int capacite;
    private int vitesse;

    public MoyenTransport(string nom, string codeMoyenTransport, int capacite, int vitesse) {
        this.nom = nom;
        this.codeMoyenTransport = codeMoyenTransport;
        this.capacite = capacite;
        this.vitesse = vitesse;
    }

    public MoyenTransport() {
    }

    public string getNom() {
        return nom;
    }

    public string getCodeMoyenTransport() {
        return codeMoyenTransport;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getVitesse() {
        return vitesse;
    }

    //Setters

    public void setNom(string nom) {
        this.nom = nom;
    }

    public void setCodeMoyenTransport(string codeMoyenTransport) {
        this.codeMoyenTransport = codeMoyenTransport;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    //Méthodes

    public abstract void afficher();


    

}
