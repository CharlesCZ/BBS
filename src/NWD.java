public class NWD {

    public static long nwd(long a,long b){

        long naj=1;
        if(a>b)
            for(int i=2;i<a;++i)
            {
                if(a%i==0 && b%i==0)
                    naj=i;
            }
          else
            for(int i=2;i<b;++i)
            {
           if(a%i==0 && b%i==0)
            naj=i;
            }

       // System.out.println(naj);
        return naj;
    }
}
