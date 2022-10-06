package Nivel3;

public class Airplane implements Vehicle {
	
	@Override
	public void start() {
		System.out.println("Arrencar el avió");
	}

	@Override
	public void accelerate() {
		System.out.println("Accelerar el avió");
	}

	@Override
	public void stop() {
		System.out.println("Frenar el avió");
	}

}
