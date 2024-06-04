package pl.javastart.task;

public class Vehicle {
    private String name;
    private double fuel;
    private double averageFuelConsumption;

    public Vehicle(String name, double fuel, double averageFuelConsumption) {
        this.name = name;
        this.fuel = fuel;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public double getFuel() {
        return fuel;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public String vehicleInfo() {
        return "==============="
                + "\nPojazd: " + name
                + "\nPaliwo: " + fuel + "l"
                + "\nŚrednie spalanie: " + averageFuelConsumption + "l/100km";
    }
}
