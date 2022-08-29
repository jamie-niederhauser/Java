package Modul320;
import java.util.Random;
public class Ship {

    Random random = new Random();
    private int number;
    private String name;
    private int time;
    private Person owner;

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
        int min = 300;
        int max = 600;
        time = random.nextInt(min,max);
    }

    public int getTime() {
        return time;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}

