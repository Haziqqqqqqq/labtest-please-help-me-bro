package Model;

public class Car {
    
    // These variables mirror the columns in your CarPricelist table
    private int carId;
    private String brand;
    private String model;
    private int cylinder; // Maps to your 'Cyclinder' column
    private double price;

    // 1. Default Constructor (Required for Java Beans)
    public Car() {}

    // 2. Constructor WITH ID 
    // (Used when we retrieve existing cars from the database)
    public Car(int carId, String brand, String model, int cylinder, double price) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.price = price;
    }

    // 3. Constructor WITHOUT ID 
    // (Used when adding a new car, because the DB handles the AUTO_INCREMENT ID)
    public Car(String brand, String model, int cylinder, double price) {
        this.brand = brand;
        this.model = model;
        this.cylinder = cylinder;
        this.price = price;
    }

    // --- Getters and Setters ---

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
