package org.carvehicle;

public class Wheel{
    private int width;
    private int diameter;

    public Wheel(int width, int diameter) {
        this.width = width;
        this.diameter = diameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getWidth() {
        return width;
    }

    public int getDiameter() {
        return diameter;
    }
}
