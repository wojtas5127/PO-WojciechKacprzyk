import pl.imiajd.kacprzyk.Osoba;
import pl.imiajd.kacprzyk.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args)
    {
        ArrayList<Student> grupa= new ArrayList<Student>();
        grupa.add(new Student("kacprzyk", LocalDate.of(2000,1,21),3.0));
        grupa.add(new Student("Fortz", LocalDate.of(1993,11,7),5.1));
        grupa.add(new Student("Kamiński", LocalDate.of(1991,7,15),4.1));
        grupa.add(new Student("Cash", LocalDate.of(1984,4,7),3.7));
        grupa.add(new Student("Bałałajek", LocalDate.of(1999,10,26),4.0));

        System.out.print(grupa.toString());
        Collections.sort(grupa);
        System.out.print(grupa.toString());


    }
}
