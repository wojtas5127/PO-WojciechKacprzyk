package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;

import java.util.Scanner;

// Zad 1 a)

//public class Zad2 {
//
// public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     int niep = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    for(int i =1;i <= n;i++)
//        {
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//        if(x%2!=0)niep+=1;
//
// }
// System.out.print("Nieparzystych jest: "+niep);
// }
//}

//zad 1 b)

//public class Zad2 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//    int liczby = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    for(int i =1;i <= n;i++)
//        {
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//        if(x%3==0 & x%5!=0)liczby+=1;
//
//
//    }
//    System.out.print("Ilość liczb podzielnych przez 3 i niepodzielnych przez 5 to: "+liczby);
//    }
//}


//zad 1 c)

//public class Zad2 {
//
// public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//    int kw = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    for(int i =1;i <= n;i++)
// {
//    System.out.print("\nWpisz "+ i +" liczbe: ");
//    x = scan.nextInt();
//
//    for(int j=0;j<=x;j++)
//    {
//        if(Math.sqrt(x)==j & j%2==0)kw+=1;
//    }
// }
// System.out.print("Ilość liczb będących kwadratami liczby parzystej to: "+kw);
// }
//}


// zad 1 f)

//public class Zad2 {
//
//    public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//    int wynik = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//
//        for(int i =1;i <= n;i++)
//        {
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//        num+=1;
//        if(x%2==0 & i%2!=0)wynik+=1;
//        }
//    System.out.print("Ilość liczb o nieparzystym numerze, które są parzyste to: "+wynik);
//    }
//}


 //zad 1 g)

//public class Zad2 {
//
//    public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//    int wynik = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    for(int i =1;i <= n;i++)
//        {
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//        if(x%2!=0 & x>0)wynik+=1;
//
//
// }
// System.out.print("Ilość liczb nieparzystych i jednocześnie nieujemnych to: "+wynik);
// }
//}


// Zad 2
//
//public class Zad2 {
//
//    public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//    int suma = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    for(int i =1;i <= n;i++)
//    {
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//        if(x>0)suma+=x;
//
//
//    }
//    suma=suma*2;
//    System.out.print("Podwojona suma podanych liczb nieujemnych wynosi: "+suma);
//    }
//}

// Zad 3

//public class Zad2 {
//
// public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//    int dod = 0;
//    int uj = 0;
//    int zero = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    for(int i =1;i <= n;i++)
//    {
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//        if(x>0)dod+=1;
//
//        else if(x<0)uj+=1;
//
//        else zero+=1;
//
//
//    }
//
//    System.out.print("\nIlość liczb dodatnich: "+dod);
//    System.out.print("\nIlość liczb ujemnych: "+uj);
//    System.out.print("\nIlość zer: "+zero);
//    }
//}

// Zad 4

//public class Zad2 {
//
// public static void main(String[] args) {
//      Scanner scan = new Scanner(System.in);
//      int max=0;
//      int min=0;
//      System.out.print("Wpisz n: ");
//      int n = scan.nextInt();
//      int x;
//      for(int i =1;i <= n;i++)
//      {
//          System.out.print("\nWpisz "+ i +" liczbe: ");
//          x = scan.nextInt();
//          if(i==1)
//            {
//            max=x;
//            min=x;
//            }
//            if(x>max)max=x;
//
//            if(x<min)min=x;
//
//            }
//
//    System.out.print("\nNajwiększa liczba z podanych to: "+max);
//    System.out.print("\nNajmniejsza liczba z podanych to: "+min);
//    }
//}


