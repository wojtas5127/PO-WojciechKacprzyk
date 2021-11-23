package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> x, ArrayList<Integer> y) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.addAll(x);
        list.addAll(y);

        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(0,5);
        lista.add(1,45);
        lista.add(2,7);
        lista.add(3,6);
        ArrayList<Integer> lista2=new ArrayList<Integer>(4);
        lista2.add(0,9);
        lista2.add(1,89);
        lista2.add(2,14);
        System.out.print(mergeSorted(lista,lista2));
    }
}
