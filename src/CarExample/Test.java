package CarExample;

import java.util.Scanner;

public class Test {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Car car1 = makeCarObject();
        car1.sayHello();

        System.out.println("******************************************");
        System.out.println("Now it is time to create another car..");
        System.out.println("******************************************");

        Car car2 = makeCarObject();
        car2.sayHello();
    }

    public static Car makeCarObject() {
        System.out.print("Please enter brand name of the car: ");
        String brand = input.nextLine();
        System.out.print("Please enter model name of the car: ");
        String model = input.nextLine();
        System.out.print("Please enter color of the car: ");
        String color = input.nextLine();
        System.out.print("Please enter year of the car: ");
        int year = input.nextInt();
        return new Car(brand, model, color, year);
    }
}