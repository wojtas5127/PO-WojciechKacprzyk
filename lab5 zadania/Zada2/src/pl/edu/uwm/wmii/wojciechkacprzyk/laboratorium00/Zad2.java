package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;
import java.util.ArrayList;

public class Zad2 {


    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        int x=a.size();
        if(b.size()>x)
        {
            x=b.size();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < x; i++) {
            if (a.size()-1 >= i) {
                list.add(a.get(i));

            }
            if(b.size()-1>=i)
            {
                list.add(b.get(i));
            }

        }

        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>(4);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(69);
        lista.add(420);
        lista.add(1337);
        ArrayList<Integer> lista2 = new ArrayList<Integer>(4);
        lista2.add(7);
        lista2.add(9);
        lista2.add(0);
        lista2.add(0);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);
        lista2.add(2);

        System.out.print(merge(lista, lista2));
    }
}
