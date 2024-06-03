package pl.javastart.task;

public class Car extends Vehicle {
    private boolean acIsOn;
    private static final double ADDITIONAL_CONSUMPTION = 0.8;

    public Car(String name, double fuel, double averageFuelConsumption, boolean acIsOn) {
        super(name, fuel, averageFuelConsumption);
        this.acIsOn = acIsOn;
    }

    public boolean isAcIsOn() {
        return acIsOn;
    }

    public void setAcIsOn(boolean acIsOn) {
        this.acIsOn = acIsOn;
    }

    @Override
    public double getAverageFuelConsumption() {
        if (acIsOn) {
            return super.getAverageFuelConsumption() + ADDITIONAL_CONSUMPTION;
        }
        return super.getAverageFuelConsumption();
    }

    @Override
    public void acTurnOn() {
        setAcIsOn(true);
    }

    @Override
    public String vehicleInfo() {
        return super.vehicleInfo() + "\nKlimatyzacja włączona: " + acIsOn;
    }
}
