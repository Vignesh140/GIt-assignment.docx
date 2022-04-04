package ques1.spring.assignment;

public class Address {
	String street;
	String city;
	String state;
	long zip;
	String country;
		
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	 
	
	public String toString() {
		return "Address : ( Street : "+street+" City : "+city+" State : "+state+" zip : "+zip+" Counrty : "+country+")";
	}

}
	


