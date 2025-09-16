package PetAdopt;

class Lizard extends Pet {
//    private String sound;

    public Lizard(String name) {
        super(name);
        this.name = name;
        this.type = "Lizard";
        this.sound = "Sssss";
    }
/*
    @Override
    public String toString(){
        return name + type + sound;
    }
*/
    public void playSound(){
        System.out.println(sound + " says the " + type + " named " + name);
    }

}
