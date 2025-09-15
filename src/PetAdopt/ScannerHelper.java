package PetAdopt;

import java.util.Scanner;

public class ScannerHelper {
    private Scanner sc;

    public ScannerHelper (Scanner sc) {
        this.sc = new Scanner(System.in);
    }
}
    public void welcomeMessage() {
        System.out.println("Welcome to the Pet Adoption Center");
        System.out.println("Let's register some animals!");
    }

    public int registerPets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many pets do you want to register? ");
        int registerNumOfPets = sc.nextInt();
        return registerNumOfPets;
    }