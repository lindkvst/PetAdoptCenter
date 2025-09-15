package PetAdopt;

class Lizard extends Pet {
    private String sound;

    public Lizard(String name) {
        //       super(name);
        this.name = name;
        this.type = "Lizard";
        this.sound = "Sssss";
    }

    @Override
    public String toString(){
        return this.name + this.type + this.sound;
    }

    public void honk(){
        System.out.println("The " + type + name + "says: " + sound);
    }

}
