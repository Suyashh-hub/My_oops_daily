
class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0; 
    }

    
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    
    public void accelerate(int increment) {
        this.speed += increment;
        System.out.println(brand + " accelerated. Current speed: " + this.speed + " km/h.");
    }

    public void brake(int decrement) {
        this.speed -= decrement;
        if (this.speed < 0) {
            this.speed = 0; 
        }
        System.out.println(brand + " applied brakes. Current speed: " + this.speed + " km/h.");
    }

    public void displayDetails() {
        System.out.println("Car Info: " + year + " " + brand + " " + model);
    }
}

public class CarTest {
    public static void main(String[] args) {
    
        Car myCar = new Car("Toyota", "Camry", 2024);

        myCar.displayDetails();
        myCar.accelerate(50);
        myCar.accelerate(30);
        myCar.brake(40);
        
        System.out.println("\nChecking via getter -> Final Speed: " + myCar.getSpeed() + " km/h");
    }
}
