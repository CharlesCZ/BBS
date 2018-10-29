import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BBS bbs=new BBS();
        bbs.setM(12);
       // bbs.setPandQandM(20359,43063);
       // bbs.setSeed(1993);
bbs.setSeed(53);
bbs.setKey(2500);
bbs.print();


        System.out.println(Test.pojedynczy(bbs.getKey()));
        System.out.println(Test.serii(bbs.getKey()));
        System.out.println(Test.pojedynczy(bbs.getKey()));

    }
}
