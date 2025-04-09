package org.carvehicle;

public class Engine{
    private int capacity;
    private String fuelType;

    public Engine(String fuelType, int capacity) {
        this.fuelType = fuelType;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }
}
