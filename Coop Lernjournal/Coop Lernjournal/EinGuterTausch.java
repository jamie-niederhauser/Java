package PdfFachHochSchule;

public class EinGuterTausch {
    public static void main(String[] args) {

        int [] myNumbers = {1,2,3,4,5};
        int a = myNumbers[0];
        int i = 0;

        for(int e = 0; e < myNumbers.length; e++){
            System.out.print(myNumbers[e] + "  ");
        }
        System.out.println("");



            for (; i < myNumbers.length - 1; i++) {
                a = myNumbers[i];
                myNumbers[i] = myNumbers[i + 1];
                myNumbers[i + 1] = a;
                for(int e = 0; e < myNumbers.length; e++){
                    System.out.print(myNumbers[e] + "  ");

                }
                System.out.println("");
            }



    }
}
