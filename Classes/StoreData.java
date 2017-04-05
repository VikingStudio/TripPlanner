package Classes;


/**
 * Created by Styrmir on 22.3.2017.
 */
public class StoreData {
    private User user;
    private UserProfile userProfile;
    private Basket basket;

    //constructors
    public StoreData(){}

    //getters, setters
    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public UserProfile getUserProfile(){
        return this.userProfile;
    }

    public void setUserProfile(UserProfile userProfile){
        this.userProfile = userProfile;
    }

    public Basket getBasket(){
        return this.basket;
    }

    public void setBasket(Basket basket){
        this.basket = basket;
    }



    //methods
    public boolean populateData(){
        return true;
    }

    public boolean storeData(){
        return true;
    }

}
