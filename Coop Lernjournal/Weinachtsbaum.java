package PdfFachHochSchule;

import java.util.Scanner;

public class Weinachtsbaum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Height: ");
        int height = scanner.nextInt();
        counter = height * 2 -1;
        int width = 0;
        width = widthmaker(counter,width);
        int highttrunk =0;
        highttrunk = heightmaker(counter,highttrunk);
        crown(height, counter);
        widthmaker(counter, width);
        heightmaker(counter, highttrunk);
        trunk(height, width, highttrunk);
    }
    private static void crown(int height, int counter) {

        for (int i = 0; i < height; i++) {
            for (int j = 1; j < (height - i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static int widthmaker(int counter, int width){
        width =  counter /3;
        if(width %2 == 0){
            width = width -1;
        }
        return width;

    }
    private static int heightmaker(int height, int heighttrunk){
        heighttrunk = height /3;
        return heighttrunk;
    }

    private static void trunk(int height, int width, int heighttrunk) {
        for (int s = 1; s < heighttrunk; s++ ) {
            for (int j = 1; j < (height - 1); j++) {
                System.out.print(" ");
            }
            for (int f = 1; f <= width; f++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }
}

