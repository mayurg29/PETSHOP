package com.bl.petshop;

public class Parrot extends Pet implements Flyable{

    public Parrot() {
        this.name = "Parrot";
        this.colour = Colour.GREEN;
    }

    @Override
    public void fly() {
        System.out.println("Parrot can fly.");
    }
}
