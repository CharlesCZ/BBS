import java.util.List;

public class Test {

    public static Boolean pojedynczy(List<Byte> key){
        int onesAmount=0;


for(int j=0;j<key.size();++j) {
    byte temp = key.get(j);
    for (int i = 0; i < 8; ++i) {
        if (((temp >> i) & 1) > 0)
            ++onesAmount;

    }
}
        if(9725 < onesAmount && onesAmount < 10275)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
      //  return  onesAmount;
    }



}
