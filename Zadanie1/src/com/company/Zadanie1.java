package com.company;

import java.util.Scanner;
import java.lang.Math;

//Zad 1 a)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//	Scanner in = new Scanner(System.in);
//	System.out.println("Podaj liczbę : ");
//	int n = in.nextInt();
//	int wynik=0;
//    for (int i = 1; i <= n; i++) {
//    wynik+=i;
//    System.out.println(i);
//    }System.out.println("Wynik to: " + wynik);
//    }
//}

//Zad 1 b)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = in.nextInt();
//        int wynik=1;
//        for (int i = 1; i <= n; i++) {
//            wynik*=i;
//            System.out.println(i);
//        }System.out.println("Wynik to: " + wynik);
//    }
//}

//zad 1 c)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = in.nextInt();
//        int wynik=0;
//        for (int i = 1; i <= n; i++) {
//            wynik+=Math.abs(i);
//            System.out.println(i);
//        }System.out.println("Wynik to: " + wynik);
//    }
//}

//zad 1 d)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = in.nextInt();
//        int wynik=1;
//        for (int i = 1; i <= n; i++) {
//            wynik+=Math.sqrt((Math.abs(i)));
//            System.out.println(i);
//        }System.out.println("Wynik to: " + wynik);
//    }
//}

//zad 1 e)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = in.nextInt();
//        int wynik=1;
//        for (int i = 1; i <= n; i++) {
//            wynik*=Math.abs(i);
//            System.out.println(i);
//        }System.out.println("Wynik to: " + wynik);
//    }
//}

//zad 1 f)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = in.nextInt();
//        int wynik=0;
//        for (int i = 1; i <= n; i++) {
//            wynik+=Math.pow(i,2);
//            System.out.println(i);
//        }System.out.println("Wynik to: " + wynik);
//    }
//}

//zad 1 g)

//public class Zadanie1 {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj liczbę : ");
//        int n = in.nextInt();
//        int wynik=0;
//        int wynik2=1;
//        for (int i = 1; i <= n; i++) {
//            wynik+=i;
//            wynik2*=i;
//            System.out.println(i);
//        }System.out.println("Wynik sumy to: " + wynik + "\nWynik iloczynu to: "+ wynik2);
//    }
//}

//zad 1 h)

public class Zadanie1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę : ");
        int n = in.nextInt();
        int wynik=0;
        int mnoznik=1;
        for (int i = 1; i <= n; i++) {
            wynik = wynik + (i*mnoznik);
            mnoznik = mnoznik*(-1);
            System.out.println(i);
        }System.out.println("Wynik to: " + wynik);
    }
}