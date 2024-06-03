package pl.javastart.task;

public class Truck extends Car {
    private double load;
    private static final double ADDITIONAL_CONSUMPTION = 0.8;
    private static final double ADDITIONAL_CONSUMPTION_BY_LOAD_PER_1KM = 0.005;

    public Truck(String name, double fuel, double averageFuelConsumption, boolean acIsOn, double load) {
        super(name, fuel, averageFuelConsumption, acIsOn);
        this.load = load;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    @Override
    public double getAverageFuelConsumption() {
        if (load > 0 && !isAcIsOn()) {
            return super.getAverageFuelConsumption() +
                    (ADDITIONAL_CONSUMPTION_BY_LOAD_PER_1KM * load);
        } else if (load > 0 && isAcIsOn()) {
            return super.getAverageFuelConsumption() + +
                    (ADDITIONAL_CONSUMPTION_BY_LOAD_PER_1KM * load) + ADDITIONAL_CONSUMPTION;
        }
        return super.getAverageFuelConsumption();
    }

    @Override
    public String vehicleInfo() {
        return super.vehicleInfo() + "\nŁadunek: " + load + "kg";
    }
}
