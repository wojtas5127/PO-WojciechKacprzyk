package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Integer> reversed(ArrayList<Integer> x)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=x.size();i>0;i--)
        {

            list.add(x.get(i-1));

        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(0,6);
        lista.add(1,7);
        lista.add(2,8);
        lista.add(3,9);

        System.out.print(reversed(lista));
    }
}
