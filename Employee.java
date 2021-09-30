public class Employee {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	private Address address;
	
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.salary = 0.0;
		this.address = new Address();
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getSalary() {
		return salary + " ";
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setBaseSalary(double salary) {
		this.salary = salary;
	}
	
	public void setAddress(String streetName, String city, String state, int zipcode) {
		address.changeAddress(streetName, city, state, zipcode);
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nAge: " + age+ "\nSalary: "+ salary + "\nAddress: " + address;
	}
	
	

}
