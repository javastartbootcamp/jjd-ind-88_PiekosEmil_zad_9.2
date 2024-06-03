package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        VehicleWarehouse vehicleWarehouse = new VehicleWarehouse();
        vehicleWarehouse.vehicleInfo();
        vehicleWarehouse.achievableRange();
        vehicleWarehouse.turnOnAc();

        for (int i = 0; i < 5; i++) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

        vehicleWarehouse.vehicleInfo();
        System.out.println("Zasięg pojazdów po włączeniu klimatyzacji");
        vehicleWarehouse.achievableRange();
    }
}
