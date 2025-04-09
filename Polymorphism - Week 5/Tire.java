package org.carvehicle;

public class Tire{
    private int width;
    private int wheelDiameter;
    private int aspectRatio;
    private String tireType;

    public Tire(String tireType, int width, int wheelDiameter, int aspectRatio) {
        this.tireType = tireType;
        this.width = width;
        this.wheelDiameter = wheelDiameter;
        this.aspectRatio = aspectRatio;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setAspectRatio(int aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    public int getWidth() {
        return width;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public String getTireType() {
        return tireType;
    }
}
