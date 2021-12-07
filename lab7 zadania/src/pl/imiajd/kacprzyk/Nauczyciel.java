package pl.imiajd.kacprzyk;

public class Nauczyciel extends Osoba{

    private String pensja;


    public Nauczyciel(String nazwisko, String rokUrodzenia,String pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja=pensja;
    }
    public String getPensja()
    {
        return this.pensja;
    }
    public String toString()
    {
        return String.format("%s, jego pensja wynosi: %s \n",super.toString(),this.pensja);

    }
}
