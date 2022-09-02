package Invoice;

import Arraylist.Person;

import java.util.ArrayList;

public class Firma {

        ArrayList<Rechnung> list;
    private double mehrWertSteuer;

        public Firma(double mehrWertSteuer){
            this.list= new ArrayList<Rechnung>();
            this.mehrWertSteuer = mehrWertSteuer;
        }




    public void addRechnung(Rechnung rechnung){
        list.add(rechnung);
    }

    public double getFirmaAmountExcl(){
        double amount = 0;

        for(Rechnung rechnung: this.list){
            amount += rechnung.getPreis();
        }

        return amount;
    }

    public double getMehrWertSteuer() {
        return mehrWertSteuer;
    }

    public void setMehrWertSteuer(double mehrWertSteuer) {
        this.mehrWertSteuer = mehrWertSteuer;
    }


    public double getMwSt(){
        double amountMehrWertSteur = (getFirmaAmountExcl() / 100) * getMehrWertSteuer() ;
            return amountMehrWertSteur;
    }

    public double total(){
       double total = 0;
        total = getMwSt() + getFirmaAmountExcl();

        return total;
    }

    public void printFirma(){

            for( Rechnung rechnung : this.list) {
                Person person = rechnung.getPerson();
                if (person != null) {
                    System.out.println(person.getName() + " hat " + rechnung.getArticletext() + " " + rechnung.getArticleNumber() + " " + rechnung.getPreis());
                }
            }

        System.out.println("Sum: " + getFirmaAmountExcl());
        System.out.println("MwST: " + getMehrWertSteuer() + "%  " + getMwSt());
        System.out.println("Total: " + total());
    }
}
