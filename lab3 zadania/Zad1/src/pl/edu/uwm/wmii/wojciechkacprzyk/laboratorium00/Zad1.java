package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;;
import java.util.Random;
import java.util.Scanner;

//Zad 1 a)
//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random r = new Random();
//        int par = 0;
//        int niepar = 0;
//        int n=0;
//        int x = 0;
//        while(x!=1)
//        {
//            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
//            n = in.nextInt();
//            if(n>=1 && n<=100)
//                x=1;
//        }
//        int[] tab = new int[n];
//        for (int i = 0; i < n; ++i) {
//            tab[i] = r.nextInt((999 +999) )-999;
//            if (tab[i] % 2 == 0)
//                par++;
//            if (tab[i] % 2 == 1)
//                niepar++;
//        }
//        System.out.print("Liczby parzyste: "+par+"\nLiczby nieparzyste: "+niepar);
//
//    }
//}

//Zad 1 b)

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random r = new Random();
//        int ujemne = 0;
//        int dodatnie = 0;
//        int zera = 0;
//        int n=0;
//        int x = 0;
//        while(x!=1)
//        {
//            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
//            n = in.nextInt();
//            if(n>=1 && n<=100)
//                x=1;
//        }
//        int[] tab = new int[n];
//        for (int i = 0; i < n; ++i) {
//            tab[i] = r.nextInt((999 +999) )-999;
//            if (tab[i] > 0)
//                dodatnie++;
//            if (tab[i] < 0)
//                ujemne++;
//            if (tab[i] == 0)
//                zera++;
//        }
//        System.out.print("Liczby dodatnie: "+dodatnie+"\nLiczby ujemne: "+ujemne+"\nZera: "+zera);
//
//    }
//}

//Zad 1 c)

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random r = new Random();
//        int max = 0;
//        int ile = 0;
//        int n=0;
//        int x = 0;
//        while(x!=1)
//        {
//            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
//            n = in.nextInt();
//            if(n>=1 && n<=100)
//                x=1;
//        }
//        int[] tab = new int[n];
//        for (int i = 0; i < n; ++i) {
//            tab[i] = r.nextInt((999 +999) )-999;
//            if (tab[i] > max)
//                max=tab[i];
//            if (tab[i] == max)
//                ile++;
//
//        }
//        System.out.print("Element największy występuje "+ile+" razy");
//
//    }
//}

//Zad 1 d)

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random r = new Random();
//        int sumaujemne = 0;
//        int sumadodatnie = 0;
//        int n=0;
//        int x = 0;
//        while(x!=1)
//        {
//            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
//            n = in.nextInt();
//            if(n>=1 && n<=100)
//                x=1;
//        }
//        int[] tab = new int[n];
//        for (int i = 0; i < n; ++i) {
//            tab[i] = r.nextInt((999 +999) )-999;
//            if (tab[i] > 0)
//                sumadodatnie+=tab[i];
//            if (tab[i] < 0)
//                sumaujemne+=tab[i];
//
//        }
//        System.out.print("Suma liczb dodatnich: "+sumadodatnie+"\n Suma liczb ujemnych: "+sumaujemne);
//
//    }
//}

//Zad 1 e)

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random r = new Random();
//        int naj_fr = 0;
//        int fr = 0;
//        int zera = 0;
//        int n=0;
//        int x = 0;
//        while(x!=1)
//        {
//            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
//            n = in.nextInt();
//            if(n>=1 && n<=100)
//                x=1;
//        }
//        int[] tab = new int[n];
//        for (int i = 0; i < n; ++i) {
//            tab[i] = r.nextInt((999 +999) )-999;
//            if (tab[i] > 0){
//
//                fr++;
//                if(fr>naj_fr)
//                    naj_fr=fr;
//            }
//        }
//        System.out.print("Długośc najdłuższego fragmentu tablicy gdzie elementy są dodatnie: "+naj_fr);
//
//    }
//}

//Zad 1 f)

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Random r = new Random();
//        int n=0;
//        int x = 0;
//        while(x!=1)
//        {
//            System.out.print("Podaj liczbe rzeczywista od 1 do 100: ");
//            n = in.nextInt();
//            if(n>=1 && n<=100)
//                x=1;
//        }
//        int[] tab = new int[n];
//        for (int i = 0; i < n; ++i) {
//            tab[i] = r.nextInt((999 +999) )-999;
//            if (tab[i] > 0)
//                tab[i]=1;
//            if (tab[i] < 0)
//                tab[i]=-1;
//
//            System.out.print(tab[i]+"\n");
//        }
//    }
//}

