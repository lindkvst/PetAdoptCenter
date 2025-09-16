package PetAdopt;

import java.util.Scanner;

public class ScannerHelper {
    private Scanner sc;
//
    public ScannerHelper() {
        this.sc = new Scanner(System.in);
    }

    public void welcomeMessage() {
        System.out.println("Welcome to the Pet Adoption Center");
        System.out.println("Let's register some animals!");
    }
/*
    public int registerPets() {
        boolean numCorrect = false;
        int numOfPets;
        System.out.print("How many pets do you want to register? "); //ikke println - så svaret på spørgsmålet kommer på samme linje


        //input validation, så man ikke kan registrere et negativt antal dyr
        while (!numCorrect) {
            numOfPets = sc.nextInt();
            sc.nextLine(); //rydder ENTER fra input bufferen

            if (numOfPets < 0) {
                System.out.println("You have entered a negative number. Try again!");
                registerPets();
            } else if (numOfPets>5) {
                System.out.println("You have entered too many pets. We can't handle that. Try again!");
                registerPets();
            } else {
                if (numOfPets == 1) {
                    System.out.println("Looks like we're having an easy day today. Please input your pet to register. \n");
                    numCorrect = true;

                } else {
                    System.out.println("Looks like we're going to register " + numOfPets + " pets today. Let's go.\n");
                    numCorrect = true;

                }
            }
        }


        return numOfPets;
    }


*/


    public int registerPets() {
        boolean numCorrect = false;
        int numOfPets = 0;

        while (!numCorrect) {
            //while loopet STARTER med spørgsmål + input fra brugeren. Det er vigtigt i tilfælde af, at input ikke valideres,
            //da brugeren så får spørgsmålet igen. Ellers ender man i et uendeligt while loop på fejlbeskeden.

            System.out.print("How many pets do you want to register? ");
            if (sc.hasNextInt()) {
                numOfPets = sc.nextInt();
                sc.nextLine(); // ryd ENTER fra buffer

                if (numOfPets < 0) {
                    System.out.println("You have entered a negative number. Try again!");
                } else if (numOfPets == 0) {
                    System.out.println("Alright, if 0 is your number, then we're done for today.");
                    numCorrect = true;
                } else if (numOfPets > 5) {
                    System.out.println("You have entered too many pets. We can't handle that. Try again!");
                } else {
                    if (numOfPets == 1) {
                        System.out.println("Looks like we're having an easy day today. Please input your pet to register:");
                    } else {
                        System.out.println("Looks like we're going to register " + numOfPets + " pets today. Let's go.");
                    }
                    numCorrect = true; // vi har et gyldigt input, så vi kan forlade loopet
                }
            } else {
                System.out.println("That's not a number. Try again!");
                sc.nextLine(); // ryd forkert input
            }
        }

        return numOfPets;
    }

    public String askType() {

        String petType = "";
        boolean correctAnswer = false;

        while (!correctAnswer) {
            //samme som ovenstående - spørgsmål/svar til brugeren skal ske inden i while loopet.

            System.out.print("What is the type (dog/cat/lizard): "); //ikke println - så svaret på spørgsmålet kommer på samme linje
            petType = sc.nextLine();
//            System.out.println("The user typed: " + petType);

            //simplificeret if statement, så enten dog ELLER cat ELLER lizard er true i sammenligningen
            if (petType.equalsIgnoreCase("dog") ||
                petType.equalsIgnoreCase("cat") ||
                petType.equalsIgnoreCase("lizard")) {
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
 //       Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String petName = sc.nextLine();

        return petName;
    }
}