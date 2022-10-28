package PdfFachHochSchule;

import java.util.Scanner;

public class reuckwartsLesen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "";

        System.out.println("Eingabe:");
        text = scan.nextLine();


        isPolindrom(text);


    }

    public static boolean isPolindrom(String text){
        boolean trueOrFalse = false;
        for(int i = 0; i < text.length();i++){
            char firstlatter = text.charAt(i);
           // System.out.println(firstlatter);
            char lastlatter = text.charAt(text.length()-1 -i);
           // System.out.println(lastlatter);
            if(lastlatter == firstlatter){
                trueOrFalse = true;
            }
            else {
                break;
            }

        }
        System.out.println(trueOrFalse);
        return trueOrFalse;
    }








}
