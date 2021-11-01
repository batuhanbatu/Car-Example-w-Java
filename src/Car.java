public class Car {

    private String brand;
    private String model;
    private String color;
    private int year;

    public Car() {
        this.setBrand("");
        this.setModel("");
        this.setColor("");
        this.setYear(0);
    }

    public Car(String brand, String model, String color, int year) {
        this.setBrand(brand);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
    }

    public void sayHello () {
        System.out.println("***************************************");
        System.out.println("Hello!");
        System.out.println("Brand name of this car is " + getBrand());
        System.out.println("Model name of this car is " + getModel());
        System.out.println("Color of this car is " + getColor());
        System.out.println("Year of this car is " + getYear());
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}