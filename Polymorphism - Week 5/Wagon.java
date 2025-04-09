package org.carvehicle;

public abstract class Wagon implements Vehicle{
    private String pullers;
    private String wheel;

    public void setPullers(String pullers) {
        this.pullers = pullers;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getPullers() {
        return pullers;
    }

    public String getWheel() {
        return wheel;
    }

    public abstract void brake();

    public abstract void turnRight();

    public abstract void turnLeft();

    public abstract void forward();

    public abstract void backward();
}
