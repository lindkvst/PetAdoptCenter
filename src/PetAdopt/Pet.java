package PetAdopt;

class Pet {
    protected String name;
    protected String type;
    protected String sound;

    public Pet(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Pet: " + name + ", type: " + type + ", sound: " + sound;
    }


    public void playSound(){
            // denne metode er overskrevet på de enkelte subklasser, så nedenstående vises ikke
        System.out.println("Something is wrong with your poly-morphism"); //vil ikke blive vist
    }
}
