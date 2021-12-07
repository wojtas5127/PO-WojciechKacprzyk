import java.time.LocalDate;
import java.util.ArrayList;
import pl.imiajd.kacprzyk.Skrzypce;
import pl.imiajd.kacprzyk.Flet;
import pl.imiajd.kacprzyk.Fortepian;
import pl.imiajd.kacprzyk.Instrument;

public class TestInstrumenty {

    public static void main(String[] args)
    {
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        LocalDate rokProdukcji= LocalDate.of(2010,7,17);
        orkiestra.add(new Flet("Yamaha",rokProdukcji));
        orkiestra.add(new Fortepian("August Forster",rokProdukcji));
        orkiestra.add(new Skrzypce("Ever Play",rokProdukcji));
        orkiestra.add(new Flet("Yamaha",rokProdukcji));
        orkiestra.add(new Flet("Yamaha",rokProdukcji));
        System.out.print(orkiestra.get(0).dzwiek()+"\n");
        System.out.print(orkiestra.get(1).dzwiek()+"\n");
        System.out.print(orkiestra.get(2).dzwiek()+"\n");
        System.out.print(orkiestra.get(3).dzwiek()+"\n");
        System.out.print(orkiestra.get(4).dzwiek()+"\n");
    }
}
