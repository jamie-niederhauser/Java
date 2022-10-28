package PdfFachHochSchule;

import java.util.Scanner;

public class RautenRechteck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Rauten soll die Höhe des Rechtecks sein?");
        int höhe = scanner.nextInt();

        System.out.println("Wie breit soll das Rechteck sein?");
        int breite = scanner.nextInt();

        for(int i = 0; i < höhe; i++){

            for (int y = 1;y < breite; y++){
                System.out.print("#");

            }
            System.out.println("#");
        }

    }
}
