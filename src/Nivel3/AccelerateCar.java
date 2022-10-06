package Nivel3;

public class AccelerateCar implements Command{
	
	Vehicle vehicle;
	
	public AccelerateCar(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public void execute() {
		vehicle.accelerate();
		
	}

	@Override
	public void revert() {
		vehicle.stop();
		
	}
	
	

}
