package org.example;

public class Bird extends Animal {
    private boolean canFly = false;

    public Bird(String name, int age, String species, boolean canFly) {
        super(name, age, species);
        this.canFly = canFly;
    }

    @Override
    public String makeSound() {
        return "Kaciw";
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
