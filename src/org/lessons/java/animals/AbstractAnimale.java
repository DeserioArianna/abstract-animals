package org.lessons.java.animals;

public abstract class AbstractAnimale {
    protected String name;
    protected String type;
    protected String size;
    protected int age;

    public AbstractAnimale(String name, String type, int age, String size) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.size = size;
    }

    public String getName(){
        return name;
    } 

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void sleep() {
        System.out.println("Zzz");
    }
    public abstract void  towards();

    public void eat() {
        System.out.println("I'm eating");
    }

    public String toString() {
        return "Name: " + name + " Type: " + type + " Age: " + age + " Size: " + size;
    }
}
