package com.bl.petshop;

public class Pigeon extends Pet implements Flyable{

    public Pigeon() {
        this.name = "Pigeon";
        this.colour = Colour.GREY;
    }

    @Override
    public void fly() {
        System.out.println("Pigeon can fly.");
    }
}
