package Nivel2;

public abstract class Address {
	private String Street;
	private String Number;
	private String City;
	private String CodePostal;
	
	public String getStreet() {
		return Street;
	}	
	public String getNumber() {
		return Number;
	}	
	public String getCity() {
		return City;
	}	
	public String getCodePostal() {
		return CodePostal;
	}
	
	public abstract String getCountry();
	
	public String getFullAddress() {
		return Street + " " + Number + "/n" + City + " " + CodePostal;
	}
	
	
	public void setStreet(String newStreet) {
		Street = newStreet;
	}
	public void setNumber(String newNumber) {
		Number = newNumber;
	}
	public void setCity(String newCity) {
		City = newCity;
	}
	public void setCodePostal(String newCodePostal) {
		CodePostal = newCodePostal;
	}

}
