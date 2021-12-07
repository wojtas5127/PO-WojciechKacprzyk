import pl.imiajd.kacprzyk.Pracownik;
import pl.imiajd.kacprzyk.Student;
import pl.imiajd.kacprzyk.Osoba;
import java.time.LocalDate;

public class TestOsoba {

    public static void main(String[] args)
    {
        String[] imiona= new String[2];
        imiona[0]="Mariusz";
        imiona[1]="Mirek";
        LocalDate data= LocalDate.of(1998,12,23);

        Student stu = new Student("Psikuta",imiona, data,true,"Informatyka",3.9);
        System.out.println(stu.getimiona()[0]);
        System.out.println(stu.getplec());
        System.out.println(stu.getNazwisko());
        System.out.println(stu.getDataUrodzenia());
        stu.setSredniaOcen(5.0);
        System.out.println(stu.getSredniaOcen());
        System.out.println(stu.getKierunek());
        System.out.println(stu.toString());

    }
}
