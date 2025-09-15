package PetAdopt;

public class AdoptTest {

    public static void main(String[] args) {
        createPets();
        //      printPets();
    }

    public static void createPets() {

        //Initialiserer en ScannerHelper til at interagere med brugeren.

        ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();

        //laver array af dyr
        int numOfPets = Sc.registerPets(); //trækker en fra så array har rigtig størrelse

        Pet[] petCollection = new Pet[numOfPets]; //opretter antal dyr

        for (int i = 0; i < petCollection.length; i++) {

            String petType = Sc.askType();
            String petName = Sc.askName();

            if (petType.equals("cat")) {
                petCollection[i] = new Cat(petName);

            } else if (petType.equals("dog")) {
                //dog
                petCollection[i] = new Dog(petName);
            } else if (petType.equals("lizard")) {
                petCollection[i] = new Lizard(petName);
            }
        }


        // printer værdier for dyr

            for (int i = 0; i < petCollection.length; i++) {
                System.out.println(petCollection[i]);
            }

    }


}