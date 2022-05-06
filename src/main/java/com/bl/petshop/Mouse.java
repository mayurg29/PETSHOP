package com.bl.petshop;

public class Mouse extends Pet implements Swimmable{

    public Mouse() {
        this.name = "Mouse";
        this.colour = Colour.BLACK;
    }

    @Override
    public void swim() {
        System.out.println("Mouse can swim.");
    }
}
