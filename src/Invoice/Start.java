package Invoice;

import Arraylist.Person;

public class Start {
    public static void main(String[] args) {
        Rechnung rechnung1 = new Rechnung("Stift", 735 ,9.9);
        Rechnung rechnung2 = new Rechnung("Papier",435, 6.9);
        Rechnung rechnung3 = new Rechnung("Schere", 456,97.9);
        Rechnung rechnung4 = new Rechnung("Leim",644, 1.9);

        Firma firma = new Firma(7.7);


        Person person1 = new Person("Jamie");
        Person person2 = new Person("Levin");
        Person person3 = new Person("Robin");

        rechnung1.setPerson(person1);
        rechnung2.setPerson(person2);
        rechnung3.setPerson(person3);
        rechnung4.setPerson(person1);


        firma.addRechnung(rechnung1);
        firma.addRechnung(rechnung2);
        firma.addRechnung(rechnung3);
        firma.addRechnung(rechnung4);

        firma.printFirma();
    }
}
