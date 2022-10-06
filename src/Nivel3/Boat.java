package Nivel3;

public class Boat implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Arrencar el vaixell");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerar el vaixell");
	}

	@Override
	public void stop() {
		System.out.println("Frenar el vaixell");
	}

}
