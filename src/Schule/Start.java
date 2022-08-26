package Modul320;
import java.util.Random;
public class Start {

    public static void main(String[] args) {

        Competition competition = new Competition("Rotsee Regatta");

        Ship ship1 = new Ship(1,"first ship");
        Ship ship2 = new Ship(2,"second ship");
        Ship ship3 = new Ship(3,"third ship");

        competition.addShip(ship1);
        competition.addShip(ship2);
        competition.addShip(ship3);

        competition.start();
        competition.printResult();
    }

}






