package Game;

public class Start {
    public static void main(String[] args) {

        Character character1 = new Character("Jamie", 25, 100);
        Character character2 = new Character("Levin", 25, 100);
        Character character3 = new Character("Robin", 25, 100);
        Character character4 = new Character("Ewan", 25, 100);
        Character character5 = new Character("Finn", 25, 100);


        Game game = new Game();
        game.start();
        game.addCharacter(character1);
        game.addCharacter(character2);
        game.addCharacter(character3);
        game.addCharacter(character4);
        game.addCharacter(character5);

        Fight fight = new Fight(character1,character2);
        //fight.newCharacter();
        fight.fight(character1,character2);


    }
}
