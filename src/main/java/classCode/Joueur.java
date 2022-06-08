package classCode;

public class Joueur {
    private float argent;

    public Joueur(float argent) {
        this.argent = argent;
    }

    public float getArgent(){
        return argent;
    }

    public void ajoutArgent(float a){
        argent=argent+a;
    }

    public boolean reduireArgent(float a){
        if(argent<a){
            System.out.println("Echec");
            return false;
        }else{
            argent=argent-a;
            return true;
        }
    }
}
