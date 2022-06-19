
public class Car {
	String make;
	int year;
	double cost;
	
	Car(String make, int year, double cost){ 
		this.make = make;
		this.year = year;
		this.cost = cost;
	}
	
	void describe_car() {
		System.out.println("Car: "+this.make);
		System.out.println("Year: "+this.year);
	}
}
