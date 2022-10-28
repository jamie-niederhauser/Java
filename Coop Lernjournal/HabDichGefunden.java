package PdfFachHochSchule;

import java.util.Random;
import java.util.Scanner;

public class HabDichGefunden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();
        int randomLength = random.nextInt(15);

        int[] array = new int[randomLength];
        boolean testing= false;
        int counter = 1;

        int randomNumber = 0;
        for (int i = 0; i < array.length - 1; i++) {
            randomNumber = random.nextInt(50);
            array[i] = randomNumber;
        }

        System.out.println(" Geben Sie eine Zahl zwischen 1-50 ein, welche sie danken sich im Array befindet:");
        int number = scan.nextInt();

        for (int b = 0; b < array.length -1;b++){
            if (array[b]== number){
                testing = true;
            }
        }

        if (testing == true ) {
            System.out.println("sie haben richtig getippt");
        }
        while (testing != true) {
                System.out.println("versuchen Sie es nochmals:");
                number= scan.nextInt();
                counter++;

            for (int b = 0; b < array.length -1;b++){
                if (array[b]== number){
                    testing = true;
                }
            }
        }
        if (testing == true ) {
            System.out.println("sie haben richtig getippt");
            System.out.println("Versuche: " + counter);
        }
    }
}
