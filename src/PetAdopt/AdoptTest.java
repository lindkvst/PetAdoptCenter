package PetAdopt;

public class AdoptTest {

    public static void main(String[] args) {
        RunAdoption();
    }

    public static void RunAdoption() {

        //Initialiserer en ScannerHelper til at interagere med brugeren.

        ScannerHelper Sc = new ScannerHelper();
        Sc.welcomeMessage();

        //laver array af dyr
        int numOfPets = Sc.registerPets();

        Pet[] petCollection = new Pet[numOfPets]; //opretter antal dyr

        for (int i = 0, i <= numOfPets, i++) {

            String petType = Sc.askType();
            String petName = Sc.askName();

            if (petType.equals("cat")) {
                Pet[i] = new Cat("")

            } else if (petType.equals("dog")) {
                //dog
            } else if (petType.equals("lizard")) {
                //lizard
            } else {
                System.out.println("");
            }


            //petCollection[i] =
        }


    }
}

