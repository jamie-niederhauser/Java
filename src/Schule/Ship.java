package Modul320;
import java.util.Random;
public class Ship {

    Random random = new Random();
    private int number;
    private String name;
    private int time;

    public Ship(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void race() {
        time = random.nextInt(600) + 300;
    }

    public int getTime() {
        return time;
    }

}

