package Nivel2;

public abstract class SpainFactory implements Agenda {
	
	public Address createAddress() {
		return new SpainAddress();
	}
	public PhoneNumber creatPhoneNumber() {
		return new SpainPhoneNumber();
	}
}
