package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;
import java.util.ArrayList;

public class Main {

    public static void reversed(ArrayList<Integer> x)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.addAll(x);
        for(int i=1;i<=x.size();i++)
        {
            x.set(i-1,list.get(x.size()-i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(0);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        reversed(lista);
        System.out.print(lista);

    }
}
