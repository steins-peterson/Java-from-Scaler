import java.math.BigInteger;

public class BigIntegerFactorialEx {
    public static void main(String[] args){
        int x = 6;
//        int ans = 1;
        BigInteger ans = new BigInteger("1");


        for(int i = 1; i<=x; i++){
            BigInteger temp = new BigInteger(i+"");
            ans = ans.multiply(temp); // in bigintegers the * operator doesn't work only methods work.
        }

        System.out.println(ans);
    }
}
