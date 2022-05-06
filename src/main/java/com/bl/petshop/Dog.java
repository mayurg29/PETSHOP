package com.bl.petshop;

public class Dog extends Pet  implements Swimmable{

    public Dog() {
        this.name = "Dog";
        this.colour = Colour.BROWN;
    }

    @Override
    public void swim() {
        System.out.println("Dog can swim.");
    }
}
