package Nivel3;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Arrencar la bicicleta");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerar la bicicleta");
	}

	@Override
	public void stop() {
		System.out.println("Frenar la bicicleta");
	}
	
}
