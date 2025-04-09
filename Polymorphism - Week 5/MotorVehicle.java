package org.carvehicle;

public abstract class MotorVehicle implements Vehicle{
    Wheel wheel;
    Transmision transmition;
    private String vehicleName;
    Tire tire;
    Engine engine;

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setTransmition(Transmision transmition) {
        this.transmition = transmition;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Transmision getTransmition() {
        return transmition;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Tire getTire() {
        return tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void brake();

    public abstract void turnRight();

    public abstract void turnLeft();

    public abstract void forward();

    public abstract void backward();
}
