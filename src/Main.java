import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BBS bbs=new BBS();
        bbs.setM(12);
bbs.setSeed(53);
bbs.setKey(2500);


        List<Byte> lista=new LinkedList<>();
        lista.add((byte)7);

        System.out.println(Test.pojedynczy(lista));
    }
}
