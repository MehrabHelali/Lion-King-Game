package game;

public class Menu {

    public void theGameMenu() {
        Dialogs.howTheGameWorks();
        int howManyPlayers = Dialogs.promptInt("How Many players are you?",1,4);
        int howManyRounds = Dialogs.promptInt("How many rounds would you like to play",1,35);
        String enterPlayersName = Dialogs.prompt("Add the name of the players.",1,4);
        playeradd

    }
}
