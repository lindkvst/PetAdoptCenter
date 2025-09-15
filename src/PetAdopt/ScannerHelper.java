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
                return petType;
                correctAnswer = true;
                break;
            } else if (petType.equalsIgnoreCase("cat")) {
                return petType;
                correctAnswer = true;
                break;
            } else if (petType.equalsIgnoreCase("lizard")) {
                return petType;
                correctAnswer = true;
                break;
            } else {
                System.out.println("Sorry, I didn't quite get that. Please enter a valid type");
            }
        }
//        return ;
    }

    public String askName() {
        System.out.println("Name: " + );
    }
}