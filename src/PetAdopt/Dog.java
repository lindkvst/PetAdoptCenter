package PetAdopt;

class Dog extends Pet {
 //   private String sound;

    public Dog(String name) {
 //     super(name, type, sound);
        this.name = name;
        this.type = "Dog";
        this.sound = "Vuf";
    }

    @Override
    public String toString(){
        return this.name + this.type + this.sound;
    }

    public void honk(){
        System.out.println("The " + type + name + "says: " + sound);
    }
}