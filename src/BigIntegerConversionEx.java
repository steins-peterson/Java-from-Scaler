import java.math.BigInteger;

public class BigIntegerConversionEx {
    public static void main(String[] args) {
        int x = 7;
        BigInteger a = new BigInteger(x+""); // from int to BigInteger
        System.out.println(a);

        BigInteger y = new BigInteger("3789");
        int b = y.intValue();
        System.out.println(b);
    }
}
