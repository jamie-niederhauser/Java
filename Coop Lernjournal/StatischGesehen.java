package PdfFachHochSchule;

import java.util.Scanner;

public interface StatischGesehen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length;

        System.out.println("Wie viele Zahlen möchten sie eingeben?");
        length = scan.nextDouble();

        double[] numbers = new double[(int) length];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Geben sie eine Zahl ein");
            double number = scan.nextInt();
            numbers[i] = number;
        }
        double firstNumber;
        firstNumber = numbers[0];

        minimum(numbers, firstNumber);
        maximum(numbers,firstNumber);
        mean(numbers);

    }


        public static double minimum ( double[] numbers, double firstNumber){
        double smallestNumber =0;
        for(int s =0;s < numbers.length ; s++ ){
            if(numbers[s] < firstNumber ){
                smallestNumber = numbers[s];
            }
        }
            System.out.printf("Die kleinste Zahl ist: %f %n",smallestNumber);
        return smallestNumber;
        }

        public static double maximum ( double[] numbers, double firstNumber){
            double highestNumber =0;
            for(int s =0;s < numbers.length ; s++ ){
                if(numbers[s] > firstNumber ){
                    highestNumber = numbers[s];
                }
            }
            System.out.printf("Die grösste Zahl ist: %f %n",highestNumber);
            return highestNumber;
        }


        public static double mean ( double[] numbers){
    double meanNumber =0;
    double sum =0;
    for (int s =0;s < numbers.length ; s++){
        sum =  sum + numbers[s];
    }
    meanNumber = sum / numbers.length;
            System.out.printf("Der Durchschnitt ist: %f %n",meanNumber);
    return meanNumber;
        }


}