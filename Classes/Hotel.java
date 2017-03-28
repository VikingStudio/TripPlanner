public class Hotel {
	private int id;
	private String name;
	//private Date arrivalDate;
	//private Date departureDate;
	private String address;
	private String location;
	private int availability;
	private double price;
	private String priceCurrency;

	public Hotel(){}

	//setters, getters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public void setArrivalDate(string arrivalDate){
	//	this.arrivalDate = arrivalDate;
	//	}

	//public void setDepratureDate(string departureDate){
	//	this.departureDate = departureDate;
	//	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	//public getArrivalDate(){
	//	return this.arrivalDate
	//	}

	//public getDepartureDate(){
	//	return this.departureDate
	//	}

	public String getAddress() {
		return this.address;
	}

	public String getLocation() {
		return this.location;
	}

	public double getPrice() {
		return this.price;
	}
}
