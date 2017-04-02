import java.util.List;

public class SearchTest {

    private Basket basket;
    private List<Flight> flights;
    private Search search;

    //Before
    public void setUp(){
        this.basket = new Basket();

        //flight 1
        Flight flight1 = new Flight();
        flight1.setPrice(24000.00);
        flight1.setPriceCurrency("ISK");

        //flight 2
        Flight flight2 = new Flight();
        flight2.setPrice(840.00);
        flight2.setPriceCurrency("GBT");

        basket.addFlight(flight1);
        basket.addFlight(flight2);
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
    //4) check currency type == set currency price
    public void test(){
        
    }
}
