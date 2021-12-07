package pl.imiajd.kacprzyk;

import java.time.LocalDate;

public class Skrzypce extends Instrument{

    public Skrzypce(String producent, LocalDate rokProdukcji)
    {
        super(producent,rokProdukcji);
    }


    @Override
    public  String dzwiek()
    {
        return "Dźwięki skrzypiec";

    }
}
