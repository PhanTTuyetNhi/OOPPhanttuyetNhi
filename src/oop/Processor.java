package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        ArrayList<Car> Cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            Car myCar = new Car(model, year);
            Cars.add(i,myCar);
        }
        for (int i = 0; i < 5; i++) {
            Cars.get(i).display();
        }
        scanner.close();
    }
}
