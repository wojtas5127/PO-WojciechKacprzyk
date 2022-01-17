package pl.imiajd.kacprzyk;
import java.util.Collections;
import java.util.LinkedList;


public class Main {

    public static void redukuj(LinkedList<String> pracownicy, int n)
    {
        int j=0;
        for(int i=0;i<pracownicy.size();i++)
        {
            j++;
            if(j%n ==0)
            {
                pracownicy.remove(i);
                j=0;
                i--;
            }
        }
    }
    public static void odwroc(LinkedList<String> lista)
    {
        Collections.reverse(lista);
    }


    public static void main(String[] args) {

        LinkedList<String> lista=new LinkedList<String>();
        lista.add("Kowalewski");
        lista.add("Grzymała");
        lista.add("Jesiocki");
        lista.add("Koperdowski");
        lista.add("Akarman");
        lista.add("Graczykowski");
        redukuj(lista,3);
        System.out.println(lista.toString());

        odwroc(lista);
        System.out.println(lista.toString());

    }
}
