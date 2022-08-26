package PdfFachHochSchule;

import java.util.Locale;
import java.util.Scanner;

public class Buchstabensalat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        System.out.println("Schreiben Sie ihren verschlüsselten Brief:");
        while ((text = scan.nextLine()) != null) {
            encrypt(text);
            System.out.println();
        }
    }

        public static void encrypt(String text){
            for(int i =0; i < text.length();i++){
                char letter = text.charAt(i);


                 if((letter < 'n' && letter >= 'a') || (letter < 'N' && letter >= 'A')){
                    System.out.print((char)(letter + 13));
                }


                else if ((letter >= 'n' && letter <= 'z') || (letter >= 'N' && letter <= 'Z')){
                    System.out.print((char)(letter - 13));
                }

                else {
                     System.out.print(letter);
                 }
            }
        }







}
