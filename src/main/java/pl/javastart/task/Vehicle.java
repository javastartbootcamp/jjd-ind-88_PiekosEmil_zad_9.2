package pl.javastart.task;

public class Vehicle {
    private String name;
    private double fuel;
    private double averageFuelConsumption;
    private boolean acIsOn;

    public Vehicle(String name, double fuel, double averageFuelConsumption) {
        this.name = name;
        this.fuel = fuel;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public void acTurnOn() {
    }

    public boolean isAcIsOn() {
        return false;
    }

    public void setAcIsOn(boolean acIsOn) {
        this.acIsOn = acIsOn;
    }

    public String vehicleInfo() {
        return "==============="
                + "\nPojazd: " + name
                + "\nPaliwo: " + fuel + "l"
                + "\nŚrednie spalanie: " + averageFuelConsumption + "l/100km";
    }
}
