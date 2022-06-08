package classCode;

public interface Ameliorable {

    public Amelioration niveauAmelioration;
    public List<Amelioration> listeAmeliorations;

    public void ameliorer();

    public Amelioration getNiveauAmelioration(){
        return niveauAmelioration;
    }

    public List<Amelioration> getListeAmeliorations(){
        return listeAmeliorations;
    }

    


}