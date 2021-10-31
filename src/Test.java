import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter brand name of the car: ");
        String brand = input.nextLine();
        System.out.print("Please enter model name of the car: ");
        String model = input.nextLine();
        System.out.print("Please enter color of the car: ");
        String color = input.nextLine();
        System.out.print("Please enter year of the car: ");
        int year = input.nextInt();
        Car car = new Car(brand, model, color, year);
        car.sayHello();
    }
}