import game.Animal;

     public class Timon extends Animal {


         public Timon() {
             super("Simba");
             getGender("Male");
             getHealth(100);


         }

         private void getGender(String male) {
             this.gender = gender;
         }
}
