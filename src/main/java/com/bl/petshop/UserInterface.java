package com.bl.petshop;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

    static PetRepository petRepository = PetRepository.getInstance();
    Scanner sc = new Scanner(System.in);

    private static UserInterface userInterfaceInstance;

    private UserInterface() {
    }

    public static UserInterface getInstance() {
        if (userInterfaceInstance == null) {
            userInterfaceInstance = new UserInterface();
        }
        return userInterfaceInstance;
    }

    public void printAllPets(Set list) {
        for (Pet pet : petRepository.getPetList()) {
            System.out.println(pet);
        }
    }

    public int showMenu() {
        System.out.println("Choose an option:\n 1.Add Pet \n 2.Remove Pet \n 3.Display Pets \n" +
                " 4.Update the Pet \n 5.Exit");
        return sc.nextInt();
    }

    public void displayPet() {
        printAllPets(petRepository.getPetList());
    }

    public void addPet() {
        /*Cat cat = new Cat();
        cat.id = "C001";
        cat.price = 100;

        Dog dog = new Dog();
        dog.id = "D002";
        dog.price = 200;

        Duck duck = new Duck();
        duck.id = "D004";
        duck.price = 500;

        Mouse mouse = new Mouse();
        mouse.id = "M003";
        mouse.price = 75;

        Parrot parrot = new Parrot();
        parrot.id = "P005";
        parrot.price = 400;

        Pigeon pigeon = new Pigeon();
        pigeon.id = "Pi006";
        pigeon.price = 600;

        petRepository.add(cat);
        petRepository.add(dog);
        petRepository.add(duck);
        petRepository.add(mouse);
        petRepository.add(parrot);
        petRepository.add(pigeon);*/

        Pet pet = new Pet();
        System.out.println("Enter Pet Name:");
        pet.name = sc.next();

        System.out.println("Enter Pet Id:");
        pet.id = sc.next();

        System.out.println("Enter Pet Price:");
        pet.price = sc.nextInt();
        petRepository.add(pet);

        System.out.println("Choose the Colour of Pet:");
        setPetColour(pet);
    }

    public void removePet() {
        System.out.println("Which Pet you want to remove?");
        String petName = sc.next();
        Pet pet = petRepository.getPet(petName);
        petRepository.remove(pet);
    }

    public void updatePet() {
        System.out.println("Enter the pet to update");
        String petName = sc.next();
        Pet pet = petRepository.getPet(petName);
        System.out.println("Choose what you want to update:\n 1.Id \n 2.Name \n 3.Colour \n" +
                           " 4.Price");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter the new Id:");
                pet.id = sc.next();
                break;
            case 2:
                System.out.println("Enter the new name");
                pet.name = sc.next();
                break;
            case 3:
                setPetColour(pet);
                break;
            case 4:
                System.out.println("Enter the pet price");
                pet.price = sc.nextInt();
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }

    private void setPetColour(Pet pet) {
        System.out.println("Enter your choice:\n 1.RED \n 2.BROWN \n 3.BLACK \n 4.GREEN \n" +
                " 5.WHITE \n 6.BLACK_WHITE \n 7.GREY");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                pet.colour = Pet.Colour.RED;
                break;
            case 2:
                pet.colour = Pet.Colour.BROWN;
                break;
            case 3:
                pet.colour = Pet.Colour.BLACK;
                break;
            case 4:
                pet.colour = Pet.Colour.GREEN;
                break;
            case 5:
                pet.colour = Pet.Colour.WHITE;
                break;
            case 6:
                pet.colour = Pet.Colour.BLACK_WHITE;
                break;
            case 7:
                pet.colour = Pet.Colour.GREY;
                break;
            default:
                System.out.println("Invalid Option!");
        }
    }
}