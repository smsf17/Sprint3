package Nivel2;

public class SpainPhoneNumber extends PhoneNumber{
	private static final String COUNTRY_CODE = "0034";
	private static final int NUMBER_LENGTH = 9;
	
	public String getCountryCode() {
		return COUNTRY_CODE;
	}
	
	public void setPhoneNumber(String newNumber) {
		if(newNumber.length()==NUMBER_LENGTH) {
			super.setPhoneNumber(newNumber);
		}
	}

}
