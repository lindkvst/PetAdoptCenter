package PetAdopt;

public class AdoptTest {

    public static void main(String[] args) {
        createPets();
    }

    public static void createPets() {

        //Initialiserer en ScannerHelper til at interagere med brugeren.

        ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();

        //laver array af dyr
        int numOfPets = Sc.registerPets();

        Pet[] petCollection = new Pet[numOfPets]; //opretter antal dyr

        for (int i = 0; i < petCollection.length; i++) {
            int regCount = i + 1;
            System.out.println("\nRegister Pet #" + regCount);
            String petType = Sc.askType();
            String petName = Sc.askName();

            if (petType.equalsIgnoreCase("cat")) {
                //cat
                petCollection[i] = new Cat(petName);

            } else if (petType.equalsIgnoreCase("dog")) {
                //dog
                petCollection[i] = new Dog(petName);
            } else if (petType.equalsIgnoreCase("lizard")) {
                //lizard
                petCollection[i] = new Lizard(petName);
            }
        }


        // printer værdier for dyr
        System.out.println("\nWe're done registering pets today. \n\n");

        for (int i = 0; i < petCollection.length; i++) {
            System.out.println(petCollection[i]);

        }

        System.out.println("Now we're ready to play som sounds!");

        //kører vores playSound() metode
        for (int i = 0; i < petCollection.length; i++) {

            petCollection[i].playSound();

        }

    }


}