
public class Address {
	
	private String streetName;
	private String city;
	private String state;
	private int zipcode;
	
	public Address(){
		this.streetName = "";
		this.city = "";
		this.state = "";
		this.zipcode = 00000;
	}
	
	public Address(String streetName, String city, String state, int zipcode) {
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public void changeAddress(String streetName, String city, String state, int zipcode) {
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String toString() {
		return streetName +"\n" + city +", "+ state + " "+ zipcode + "\n";
	}

}
