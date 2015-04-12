package methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Car {
	
	private String make;
	private String model;
	private Integer year;
	
	public Car() { 
		this.make = "Unknown";
		this.model = "Unknown";
		this.year = 1;
	}
	
	public Car(String make, String model, Integer year) { 
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public static Car create(final Supplier<Car> supplier) { 
		return supplier.get();
	}
	
	public static void collide(final Car car) { 
		System.out.println("Collided with: " + car);
	}
	
	public void follow(final Car car) { 
		System.out.println("Following car: " + car);
	}
	
	public static void repair(final Car car) { 
		System.out.println("Repairing car: " + car);
	}
	
	@Override
	public String toString() { 
		return String.format("Car { make: %s, model: %s, year: %s }", make, model, year);
	}
	
	public static void main(String[] args) {
		
		Car car = new Car("Audi", "A3", 2015);
		Car car2 = new Car("Ferrari", "F40", 1999);
		
		List<Car> cars = Arrays.asList(car, car2);		
		cars.forEach(Car::collide);
		cars.forEach(Car::repair);
		
		
		Car unknown = Car.create(Car::new);
		System.out.println(unknown);
		
		cars.forEach(unknown::follow);
		
	}

}
