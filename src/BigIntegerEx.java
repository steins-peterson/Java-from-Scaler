import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("120"); // BigInteger is used when we have to deal with numbers that are beyond
        // the range of long variable.
        BigInteger b = new BigInteger("60");

        int exponent =  b.intValue();

        BigInteger c = a.pow(exponent); // pow method doesn't take BigInteger as a parameter it takes only int value.
        System.out.println(c);
    }
}
