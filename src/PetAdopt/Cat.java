package PetAdopt;

 class Cat extends Pet {
  //   private String sound;

     public Cat(String name) {
         super(name);
         this.name = name;
         this.type = "Cat";
         this.sound = "Miaw";
     }

     @Override
     public String toString(){
         return this.name + this.type + this.sound;
     }

     public void honk(){
         System.out.println("The " + type + name + "says: " + sound);
     }
}
