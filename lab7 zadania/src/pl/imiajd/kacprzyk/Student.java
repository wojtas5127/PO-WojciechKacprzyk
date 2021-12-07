package pl.imiajd.kacprzyk;

public class Student extends Osoba{

    private String kierunek;
    public Student(String nazwisko, String rokUrodzenia,String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek=kierunek;
    }

    public String getKierunek()
    {
        return this.kierunek;
    }
    public String toString()
    {
        return String.format("%s, jego kierunek to: %s \n",super.toString(),this.kierunek);
    }
}
