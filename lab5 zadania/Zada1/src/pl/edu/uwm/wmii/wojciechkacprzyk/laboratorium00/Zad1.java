package pl.edu.uwm.wmii.wojciechkacprzyk.laboratorium00;
import java.util.ArrayList;

public class Zad1 {

    public static ArrayList<Integer> append(ArrayList<Integer> y, ArrayList<Integer> z)
    {

        int x=y.size();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<y.size();i++)
        {
            list.add(i,y.get(i));
        }
        for(int i=0;i<z.size();i++)
        {
            list.add(x+i,z.get(i));

        }


        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> lista=new ArrayList<Integer>(4);
        lista.add(0,5);
        lista.add(1,6);
        lista.add(2,8);
        lista.add(3,7);
        ArrayList<Integer> lista2=new ArrayList<Integer>(4);
        lista2.add(0,9);
        lista2.add(1,10);
        lista2.add(2,11);
        System.out.print(append(lista,lista2));

    }
}
