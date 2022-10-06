package Nivel3;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Arrencar el cotxe");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerar el cotxe");
	}

	@Override
	public void stop() {
		System.out.println("Frenar el cotxe");
	}
	
}
