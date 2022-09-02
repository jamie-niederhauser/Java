package Invoice;

import Arraylist.Person;

public class Rechnung {
    private String articletext;
    private double preis;
    private int articleNumber;
    private Person person;



    public Rechnung (String articletext, int articleNumber, double preis ){
        this.articletext = articletext;
        this.preis = preis;
    }

    public String getArticletext() {
        return articletext;
    }

    public void setArticletext(String articletext) {
        this.articletext = articletext;
    }

    public int getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this.articleNumber = articleNumber;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
