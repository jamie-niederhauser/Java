package PdfFachHochSchule;

import java.text.NumberFormat;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie viele Produkte haben sie eingekauft?");
        int amount = scan.nextInt();
        double[] values = new double[amount];

        int counter = 0;

        for(int i= 0; i < amount; i++) {
            counter++;
            System.out.printf("Wie viel hat das %d. Produkt gekostet?", counter);
            values[i] = scan.nextDouble();
        }

        double sum =0;



        for (int y= 0; y<amount; y++){
             sum = sum + values[y];
        }
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);


        System.out.println("Gesamtbetrag:" + n.format(sum));
    }
}
