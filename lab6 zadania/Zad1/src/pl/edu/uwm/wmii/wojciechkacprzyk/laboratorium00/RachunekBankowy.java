package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;

public class RachunekBankowy {

    private static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo)
    {
        this.saldo=saldo;
    }
    public double obliczMiesieczneOdsetki()
    {
        this.saldo+=(RachunekBankowy.rocznaStopaProcentowa*this.saldo)/12;
        return this.saldo;

    }
    public static void setRocznaStopaProcentowa(double nowaSP)
    {
        RachunekBankowy.rocznaStopaProcentowa=nowaSP;
    }
}
