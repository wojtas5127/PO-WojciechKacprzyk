package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;

import java.util.Scanner;
import java.lang.StringBuffer;
import java.io.File;
import java.math.BigInteger;
import java.math.BigDecimal;

// Zad 1 a)

//public class Zad1 {
//
//    public static  int countChar(String str,char c)
//        {
//        int w=0;
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==c)
//            {
//                w++;
//            }
//        }
//
//        return w;
//    }
//
//    public static void main(String[] args) {
//
//        String napis="celestic";
//        char c= 'c';
//        System.out.print("W napisie "+napis+ " litera "+c +" występuje: "+countChar(napis,c));
//
//
//
//    }
//}

// Zad 1 b)

//public class Zad1 {
//
//    public static  int countSubStr(String str,String substr)
//    {
//        int j=0;
//        int c=0;
//        int w=0;
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==substr.charAt(j))
//            {
//               c++;
//               j++;
//            }
//            else
//            {
//                c=0;
//                j=0;
//            }
//            if(c==substr.length())
//            {
//                w++;
//                c=0;
//                j=0;
//            }
//        }
//
//        return w;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj pierwszy napis: \n");
//        String napis=scan.next();
//        System.out.print("Podaj drugi napis: \n");
//        String napis2=scan.next();
//        System.out.print("W napisie "+napis+ " napis "+napis2 +" występuje: "
//                +countSubStr(napis,napis2));
//
//
//
//    }
//}

// Zad 1 c)

//public class Zad1 {
//
//    public static  String Middle(String str)
//    {
//
//        String w="";
//
//            if(str.length()%2==0)
//            {
//                w+=str.charAt(str.length()/2-1);
//                w+=str.charAt(str.length()/2);
//
//
//            }
//            else
//            {
//                w+=str.charAt(str.length()/2);
//
//
//
//            }
//
//
//return w;
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: \n");
//        String napis=scan.next();
//
//        System.out.print(Middle(napis));
//
//
//
//    }
//}

// Zad 1 d)

//public class Zad1 {
//
//    public static  String repeat(String str, int n)
//    {
//
//        String w="";
//
//        for(int i=0;i<n;i++)
//        {
//            w+=str;
//        }
//
//        return w;
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: \n");
//        String napis=scan.next();
//
//        System.out.print(repeat(napis,3));
//
//
//
//    }
//}

// Zad 1 e)

//public class Zad1 {
//
//    public static  int[] Where(String str,String substr)
//    {
//        int j=0;
//        int c=0;
//        int x=0;
//        int w[]=new int[str.length()];
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)==substr.charAt(j))
//            {
//               c++;
//               j++;
//            }
//            else
//            {
//                c=0;
//                j=0;
//            }
//            if(c==substr.length())
//            {
//                w[x]=i;
//                x++;
//                c=0;
//                j=0;
//            }
//        }
//
//        return w;
//    }
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj pierwszy napis: \n");
//        String napis=scan.next();
//        System.out.print("Podaj drugi napis: \n");
//        String napis2=scan.next();
//        int tab[] = new int[napis.length()];
//        tab=Where(napis,napis2);
//        for(int i=0;i<napis.length();i++)
//        {
//            System.out.print(tab[i]);
//        }
//    }
//}

// Zad 1 f)

//public class Zad1 {
//    public static String Change(String str)
//    {
//
//        StringBuffer sb = new StringBuffer();
//
//        for(int i=0;i<str.length();i++)
//
//            if(Character.isUpperCase(str.charAt(i)))
//            {
//               sb.append(Character.toLowerCase(str.charAt(i))) ;
//            }
//            else
//                sb.append((Character.toUpperCase(str.charAt(i))));
//
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: ");
//        String napis= scan.next();
//        System.out.print(Change(napis));
//
//    }
//}

// Zad 1 g)

//public class Zad1 {
//    public static String nice(String str)
//    {
//
//        StringBuffer sb = new StringBuffer();
//
//
//        for(int i=0;i<str.length();i++)
//
//            if(i%3==0)
//            {
//
//                sb.append(str.charAt(i));
//                sb.append("'") ;
//            }
//            else
//                sb.append(str.charAt(i));
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: ");
//        String napis= scan.next();
//        System.out.print(nice(napis));
//
//
//    }
//}

// Zad 1 h)

//public class Zad1 {
//    public static String nice(String str,char sep,int poz)
//    {
//
//        StringBuffer sb = new StringBuffer();
//
//
//        for(int i=0;i<str.length();i++)
//
//            if(i%poz==0)
//            {
//
//                sb.append(str.charAt(i));
//                sb.append(sep) ;
//            }
//            else
//                sb.append(str.charAt(i));
//        return sb.toString();
//    }
//
//    public static void main(String[] args)
//    {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj napis: ");
//        String napis= scan.next();
//        char sep='/';
//        int poz=5;
//        System.out.print(nice(napis,sep,poz));
//
//
//    }
//}

// Zad 4

//public class Zad1 {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj n: \n");
//        String n=scan.next();
//        int x=Integer.parseInt(n);
//        BigInteger y=new BigInteger("1");
//        BigInteger w=new BigInteger("0");
//        BigInteger d=new BigInteger("2");
//        for(int i=1;i<x*x;i++)
//        {
//            y=y.multiply(d);
//            w=w.add(y);
//
//
//        }
//
//        System.out.print(w);
//
//
//
//    }
//}


