package Nivel3;

public class StartCar implements Command {
	
	Vehicle vehicle;
	
	public StartCar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	@Override
	public void execute() {
		vehicle.start();		
	}
	@Override
	public void revert() {
		vehicle.stop();
		
	}


}
