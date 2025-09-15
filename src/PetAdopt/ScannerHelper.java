package PetAdopt;

import java.util.Scanner;

public class ScannerHelper {
//    private Scanner sc;
//
//    public ScannerHelper() {
//        this.sc = new Scanner(System.in);
//    }

    public void welcomeMessage() {
        System.out.println("Welcome to the Pet Adoption Center");
        System.out.println("Let's register some animals!");
    }

    public int registerPets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you want to register? ");
        int numOfPets = sc.nextInt();
        return numOfPets;
    }

    public String askType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type (dog/cat/lizard): ");
        String petType = sc.nextLine();
        boolean correctAnswer = false;
        while (!correctAnswer) {
            if (petType.equalsIgnoreCase("dog")) {
                correctAnswer = true;
                return petType;
            } else if (petType.equalsIgnoreCase("cat")) {
                correctAnswer = true;
                return petType;
            } else if (petType.equalsIgnoreCase("lizard")) {
                correctAnswer = true;
                return petType;
            } else {
                System.out.println("Sorry, I didn't quite get that. Please enter a valid type");
                return askType();
            }
        }
        return petType;
    }

    public String askName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String petName = sc.nextLine();

        return petName;
    }
}