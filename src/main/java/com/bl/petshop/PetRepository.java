package com.bl.petshop;

import java.util.HashSet;
import java.util.Set;

public class PetRepository {
    private Set<Pet> petList = new HashSet<>();
    private static PetRepository petRepositoryInstance;

    private PetRepository() {
    }

    public static PetRepository getInstance(){
        if (petRepositoryInstance == null){
            petRepositoryInstance = new PetRepository();
        }
        return petRepositoryInstance;
    }

    public Set<Pet> getPetList() {
        return petList;
    }

    public void add(Pet pet) {
        petList.add(pet);
    }

    public void remove(Pet pet) {
        petList.remove(pet);
    }

    public Pet getPet(String petName) {
        for (Pet pet : petList) {
            if (petName.equalsIgnoreCase(pet.name)) {
                return pet;
            } else {
                System.out.println("No such Pet exists.");
            }
        }
        return null;
    }
}
