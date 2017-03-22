/**
 * Created by Styrmir on 22.3.2017.
 */
public class UserProfile {
    private int id;
    private Image image;
    private String preferences;

    public UserProfile(){};

    //setters, getters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Image getImage(){
        return this.image;
    }

    public void setImage(Image image){
        this.image = image;
    }

    public String getPreferences(){
        return this.preferences;
    }

    public void setPreferences(String preferences){
        this.preferences = preferences;
    }
}
