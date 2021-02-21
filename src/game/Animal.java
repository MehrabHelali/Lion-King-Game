package game;
public class Animal {
     public String name;
     public String gender;
     public int health;

     public Animal(){

     }

     public Animal(String name,String gender, int health){
         this.name = name;
         this.gender = gender;
         this.health = health;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth(int i) {
        return health;

    }

    public String getName() {
        return name;
    }
}
