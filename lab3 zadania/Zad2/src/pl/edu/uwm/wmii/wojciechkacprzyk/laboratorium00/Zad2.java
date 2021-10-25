package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;

import java.util.Random;
import java.util.Scanner;

public class Zad2 {

    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random r = new Random();
        int x = 0;
        while (x != 1) {
            if (n >= 1 && n <= 100)
                x = 1;
        }
        for (int i = 0; i < n; i++) {
            tab[i] = r.nextInt((maxWartosc + maxWartosc)) + minWartosc;

            System.out.print(tab[i] + "\n");
        }

    }
    //Zad 2 a)

    public static int ileNieparzystych(int tab[]) {
        int niep = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 1)
                niep++;
        }
        return niep;
    }

    public static int ileParzystych(int tab[]) {
        int par = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0)
                par++;
        }
        return par;
    }

    //Zad 2 b)

    public static int ileDodatnich(int tab[]) {
        int dodatnie = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                dodatnie++;
        }
        return dodatnie;
    }

    public static int ileUjemnych(int tab[]) {
        int ujemne = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                ujemne++;
        }
        return ujemne;
    }

    public static int ileZerowych(int tab[]) {
        int zer = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0)
                zer++;
        }
        return zer;
    }

    //Zad 2 c)

    public static int ileMaksymalnych(int tab[]) {
        int max = 0;
        int ile = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max)
                max = tab[i];
            if (tab[i]==max)
                ile++;
        }
        return ile;
    }

    //Zad 2 d)

    public static int sumaDodatnich(int tab[]) {
        int sumadodatnich = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                sumadodatnich+=tab[i];
        }
        return sumadodatnich;
    }

    public static int sumaUjemnych(int tab[]) {
        int sumaujemnych = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0)
                sumaujemnych+=tab[i];
        }
        return sumaujemnych;
    }

    //Zad 2 e)

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int fr = 0;
        int naj_fr = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                fr++;
                if(fr>naj_fr)
                    naj_fr=fr;
        }
        return naj_fr;
    }

    //Zad 2 f)

    public static void signum(int tab[]) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0)
                tab[i] = 1;
            if(tab[i] < 0)
                tab[i] = -1;

            System.out.print(tab[i]+"\n");
        }

    }



    public static void main(String[] args) {
        int n = 0;
        int x = 0;
        while (x != 1) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Podaj n z przedziału od 1 do 100: ");
            n = scan.nextInt();
            if (n >= 1 && n <= 100)
                x = 1;
        }



        int tab[] = new int[n];
        generuj(tab,n,-999,999);
        System.out.print("\nLiczby nieparzyste: "+ileNieparzystych(tab));
        System.out.print("\nLiczby parzyste: "+ileParzystych(tab));
        System.out.print("\nLiczby dodatnie: "+ileDodatnich(tab));
        System.out.print("\nLiczby ujemne: "+ileUjemnych(tab));
        System.out.print("\nZera: "+ileZerowych(tab));
        System.out.print("\nSuma liczb dodatnich: "+sumaDodatnich(tab));
        System.out.print("\nSuma liczb dodatnich: "+sumaUjemnych(tab));
        System.out.print("\nDługośc najdłuższego fragmentu tablicy gdzie elementy są dodatnie: "
                +dlugoscMaksymalnegoCiaguDodatnich(tab)+"\n");
        signum(tab);


    }


}


