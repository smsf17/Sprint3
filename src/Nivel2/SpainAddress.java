package Nivel2;

public class SpainAddress extends Address{
	private static final String COUNTRY = "SPAIN";
	
	public String getCountry() {
		return COUNTRY;
	}
	
	public String getFullAddress() {
		return getStreet() + " " + getNumber() + "/n" + getCity() + " " + getCodePostal() + "/n" + COUNTRY;
	}

}
