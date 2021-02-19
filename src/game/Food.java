package game;

public class Food {
    int foodPrice = 150;
    String lionEats = "Meat" ;
    String timonEats = "Insects";
    String rafikiEats = "BaobFruit";

    public Food(){
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public void setLionEats(String lionEats) {
        this.lionEats = lionEats;
    }

    public void setRafikiEats(String rafikiEats) {
        this.rafikiEats = rafikiEats;
    }

    public void setTimonEats(String timonEats) {
        this.timonEats = timonEats;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public String getLionEats() {
        return lionEats;
    }

    public String getRafikiEats() {
        return rafikiEats;
    }

    public String getTimonEats() {
        return timonEats;
    }
}
