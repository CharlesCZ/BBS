import java.util.LinkedList;
import java.util.List;

public class Test {

    int[] seria=new int[20000];

    public static Boolean pojedynczy(List<Byte> key){
        System.out.println("pojedynczy");
        int onesAmount=0;


for(int j=0;j<key.size();++j) {
    byte temp = key.get(j);
    for (int i = 0; i < 8; ++i) {
        if (((temp >> i) & 1) > 0)
            ++onesAmount;

    }
}
        System.out.println(onesAmount);
        if(9725 < onesAmount && onesAmount < 10275)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
      //  return  onesAmount;
    }


    public static Boolean serii(List<Byte> key){
        System.out.println("serii");
        int ones=0;

        int[] seria=new int[20000];
        for(int i=0;i<seria.length;++i)
        seria[i]=0;


        for(int j=0;j<key.size();++j) {
            byte temp = key.get(j);
            for (int i = 0; i < 8; ++i) {
                if (((temp >> i) & 1) == 1)
                    ++ones;
                else{
                    ++seria[ones];
                    ones=0;
                }
            }
        }
        System.out.println("seriee");
        for(int i=0;i<16;++i)
            System.out.println("seria"+" "+i+" "+seria[i]);

        System.out.println("serii 1"+ "  "+seria[1]);
        if(  !(2315 <= seria[1] && seria[1] <= 2685)  )
            return Boolean.FALSE;
        System.out.println("serii 2"+ "  "+seria[2]);
        if(  !(1114 <= seria[2] && seria[2] <= 1386)  )
            return Boolean.FALSE;
        System.out.println("serii 3"+ "  "+seria[3]);
        if(  !(527 <= seria[3] && seria[3] <= 723)  )
            return Boolean.FALSE;
        System.out.println("serii 4"+ "  "+seria[4]);
        if(  !(240<= seria[4] && seria[4] <= 384)  )
            return Boolean.FALSE;
        System.out.println("serii 5"+ "  "+seria[5]);
        if(  !(103<= seria[5] && seria[5] <= 209)  )
            return Boolean.FALSE;

        for(int i=7;i<20000;++i)
        seria[6]+=seria[i];
        System.out.println("serii 6 i wiecej"+ "  "+seria[5]);
        if(  !(103<= seria[6] && seria[6] <= 209)  )
            return Boolean.FALSE;


//dla serii 6 i wiecej zsumowac
        if(  0< seria[26]  ) {
            System.out.println("dlugiej serii");
            return Boolean.FALSE;

        }
        return Boolean.TRUE;
    }

    public static Boolean pokerowy(List<Byte> key){
        System.out.println("pokerowy");
  int[] kubelki=new int[16];


        for(int j=0;j<key.size();++j) {
            byte temp = key.get(j);


             ++kubelki[  ((temp >> 0) & 15) ];
             ++kubelki[ ((temp >> 4) & 15) ];

        }

double X=(16/5000.0 ),sum=0;


        for(int i=0;i<16;++i)
        sum+=kubelki[i]*kubelki[i];

  X=X*sum-5000;


  if( 2.16<X && X<46.17)
        return Boolean.TRUE;
  else
      return  Boolean.FALSE;

    }

}
