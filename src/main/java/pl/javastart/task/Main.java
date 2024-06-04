package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        VehicleWarehouse vehicleWarehouse = new VehicleWarehouse();
        Car car1 = new Car("BMW", 50, 7,false);
//        vehicleWarehouse.vehicleInfo();
//        vehicleWarehouse.achievableRange();
//        vehicleWarehouse.turnOnAc();

//        vehicleWarehouse.vehicleInfo();
//        System.out.println("Zasięg pojazdów po włączeniu klimatyzacji");
//        vehicleWarehouse.achievableRange();
        double range = car1.vehicleRange();
        System.out.printf("Zasięg %.2fkm", range);
    }
}
