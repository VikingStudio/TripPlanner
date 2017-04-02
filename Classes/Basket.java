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

    public void addHotel(Hotel hotel){
        hotels.add(hotel);
    }

    public void addTrip(Trip trip){
        trips.add(trip);
    }

    public void setFlights(List<Flight> flights){
        this.flights = flights;
    }

    public void setHotels(List<Hotel> hotels){
        this.hotels = hotels;
    }

    public List<Flight> getFlights(){
        return this.flights;
    }

    public double getPrice(){
        double priceTotal =0;
        for(int i=0;i < flights.size();i++)
            priceTotal =+ flights.get(i).getPrice();
        return priceTotal;
    }

    public String getPriceCurrency(){
        String pricecurrency1="1";
        String pricecurrency2="2";
        String pricecurrency3="3";

        for(int i=0;i < flights.size()-1;i++) {
            pricecurrency1 = flights.get(i).getPriceCurrency();
            if (flights.get(i).getPriceCurrency() != flights.get(i + 1).getPriceCurrency())
                return "Currency does not Match";
        }
        for(int i=0;i < trips.size();i++) {
            pricecurrency2 = flights.get(i).getPriceCurrency();
            if (hotels.get(i).getPriceCurrency() != hotels.get(i + 1).getPriceCurrency())
                return "Currency does not Match";
        }
        for(int i=0;i < hotels.size();i++) {
            pricecurrency3 = flights.get(i).getPriceCurrency();
            if (trips.get(i).getPriceCurrency() != trips.get(i + 1).getPriceCurrency())
                return "Currency does not Match";
        }
        if(pricecurrency1!=pricecurrency2||pricecurrency1!=pricecurrency2||pricecurrency2!=pricecurrency3)
            return "Currency does not Match";
        return pricecurrency1;
    }

    public Basket getAll(){
        return this;
    }

    //methods
    public boolean storeBasket(){
        return true;
    }
}
