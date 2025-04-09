package org.example;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> zoo = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        zoo.add(animal);
    }

    public int getAnimalCount() {
        return zoo.size();
    }
}
