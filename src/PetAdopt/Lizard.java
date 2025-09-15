package PetAdopt;

class Lizard extends Pet {
    private String sound;

    public Lizard(String name, String type) {
        super(name,type);
        this.sound = "Ssss";
    }

    @Override
    public String toString(){
        return this.name + this.type + this.sound;
    }

    public void honk(){
        System.out.println("The " + type + name + "says: " + sound);
    }

}
