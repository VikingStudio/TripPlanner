import java.util.List;

public class Basket {
    private List<Flight> flights;
    private List<Hotel> hotels;
    private List<Trip> trips;


    //constructors
    public Basket(){}


    //getters, setters
    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void setFlights(List<Flight> flights){
        this.flights = flights;
    }

    public List<Flight> getFlights(){
        return this.flights;
    }

    public Basket getAll(){
        return this;
    }

    //methods
    public boolean storeBasket(){
        return true;
    }
}
