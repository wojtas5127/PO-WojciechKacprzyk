import pl.imiajd.kacprzyk.Adres;
import pl.imiajd.kacprzyk.Nauczyciel;
import pl.imiajd.kacprzyk.Student;
import pl.imiajd.kacprzyk.BetterRectangle;

public class test {

    public static void main(String[] args)
    {
        Adres adres1= new Adres("Polna","9","11","Kraków","30-002");
        adres1.pokaz();
        Student student1=new Student("Warszawski","2000","Informatyka ogólna");
        Nauczyciel Nauczyciel1=new Nauczyciel("Zagrobelny","1982","4100");
        System.out.print(student1.toString());
        System.out.print(Nauczyciel1.toString());
        BetterRectangle rect=new BetterRectangle(0,0,10,3);
        System.out.print(rect.getArea()+"\n");
        System.out.print(rect.getPerimeter()+"\n");
    }
}
