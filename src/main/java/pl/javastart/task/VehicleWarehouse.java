package pl.javastart.task;

public class VehicleWarehouse {
    private Car[] vehicles = new Car[5];

    public VehicleWarehouse() {
        vehicles[0] = new Car("Volvo", 50, 7, false);
        vehicles[1] = new Car("Fiat", 40, 4.5, false);
        vehicles[2] = new Truck("Scania", 500, 24, false, 12000);
        vehicles[3] = new Truck("Renault", 500, 27, false, 0);
        vehicles[4] = new Truck("DAF", 500, 29.5, false, 6000);
    }

    public void vehicleInfo() {
        for (Car vehicle : vehicles) {
            String info = vehicle.vehicleInfo();
            System.out.println(info);
        }
    }

    public void achievableRange() {
        for (Car car : vehicles) {
            double rangeInfo = car.vehicleRange();
            System.out.printf("Zasięg pojazdu %s %.2fkm\n", car.getName(), rangeInfo);
        }
    }

    public void turnOnAc() {
        for (Car car : vehicles) {
            car.acTurnOn();
        }
    }
}
