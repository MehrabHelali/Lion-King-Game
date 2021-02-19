import game.Animal;

public class FatherLion extends Animal {

    public FatherLion() {
        super("Simba");
        getGender("Male");
        getHealth(100);
    }

    private String getGender(String male) {
        return male;
    }
}
