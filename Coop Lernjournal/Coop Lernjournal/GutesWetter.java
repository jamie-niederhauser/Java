package PdfFachHochSchule;

public class GutesWetter {
    public static void main(String[] args) {
        int differece;
        int highestDifference =0;
        int highestDifferenceDay;

        int[] temparturen = {12,14,10,7,11,13,12,15,15,18,16,13,10,12};
        int[] tage = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};

        for(int i = 0; i <= 13; i++){
            System.out.printf("Tag: %d",tage[i]);
            System.out.printf(" waren es %d Grad. %n",temparturen[i]);
        }


        for (int i = 0; i < 13; i++ ){
        if(temparturen[i] < temparturen[i+1]){
            differece = temparturen[i+1] - temparturen[i];
        }
        else {
            differece = temparturen[i]- temparturen[i+1];
        }
        if (differece > 3){
            highestDifference = differece;
        }
        }

        for(int b = 0; b < temparturen.length -1; b++){
            if (temparturen[b]- temparturen[b+1] == highestDifference){
                highestDifferenceDay = tage[b];
                System.out.printf("Die heissesten Tage liegen zwischen dem Tag %d und %d und die Differenz beträgt: %d. ",highestDifferenceDay,highestDifferenceDay +1,highestDifference);
            }

            else if (temparturen[b + 1]- temparturen[b] == highestDifference){
                highestDifferenceDay = tage[b + 1];
                System.out.printf("Die heissesten Tage liegen zwischen dem Tag %d und %d und die Differenz beträgt: %d",highestDifferenceDay - 1,highestDifferenceDay,highestDifference);
            }


        }

    }
}
