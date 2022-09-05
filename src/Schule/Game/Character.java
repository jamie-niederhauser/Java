package Game;

import java.util.ArrayList;

public class Character {
    private String name;
    private int ap;
    private int hp;


    public Character(String name, int ap, int hp){
      this.name = name;
      this.ap= ap;
      this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
