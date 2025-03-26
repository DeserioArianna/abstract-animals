package org.lessons.java.animals;

import org.lessons.java.animals.interfaces.Fly;

public class Passerotto  extends AbstractAnimale implements Fly {
    private String colorOfFeathers;
    private String birdSpecies;

    public Passerotto(String name, String type, int age, String size, String colorOfFeathers, String birdSpecies) {
        super(name, type, age, size);
        this.size = size;
        this.colorOfFeathers = colorOfFeathers;
        this.birdSpecies = birdSpecies;
    }

    public String getColorOfFeathers(){
        return colorOfFeathers;
    }

    public void setColorOfFeathers(String colorOfFeathers){
        this.colorOfFeathers = colorOfFeathers;
    }

    public String getbirdSpecies(){
        return birdSpecies;
    }

    public void setbirdSpecies(String birdSpecies){
        this.birdSpecies = birdSpecies;
    }


    @Override
    public void makeSound() {
        System.out.println("I'm a bird so my verse is cip cip");
    }

    @Override
    public void eat() {
        System.out.println("I'm eating seeds");
    }

    @Override
    public String toString() {
        return "Name: " + name + " Type: " + type + " Age: " + age + " Size: " + size + " Color of feathers: " + colorOfFeathers + " Bird species: " + birdSpecies;
    }

    @Override
    public void fly() {
        System.out.println("I'm Flying");
    }
}
