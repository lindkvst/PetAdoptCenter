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
        return "Pet: " + name + ", type" + type + ", sound" + sound;
    }

    /*
    public void () {

    }
*/
}
