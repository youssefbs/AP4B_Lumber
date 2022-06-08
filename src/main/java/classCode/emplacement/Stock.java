package classCode.emplacement;

import java.util.ArrayList;
import classCode.Joueur;

public class Stock extends Terrain {

    private int capacite;
    private int stockUtiliser;
    private int niveau;
    private ArrayList<Float> prix;
    private float xStock;
    private float yStock;
    private float widthStock;
    private float heightStock;


    public Stock(float width, float height, float x, float y, int capacite, int stockUtiliser, int niveau) {
        super(width, height, x, y);
        this.capacite = capacite;
        this.stockUtiliser = stockUtiliser;
        this.niveau = niveau;
        this.prix = (ArrayList<Float>)prix.clone();
    }

    public boolean augmenterNiveau(Joueur j){
        if(j.reduireArgent(this.prix.get(niveau)))
            return true;
        return false;
    }

    public boolean ajouterBois(int nb){
        if(capacite - stockUtiliser > nb){
                stockUtiliser= stockUtiliser + nb;
                return true;
        }
        return false;
    }

    public ArrayList<Float> getPrix(){
        return prix;
    }

    public int getStockUtiliser(){
        return stockUtiliser;
    }

    public int getCapacite(){
        return capacite;
    }

    public int getNiveau(){
        return niveau;
    }

    public float getWidthStock(){
        return widthStock;
    }

    public float getHeightStock(){
        return heightStock;
    }


}

