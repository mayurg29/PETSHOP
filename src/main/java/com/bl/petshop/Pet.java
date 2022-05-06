package com.bl.petshop;

import java.util.Objects;

public class Pet {
    enum Colour {
        RED, BROWN, BLACK, GREEN, WHITE, BLACK_WHITE, GREY
    }

    String id;
    String name;
    Colour colour;
    int price;

    public void eat() {
        System.out.println(getClass().getSimpleName() + " eats.");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", colour=" + colour +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
