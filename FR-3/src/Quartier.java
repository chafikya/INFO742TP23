import java.util.ArrayList;
import java.util.List;

public class Quartier {
    String name;
    String Drapeau;
    List<String> habitant = new ArrayList<>();

    public Quartier (String name){
        this.name = name;
    }
    public String getListhabit(){
        return habitant.toString();
    }
    public String getDrapeau(){
        return Drapeau;
    }
    public String setDrapeau(){
        return Drapeau;
    }
    public void addhabitant(String quartier){
        habitant.add(quartier);
    }
}