package PetAdopt;

 class Cat extends Pet {
     private String sound;

     public Cat(String name, String type, String Sound) {
         super(name,type);
         this.sound = "Miaw";
     }

     @Override
     public String toString(){
         return "Cat"
     }
}
