
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BBS {

    private long m;
    private List<Byte> key = new ArrayList<>();
    private long seed;
    private long x0;
    private long x;
    private long p, q;

    public long getM() {
        return m;
    }
    public void setPandQandM(long p, long q){
this.p=p;
this.q=q;
m = p * q;

    }

    public void setM(int l) {
        List<Integer> pierwsze = Prime.primeNumbersBruteForce(l);
         p = 0;
         q = 0;
//czy Bluma
        int i = pierwsze.size() - 1;
        for (; i >= 0; --i)
            if (pierwsze.get(i) % 4 == 3) {
                p = pierwsze.get(i);
                break;
            }

        for (i = i - 1; i >= 0; --i)
            if (pierwsze.get(i) % 4 == 3) {
                q = pierwsze.get(i);
                break;
            }


        this.m = p * q;
    }



    public long getSeed() {
        return seed;
    }



    public void setSeed(long s) {

        try {
            if (NWD.nwd(s, getM()) != 1)
            throw new RuntimeException("NWD wieksze niz 1 czyli "+NWD.nwd(s, getM()));
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            while( NWD.nwd(s, getM()) != 1) {
                Scanner sc = new Scanner(System.in);
                s = sc.nextInt();
            }

        }
//x0
        x=(s*s)%getM();
        x0=(s*s)%getM();
        this.seed = s;

    }





   public long nextX(){


        x=  ((x*x)%m);
      // System.out.println(x);
        return x;
   }

   public byte getByteIteration(){

        byte temp=0;
        for(int i=0;i<8;++i)
        {
            System.out.println(x+" "+(x & 1));
            temp=(byte)  (  ((x & 1) << i) | temp  );

            nextX();

        }

       System.out.println();
        return temp;
   }

   public void setKey(long amount){
        //20000 to amount 2500
        for(int i=0;i<amount;++i)
            key.add(getByteIteration());



   }

    public List<Byte> getKey() {
        return key;
    }


    public long anyX(int i){
       BigDecimal decimalX0=new BigDecimal(x0);
     return   decimalX0.pow((int) (Math.pow(2,i) %((p-1)*(q-1)))).remainder(new BigDecimal(m)).longValue();

       // return  (int)     (Math.pow( x0, Math.pow(2,i) %((p-1)*(q-1)) ) % m);
    }

    public long getX0() {
        return x0;
    }

    public void setX0(long x0) {
        this.x0 = x0;
    }

public void print(){

        for(int i=0;i<key.size();++i)
            System.out.println(key.get(i));

    }
}
