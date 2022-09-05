package Game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Game {
Random random = new Random();

    private ArrayList<Character>players = new ArrayList<Character>();

    public void addCharacter(Character character){
            players.add(character);

    }

    public Character start(){
    while ( players.size() > 1){
        System.out.println("------Neue Begegnung------");
        Collections.shuffle(players);

        Character character1 = players.get(0);
        Character character2 = players.get(1);
        Fight f = new Fight(character1,character2);
        f.fight(character1, character2);


        }
        if (this.players.size() > 0) {
            return this.players.get(0);
        } else {
            return null;
        }

    }


    public void printPlayers(){

    }




}
