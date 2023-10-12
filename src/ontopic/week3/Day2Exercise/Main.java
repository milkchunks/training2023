package ontopic.week3.Day2Exercise;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Vehicle nonSpecificVehicle = new Vehicle("Non-Specific Vehicle Speed: ");
        Bicycle bike = new Bicycle("Bike Speed: ");
        Car car = new Car("Car Speed: ");
        car.accelerate();
        bike.accelerate();
        bike.accelerate(20);
        nonSpecificVehicle.accelerate();
        ArrayList<Vehicle> vehicleList = new ArrayList<>(Arrays.asList(nonSpecificVehicle, car, bike));
        for (int i=0;i<=vehicleList.size() - 1;i++) {
            System.out.println(vehicleList.get(i).getName() + vehicleList.get(i).getSpeed());
        }
    }
}
