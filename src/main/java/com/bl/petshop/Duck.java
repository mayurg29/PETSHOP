package com.bl.petshop;

public class Duck extends Pet implements Swimmable, Flyable{

    public Duck() {
        this.name = "Duck";
        this.colour = Colour.WHITE;
    }

    @Override
    public void fly() {
        System.out.println("Duck can swim.");
    }

    @Override
    public void swim() {
        System.out.println("Duck can fly.");
    }
}
