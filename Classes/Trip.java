public class Trip {
	private int id;
	private String name;
	//private Date timeDate;
	private String description;
	private String location;
	private int availability;
	private double price;
	private String priceCurrency;

	public Trip(){}

	//setters, getters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	//public void setTimeDate(string timeDate){
	//	this.timeDate = timeDate;
	//	}

	public void setDescription(String description) {
		this.description = description;
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

	//public getDate(){
	//	return this.date
	//	}

	public String getDescription() {
		return this.description;
	}

	public String getLocation() {
		return this.location;
	}

	public double getPrice() {
		return this.price;
	}
}
