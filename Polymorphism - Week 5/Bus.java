package org.carvehicle;

public class Bus extends MotorVehicle implements Vehicle{
    private int numPassenger;
    Engine engine;
    Transmision transmition;
    Tire tire;
    Wheel wheel;
    private int capacity;
    private String vehicleName;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmition(Transmision transmition) {
        this.transmition = transmition;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmision getTransmition() {
        return transmition;
    }

    public Tire getTire() {
        return tire;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public void turnRight() {
        System.out.println("Sedang belok kanan");
    }

    @Override
    public void forward() {
        System.out.println("Sedang maju");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sedang belok kiri");
    }

    @Override
    public void brake() {
        System.out.println("Sedang nge-rem");
    }

    @Override
    public void backward() {
        System.out.println("Sedang mundur");
    }
}
