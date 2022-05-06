package com.bl.petshop;

public class Main {

    static UserInterface userInterface = UserInterface.getInstance();

    public static void main(String[] args) {
        System.out.println("Welcome to Pet Shop");
        int userChoice = 0;
        while (userChoice != 5){
            userChoice = userInterface.showMenu();
            handleUserSelection(userChoice);
        }
    }

    public static void handleUserSelection(int userChoice) {
        switch (userChoice) {
            case 1:
                userInterface.addPet();
                System.out.println("Pet added successfully.");
                break;
            case 2:
                userInterface.removePet();
                System.out.println("Pet removed successfully.");
                break;
            case 3:
                userInterface.displayPet();
                break;
            case 4:
                userInterface.updatePet();
                break;
            case 5:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Enter Valid Input");
                break;
        }
    }
}
