package Nivel3;

import java.util.List;

public class DriveVehicle {
	
	public static void main(String[] args) {
		Vehicle car = new Car();
		
		StartCar startCommand = new StartCar(car);
		Driver driver = new Driver(startCommand);
		driver.takeAction();
		
		AccelerateCar accelerateCommand = new AccelerateCar(car);
		driver.setCommand(accelerateCommand);
		driver.takeAction();
		driver.revertAction();
		
		Vehicle boat = new Boat();
		List<Vehicle> vehicles = List.of(car, boat);
		StartAllVehicles startAllVehicles = new StartAllVehicles(vehicles);
		startAllVehicles.execute();
		startAllVehicles.revert();
		
	}

}
