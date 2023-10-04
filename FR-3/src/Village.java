import java.util.ArrayList;
import java.util.List;

public class Village {
    String name;
    List<String> quartiers = new ArrayList<>();
    public Village (String name){
        this.name = name;
    }
    public String getVillage(){
        return name;
    }
    public void addQuartier( String quartier ){
        quartiers.add(quartier);
    }
}
