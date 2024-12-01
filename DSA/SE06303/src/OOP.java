class Car {
    // Thuộc tính
    int year;
    String brand;
    String color;

    // Phương thức - constructor - hàm tạo
    public Car(int year, String brand, String color) {
        this.year = year;
        this.brand = brand;
        this.color = color;
    }

    public void start() {
        System.out.println("The car is starting");
    }

    public void stop() {
        System.out.println("The car is stopping");
    }

    public void brake() {
        System.out.println("The car is braking");
    }

    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Year: " + year);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
    }
}


public class OOP {
    public static void main(String[] args) {
        // Tạo đối tượng Car
        Car myCar = new Car(2023, "Toyota", "Red");

        // Gọi các phương thức của đối tượng Car
        myCar.displayInfo();
        myCar.start();
        myCar.brake();
        myCar.stop();
    }
}
