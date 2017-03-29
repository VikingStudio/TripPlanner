/**
 * Created by Styrmir on 22.3.2017.
 */
public class Preference {
    private int id;
    private String name;
    private String summary;
    private String description;

    //constructor
    public Preference(){}

    //getters, setters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSummary(){
        return this.summary;
    }

    public void setSummary(String summary){
        this.summary = summary;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
