package com.bl.petshop;

public class Cat extends Pet implements Swimmable{

    public Cat() {
        this.name = "Cat";
        this.colour = Colour.BLACK_WHITE;
    }

    @Override
    public void swim() {
        System.out.println("Cat can swim.");
    }
}
