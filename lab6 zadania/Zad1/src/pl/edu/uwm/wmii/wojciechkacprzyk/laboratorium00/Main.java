package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;

public class Main {

    public static void main(String[] args)
    {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        System.out.print("Saldo pierwszego klienta po pierwszym miesiącu: "+saver1.obliczMiesieczneOdsetki()+"\n");
        System.out.print("Saldo drugiego klienta po pierwszym miesiącu: "+saver1.obliczMiesieczneOdsetki()+"\n");
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        System.out.print("Saldo pierwszego klienta po drugim miesiącu: "+saver1.obliczMiesieczneOdsetki()+"\n");
        System.out.print("Saldo drugiego klienta po drugim miesiącu: "+saver1.obliczMiesieczneOdsetki()+"\n");

    }

}
