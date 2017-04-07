package Classes.Controller;

import Classes.Model.Basket;
import Classes.Model.User;

/**
 * Created by Styrmir on 22.3.2017.
 */
public class Book {
    private User user;
    private Basket basket;

    //constructors
    public Book(){}


    //getters,setters
    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Basket getBasket(){
        return this.basket;
    }

    public void setBasket(Basket basket){
        this.basket = basket;
    }


    //methods
    private boolean checkValid(){
        return true;
    }

    private boolean storeData(){
        return true;
    }


    public boolean book(){
        return true;
    }

}
