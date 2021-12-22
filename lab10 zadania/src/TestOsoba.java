import pl.imiajd.kacprzyk.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa= new ArrayList<Osoba>();
        grupa.add(new Osoba("kacprzyk", LocalDate.of(2000,1,21)));
        grupa.add(new Osoba("Fortz", LocalDate.of(1993,11,7)));
        grupa.add(new Osoba("Kamiński", LocalDate.of(1991,7,15)));
        grupa.add(new Osoba("Cash", LocalDate.of(1984,4,7)));
        grupa.add(new Osoba("Bałałajek", LocalDate.of(1999,10,26)));

        System.out.print(grupa.toString());
        Collections.sort(grupa);
        System.out.print(grupa.toString());


    }
}
