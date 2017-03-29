// Gunnar M 27.03.17
public class Flight{
	private int id;
	private String name;
	//private Date time;
	private String departureLocation;
	private String arrivalLocation;
	private int availability;
	private double price;
	private String priceCurrency;

	public Flight(){}

	public void setId(int id){
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	//public void setTime(Date time){
	//	this.time = time;
	//}

	public void setDepartureLocation(String departureLocation){
		this.departureLocation = departureLocation;
	}

	public void setArrivalLocation(String arrivalLocation){
		this.arrivalLocation = arrivalLocation;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void setPriceCurrency(String priceCurrency){
		this.priceCurrency = priceCurrency;
	}

	public int getId(){
		return this.id;
	}

	public String getName(){
		return this.name;
	}

	//public getTime(){
	//	return this.time;
	//}

	public String getDepartureLocation(){
		return this.departureLocation;
	}

	public String getArrivalLocation(){
		return this.arrivalLocation;
	}

	public double getPrice(){
		return this.price;
	}

	public String getPriceCurrency(){
		return this.priceCurrency;
	}
}
