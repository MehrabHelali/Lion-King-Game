public class Animal {
     private String name;
     private String gender;
     private int health;

     public Animal(String name){
         this.name = name;
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

    public int getHealth() {
        return health;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
}
