package classCode.emplacement;

import java.util.ArrayList;

public class Usine extends Terrain{

    private ArrayList<Ligne> tabLigne;
    private Stock stock;

    public Usine(float width, float height, float x, float y, ArrayList<Ligne> tabLigne, Stock stock) {
        super(width, height, x, y);
        this.tabLigne = (ArrayList<Ligne>)tabLigne.clone();
        this.stock = stock;
    }

    // tableau de ligne
    // stockage
    //AchaterMachine

    
    public boolean acheterMachine(int a){
        
        return false;
    }

}
