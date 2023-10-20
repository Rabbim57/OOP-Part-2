package HW;

import HW.Transport.Bicycle;
import HW.Transport.Car;
import HW.Transport.Truck;
import HW.service.ServiceStation;

public class Main {
    public static void  main(String[] arge){

        Bicycle bicycle = new Bicycle("БМХ" , 2);
        Car car = new Car("Aurus", 4);
        Truck truck = new Truck("Kamaz", 4);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);

    }
}
