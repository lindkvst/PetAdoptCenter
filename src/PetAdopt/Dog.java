package PetAdopt;

class Dog extends Pet {
 //   private String sound;

    public Dog(String name) {
        super(name);
        this.name = name;
        this.type = "Dog";
        this.sound = "Vuf";
    }
/*
    @Override
    public String toString(){
        return name + type + sound;
    }
*/
    public void playSound(){
        System.out.println("The " + type + " " + name + " says: " + sound);
    }
}