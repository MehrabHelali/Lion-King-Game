package game;
import java.util.*;

public class Dialogs {

    static private Scanner scanner = new Scanner(System.in);

    static public void clear(){

        System.out.println("\n".repeat(60));
    }

    static public String prompt(String question){
        System.out.println(question);
        return scanner.nextLine();
    }

    static public int promptInt(String question, int min, int max){
        var num = min - 1;
        try {
            num = Integer.parseInt(prompt(question));
        }
        catch(Exception ignore){}

        return num < min || num > max ?
                promptInt(question, min, max) : num;
    }

    static public int menu(String menuName, String ...options){

        clear();
        System.out.println("-".repeat(50));
        System.out.println("MY GAME NAME: " + menuName);
        System.out.println("-".repeat(50));
        var counter = 1;
        for(var option : options){
            System.out.println(counter + ". " + option);
            counter++;
        }
        System.out.println("-".repeat(50));
        var choice = 0;
        try {
            choice = Integer.parseInt(scanner.nextLine());
        }
        catch(Exception ignore){}
        return choice < 1 || choice > options.length ?
                menu(menuName, options) : choice;
    }
    static public void howTheGameWorks(){
        System.out.printf("The Helping Menu",
                "How the game works: ",
                "1. You buy an animal, you need to keep it alive by feeding it.",
                "2.You can breed 2 animals togheter, but only if their are of the same breed type",
                "3.When breeding 2 animals you have a 50% chance to get the animals babys, these babies have value",
                "4.You can buy food for your animal, but keep in mind that certain animals can eat certain food.",
                "5. You can sell your animal, but you will get back  the amount money  "
        );
    }

}