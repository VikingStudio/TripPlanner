package Classes;

/**
 * Created by Styrmir on 22.3.2017.
 */
import java.util.*;

public class Search {
    private User user;
    private Date dateStart;
    private Date dateEnd;
    private double priceRangeMin;
    private double priceRangeMax;
    private String currencyType;
    private Preference[] preferences;

    //constructors
    public Search(){}

    //getters, setters
    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Date getDateStart(){
        return this.dateStart;
    }

    public void setDateStart(Date dateStart){
        this.dateStart = dateStart;
    }

    public Date getDateEnd(){
        return this.dateEnd;
    }

    public void setDateEnd(Date dateEnd){
        this.dateEnd = dateEnd;
    }

    public double getPriceRangeMin(){
        return this.priceRangeMin;
    }

    public void setPriceRangeMin(double priceRangeMin){
        this.priceRangeMin = priceRangeMin;
    }

    public double getPriceRangeMax(){
        return this.priceRangeMax;
    }

    public void setPriceRangeMax(double priceRangeMax){
        this.priceRangeMax = priceRangeMax;
    }

    public String getCurrencyType(){
        return this.currencyType;
    }

    public void setCurrencyType(String currencyType){
        this.currencyType = currencyType;
    }

    public Preference[] getPreferences(){
        return this.preferences;
    }

    public void setPreferences(Preference[] preferences){
        this.preferences = preferences;
    }



    //methods
    public Basket SearchAll(){
        return new Basket();
    }

    public Basket SearchFlights(){
        return new Basket();
    }

    public Basket SearchHotels(){
        return new Basket();
    }

    public Basket SearchTrips(){
        return new Basket();
    }

    public Basket SearchByUserProfileTags(){
        return new Basket();
    }

    public Basket SearchByCustomizedTags(){
        return new Basket();
    }


}
