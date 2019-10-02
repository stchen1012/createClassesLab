package com.company;

public class Main {

    public static void main(String[] args) {

        String name;
        int topSpeed;

        Animal animalObject = new Animal(4, 100, false, "Cheetah");

        //get name and speed values using getters
        name = animalObject.getName();
        topSpeed = animalObject.getTopSpeed();

        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);
        System.out.println("The " + name + " has a top speed of " + topSpeed + " mph.");

        //Set new name, speed, and endangered properties values using setters
        animalObject.setName("Penguin");
        animalObject.setTopSpeed(20);
        animalObject.setEndangered(true);

        //get new values using getters
        name = animalObject.getName();
        topSpeed = animalObject.getTopSpeed();


        //Print some output
        System.out.println(name);
        System.out.println(topSpeed);
        System.out.println("The " + name + " has a top speed of " + topSpeed + " mph.");
    }
}
