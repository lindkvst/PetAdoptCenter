package PetAdopt;

class Dog extends Pet {
    private String sound;

    public Dog(String name, String type) {
        super(name,type);
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