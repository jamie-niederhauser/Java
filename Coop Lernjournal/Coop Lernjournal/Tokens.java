package PdfFachHochSchule;

import java.util.Scanner;

public class Tokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Amount tokens:");
        int amoutOfTokens = scanner.nextInt();

        for(int i =0; i < amoutOfTokens; i ++){

                System.out.print(".");

            if (  amoutOfTokens >= 2){
                System.out.print(":");
            }
                    if( amoutOfTokens >= 3) {
                            System.out.print("|");
                    }
            }

        }



    }

