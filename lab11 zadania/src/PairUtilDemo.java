import pl.imiajd.kacprzyk.Pair;
import pl.imiajd.kacprzyk.PairUtil;


public class PairUtilDemo {

    public static void main(String[] args)
    {
        Pair para1=new Pair(5,6);

        System.out.print(para1.getFirst());
        System.out.print(para1.getSecond());
        para1=PairUtil.swap(para1);
        System.out.print(para1.getFirst());
        System.out.print(para1.getSecond());
    }
}
