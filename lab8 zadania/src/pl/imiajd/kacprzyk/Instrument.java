package pl.imiajd.kacprzyk;

import java.time.LocalDate;

public abstract class Instrument {

    private String producent;
    private LocalDate rokProdukcji;

    public Instrument(String producent,LocalDate rokProdukcji)
    {
        this.producent=producent;
        this.rokProdukcji=rokProdukcji;
    }

    public String getProducent()
    {
        return this.producent;
    }

    public LocalDate getRokProdukcji()
    {
        return this.rokProdukcji;
    }
    public abstract String dzwiek();

    public boolean equals(Instrument inst)
    {
        return this == inst;


    }

    public String toString()
    {
        return String.format("%s,%s",this.producent,this.rokProdukcji);
    }

}
