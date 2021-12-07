package pl.imiajd.kacprzyk;

public class Osoba {

    private String nazwisko;
    private String rokUrodzenia;

    public Osoba(String nazwisko,String rokUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }
    public String getNazwisko()
    {
        return this.nazwisko;
    }
    public String getRokUrodzenia()
    {
        return this.rokUrodzenia;
    }
    public String toString()
    {
        return String.format("Nazwisko: %s Rok Urodzenia: %s ",this.nazwisko,this.rokUrodzenia);

    }
}
