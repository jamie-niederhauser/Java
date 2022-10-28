package PdfFachHochSchule;

import java.util.Scanner;

public class Worterketten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;
        String wort;
        String wort2;
        char firstletter1;
        char lastletter1;
        char firstletter2;
        char lastletter2;
        int length;

        System.out.println("Bei diesem\n" +
                "Spiel fängt der erste Spieler an mit einem beliebigen Wort. Der zweite Spieler muss darauf ein Wort\n" +
                "nennen, dessen Anfangsbuchstabe der Endbuchstabe des letzten genannten Wortes ist.\n" +
                "Anschließend ist wieder der erste Spieler dran. Jeder Spieler bekommt dabei die Länge seines\n" +
                "Wortes als Punkte gutgeschrieben. Sollte ein Spieler ein Wort nennen, das die Bedingung nicht\n" +
                "erfüllt, verliert er alle seine Punkte und hat verloren. Gewonnen hat der erste Spieler mit insgesamt\n" +
                "30 Punkten bzw. mit den meisten Punkten.\n");

do {
    System.out.println("Eingabe das ersten Spielers: ppp ");
    wort = scanner.nextLine();

    firstletter1 = wort.charAt(0);
    lastletter1 = wort.charAt(wort.length() - 1);

    System.out.println("Nächster Spieler ist an der Reihe:");
    wort2 = scanner.nextLine();

    firstletter2 = wort2.charAt(0);
    lastletter2 = wort2.charAt(wort2.length() - 1);

    if (lastletter1 == firstletter2) {
        length = wort2.length();
        counter2 = counter2 + length;
        System.out.printf("Spieler zwei bekommt %d Punkte. Spieler zwei hat %d Punkte %n", length, counter2);

    } else {
        System.out.println("Da der Buchstabe nicht übereinstimmt werden alle Punkte des Spilers auf 0 gsetzt.");
    }

}

        while ( counter1 < 30 || counter2 < 30) ;{



            System.out.println("Eingabe das ersten Spielers:");
             wort = scanner.nextLine();
             firstletter1 = wort.charAt(0);
             lastletter1 = wort.charAt(wort.length() - 1);

            if (lastletter2 == firstletter1){
                 length = wort.length();
                counter1 = counter1 + length;
                System.out.printf("Spieler 1 bekommt %d Punkte. Spieler zwei hat %d Punkte %n" , length, counter1);
            }
            else {
                System.out.println("Da der Buchstabe nicht übereinstimmt werden alle Punkte des Spilers auf 0 gsetzt.");
                counter1 = 0;
            }

            System.out.println("Nächster Spieler ist an der Reihe:");
             wort2 = scanner.nextLine();

             firstletter2 = wort2.charAt(0);
             lastletter2 = wort2.charAt(wort2.length());

            if (lastletter1 == firstletter2){
                 length = wort2.length();
                counter2 = counter2 + length;
                System.out.printf("Spieler zwei bekommt %d Punkte. Spieler zwei hat %d Punkte %n" , length, counter2);
            }
            else {
                System.out.println("Da der Buchstabe nicht übereinstimmt werden alle Punkte des Spilers auf 0 gsetzt.");
                counter2 =0;
            }


        }
        System.out.println("Das Spiel ist zu Ende weil einer der Spieler die 30 Punkte geschaft hat");
        System.out.printf("Spieler 1 hat %d Punkte und Spieler 2 hat %d Punkte",counter1, counter2);


    }
}
