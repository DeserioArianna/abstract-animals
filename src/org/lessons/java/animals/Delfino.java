package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.Swimming;

public class Delfino extends AbstractAnimale implements Swimming {
    private int speedkmh;
    private String colorOfSkin;
    private String species;

    public Delfino( String name, String type, int age, String size, int speedkmh, String colorOfSkin, String species) {
        super(name, type, age, size);
        this.speedkmh = speedkmh;
        this.colorOfSkin = colorOfSkin;
        this.species = species;
    }

    public int getSpeedkmh(){
        return speedkmh;
    }

    public void setSpeedkmh(int speedkmh){
        this.speedkmh = speedkmh;
    }

    public String getColorOfSkin(){
        return colorOfSkin;
    }

    public void setColorOfSkin(String colorOfSkin){
        this.colorOfSkin = colorOfSkin;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a dolphin so my verse is barks");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating fish");
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " Type: " + type + " Age: " + age + " Size: " + size + " Speed: " + speedkmh + " Color of skin: " + colorOfSkin + " Species: " + species;
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming");
    }
}
