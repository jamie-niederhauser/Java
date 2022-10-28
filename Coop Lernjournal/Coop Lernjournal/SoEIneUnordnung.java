package PdfFachHochSchule;

public class SoEIneUnordnung {
    public static void main(String[] args) {


        int[] myNumbers = {9, 3, 2, 8, 6, 7, 5, 4, 1};

    int b =0;
    int c= 8;
    int a = myNumbers[0];

for (int j = 0; j < myNumbers.length; j++) {
    for (int i = 0; i < myNumbers.length - 1; i++) {


        if (myNumbers[i] < myNumbers[i + 1]) {


        } else {
            a = myNumbers[i +1];
            myNumbers[i + 1] = myNumbers[i];
            myNumbers[i] = a;
        }
        b++;
        c--;
    }
}

for (int e =0; e<myNumbers.length;e++) {
    System.out.print(myNumbers[e] + "  ");
}
    }

}
