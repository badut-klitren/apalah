package org.example;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, int age, String species, String furColor) {
        super(name, age, species);
        this.furColor = furColor;
    }

    @Override
    public String makeSound() {
        return "Ciuw Ciuw";
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
