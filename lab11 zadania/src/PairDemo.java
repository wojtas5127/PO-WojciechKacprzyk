import pl.imiajd.kacprzyk.Pair;


public class PairDemo {

    public static  void main(String[] args)
    {
        Pair para=new Pair(5,6);
        System.out.print(para.getFirst());
        System.out.print(para.getSecond());

        para.Swap();
        System.out.print(para.getFirst());
        System.out.print(para.getSecond());
    }

}
