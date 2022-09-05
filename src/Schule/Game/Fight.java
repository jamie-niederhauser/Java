package Game;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fight {
 private Character character1 = null;
 private Character character2 = null;

Scanner scanner = new Scanner(System.in);

public Fight(Character character1, Character character2){
    this.character1 = character1;
    this.character2  = character2;
}

 /* public void newCharacter(){
        ArrayList<String>namensliste = new ArrayList<String>();

        System.out.println("Wie viele Character möchten sie im Kampf haben?");
        int anzahl = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < anzahl; i++){
            System.out.println("Wie soll der Spieler heissen?");
            String name = scanner.nextLine();
            namensliste.add(name);
        }

    }*/

    public int hit(int ap) {
        Random random = new Random();
        int hit = random.nextInt(ap + 1);

        return hit;
    }


    public void fight(Character character1, Character character2){
        String line = "\n ------------- \n";

        System.out.println(character1.getName() + "  vs  "  + character2.getName()  );
        System.out.println(line);
        int hp1 = character1.getHp();
        int hp2= character2.getHp();

        while (hp1 > 0 && hp1 > 0) {
            int hit1 = hit(character1.getAp());
            int hit2 = hit(character2.getAp());

            System.out.println(character2.getName() + " hit " + character2.getName() + " for: " + hit1);
            hp2 = hp2 - hit1;
            System.out.println(character1.getName() + " HP : "  + hp1 + " | " + character2.getName() + " HP: " + hp2);
            System.out.println(line);

            if(hp1 > 0 && hp2 > 0){

                System.out.println(character2.getName() + " hit " + character1.getName() + " for: " + hit2);
               hp1 = hp1 - hit2;
                System.out.println(character2.getName() + " HP : "  + hp2+ " | " + character1.getName() + " HP: " + hp1);
                System.out.println(line);
            }

            if(hp1 <= 0 || hp2 <= 0 ){
                break;
            }
        }

        if(hp1 > hp2){
            System.out.println("The Winner is : " + character1.getName());
        }
        else {
            System.out.println("The Winner is : " + character2.getName());
        }

    }









}
