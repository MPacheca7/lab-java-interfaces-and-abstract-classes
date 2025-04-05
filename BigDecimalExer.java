import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExer {
    public static void main(String[] args) {
        // Exercise 1
        BigDecimal numRedon  = new BigDecimal("17");
        BigDecimal numRedon2 = new BigDecimal("3");

        BigDecimal resultCentesima = numRedon.divide(numRedon2, 2, RoundingMode.CEILING);
        System.out.println(resultCentesima);

        // Exercise 2
        BigDecimal numRedon3 = new BigDecimal("27");
        BigDecimal numRedon4 = new BigDecimal("4");

        BigDecimal resultInvert = numRedon3.divide(numRedon4, 2, RoundingMode.CEILING);
        BigDecimal resultNegative = resultInvert.negate();

        System.out.println(resultInvert);
        System.out.println(resultNegative);

    }
}
