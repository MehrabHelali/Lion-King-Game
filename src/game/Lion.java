package game;
public class Lion extends Animal {




    public Lion() {
        super("Simba");
        getGender("Male");
        getHealth(100);
    }

    private void getGender(String male){
        this.gender = male;
    }
}

