package PetAdopt;

 class Cat extends Pet {
  //   private String sound;

     public Cat(String name) {
         super(name);
         this.name = name;
         this.type = "Cat";
         this.sound = "Miaw";
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
