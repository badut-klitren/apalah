package org.example;

public class Animal {
    private String name, species;
    private int age;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age <= 0) {
                throw new Exception("Age cannot be negative");
            }
            this.age = age;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.age = age;
    }

    String makeSound() {
        return "Jawa";
    };

    public String toString() {
        return "Animal [name=" + name + ", species=" + species + ", age=" + age + "]";
    }
}
