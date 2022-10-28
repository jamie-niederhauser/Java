package PdfFachHochSchule;

import java.util.Scanner;

public class wortketten02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;
        String wort;
        String wort2;
        char firstletter1;
        char lastletter1;
        char firstletter2;
        char lastletter2 = 'r';
        int length = 0;

       System.out.println("Bei diesem\n" +
                "Spiel fängt der erste Spieler an mit einem beliebigen Wort. Der zweite Spieler muss darauf ein Wort\n" +
                "nennen, dessen Anfangsbuchstabe der Endbuchstabe des letzten genannten Wortes ist.\n" +
                "Anschließend ist wieder der erste Spieler dran. Jeder Spieler bekommt dabei die Länge seines\n" +
                "Wortes als Punkte gutgeschrieben. Sollte ein Spieler ein Wort nennen, das die Bedingung nicht\n" +
                "erfüllt, verliert er alle seine Punkte und hat verloren. Gewonnen hat der erste Spieler mit insgesamt\n" +
                "30 Punkten bzw. mit den meisten Punkten.\n");

        System.out.println("Eingabe das ersten Spielers:");
        wort = scanner.nextLine();
        firstletter1 = wort.charAt(0);
        lastletter1 = wort.charAt(wort.length() - 1);


        spielereins(wort ,scanner,firstletter1, lastletter2 );
        System.out.println(wort);

    }

    public static void spielereins(String wort, Scanner scanner, char firstletter1, char lastletter1) {
        System.out.println("Eingabe das ersten Spielers:");
        wort = scanner.nextLine();
        firstletter1 = wort.charAt(0);
        lastletter1 = wort.charAt(wort.length() - 1);

    }
}



