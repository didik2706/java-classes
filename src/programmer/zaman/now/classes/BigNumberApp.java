package programmer.zaman.now.classes;

import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger bigIntegerA = new BigInteger("10000000000000000000000");
        BigInteger bigIntegerB = new BigInteger("10000000000000000000000");
        BigInteger result = bigIntegerA.add(bigIntegerB);

        System.out.println(result);
    }
}
