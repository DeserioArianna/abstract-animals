package org.lessons.java.animals;

public class Cane extends AbstractAnimale {
    private String colorOfHair;
    private String dogBreed;

    public Cane(String name, String type, int age, String size, String colorOfHair, String dogBreed) {
        super(name, type, age, size);
        this.colorOfHair = colorOfHair;
        this.dogBreed = dogBreed;
    }


    public String getColorOfHair(){
        return colorOfHair;
    }

    public void setColorOfHair(String colorOfHair){
        this.colorOfHair = colorOfHair;
    }

    public String getDogBreed(){
        return dogBreed;
    }

    public void setDogBreed(String dogBreed){
        this.dogBreed = dogBreed;
    }

    @Override
    public void makeSound() {
        System.out.println("I'm a dog so my verse is baubau");
    }


    @Override 
    public void eat() {
        System.out.println("I'm eating bones");
    }
    
    @Override
    public String toString() {
        return "Name: " + name + " Type: " + type + " Age: " + age + " Size: " + size + " Color of hair: " + colorOfHair + " Dog breed: " + dogBreed;
    }
}
