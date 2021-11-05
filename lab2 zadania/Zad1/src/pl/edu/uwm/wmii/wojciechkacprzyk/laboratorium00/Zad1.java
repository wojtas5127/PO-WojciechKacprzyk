package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;

import java.util.Scanner;


//zad 1 a)

//public class Zad1 {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int n = scan.nextInt();
//        int x;
//        for(int i =1;i <= n;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            x = scan.nextInt();
//            wynik+=x;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//
//}


//zad 1 b)

//public class Zad1 {
//
//   Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int n = scan.nextInt();
//        int x;
//        for(int i =1;i <= n;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            x = scan.nextInt();
//            wynik*=x;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}

//zad 1 c)

//public class Zad1 {
//
//   Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int n = scan.nextInt();
//        int x;
//        for(int i =1;i <= n;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            x = scan.nextInt();
//            wynik+=Math.abs(x);
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}

//zad 1 d)

//public class Zad1 {

//            Scanner scan = new Scanner(System.in);
//            int wynik = 0;
//            System.out.print("Podaj ilość liczb: ");
//            int n = scan.nextInt();
//            int x;
//            for(int i =1;i <= n;i++){
//                System.out.print("\nPodaj "+i+" liczbe: ");
//                x = scan.nextInt();
//                wynik+=Math.sqrt(Math.abs(x));
//             }
//                System.out.print("Wynik dodawania to: "+wynik);
//    }
//}

//zad 1 e)

//public class Zad1 {
//
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int n = scan.nextInt();
//        int x;
//        for(int i =1;i <= n;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            x = scan.nextInt();
//            wynik*=Math.abs(x);
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}

//zad 1 f)

//public class Zad1 {
//
//  Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int n = scan.nextInt();
//        int x;
//       for(int i =1;i <= n;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            x = scan.nextInt();
//            wynik+=pow(x,2);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}

//zad 1 g)

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = scan.nextInt();
//        int x;
//        int wynik=0;
//        int wynik2=1;
//        for (int i = 1; i <= n; i++) {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            x = scan.nextInt();
//            wynik+=x;
//            wynik2*=x;
//
//        }System.out.println("Wynik sumy: " + wynik + "\nWynik iloczynu: "+ wynik2);
//    }
//}

//zad 1 h)

//public class Zad1 {
//      public static void main(String[] args) {
//          Scanner scan = new Scanner(System.in);
//          int wynik = 0;
//          System.out.print("Wpisz n: ");
//          int n = scan.nextInt();
//          int x;
//          for(int i =1;i <= n;i++){
//              System.out.print("\nWpisz " + i + " liczbe: ");
//              x = scan.nextInt();
//              if(i%2==0)wynik-=x;
//              else wynik+=x;
// }
// System.out.print("Wynik: "+wynik);
// }
//}

//zad 1 i)

//public class Zad1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//    System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    int silnia = 1;
//    for(int i =1;i <= n;i++){
//        silnia*=i;
//        System.out.print("\nWpisz "+ i +" liczbe: ");
//        x = scan.nextInt();
//    if(i%2==0)wynik+=x/silnia;
//    else wynik-=x/silnia;
// }
// System.out.print("Wynik: "+wynik);
// }
//}

//zad 1 2)

//public class Zad1 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Wpisz n: ");
//    int n = scan.nextInt();
//    int x;
//    int tab[] = new int[n];
//    for(int i =0;i < n;i++){
//        System.out.print("\nWpisz "+(i+1)+" liczbe: ");
//        x = scan.nextInt();
//    tab[i]=x;
//    }
//    for(int i = 1;i<n;i++){
//        System.out.print(tab[i]+"\n");
//    }
//        System.out.print(tab[0]);
//    }
//}