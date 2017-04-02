import java.util.List;
//import org.junit.assert.*;

public class SearchTest {

    private Basket basket;
    private List<Flight> flights;
    private List<Hotel> hotels;
    private List<Trip> trips;
    private Search search;

    //Before
    public void setUp(){
        this.search =new Search();
        this.basket = new Basket();

        //search pricemax
        search.setPriceRangeMax(100000);
        search.setCurrencyType("ISK");

        //flight 1
        Flight flight1 = new Flight();
        flight1.setPrice(24000.00);
        flight1.setPriceCurrency("ISK");

        //flight 2
        Flight flight2 = new Flight();
        flight2.setPrice(840.00);
        flight2.setPriceCurrency("GBT");

        //flight 1
        Trip trip1 = new Trip();
        trip1.setPrice(5000.00);
        trip1.setPriceCurrency("ISK");

        //flight 1
        Trip trip2 = new Trip();
        trip2.setPrice(8000.00);
        trip2.setPriceCurrency("ISK");

        //flight 1
        Hotel hotel1 = new Hotel();
        hotel1.setPrice(10000.00);
        hotel1.setPriceCurrency("ISK");

        //flight 1
        Hotel hotel2 = new Hotel();
        hotel2.setPrice(6000.00);
        hotel2.setPriceCurrency("ISK");


        basket.addFlight(flight1);
        basket.addFlight(flight2);
        basket.addTrip(trip1);
        basket.addTrip(trip2);
        basket.addHotel(hotel1);
        basket.addHotel(hotel2);

    }

    //After
    //deconstruction
    public void tearDown(){
        basket = null;
    }

    //Test
    //1) search for flight
    //2) return basket with constructed flights


    //3) check price max !> given max price
    public void testpriceMax(){
//        assertTrue(basket.getPrice() < search.getPriceRangeMax());
    }

    //4) check currency type == set currency price
    public void testCurrency(){
//        assertEquals(basket.getPriceCurrency(),"ISK");
    }
}
