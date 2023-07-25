import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

import static java.math.MathContext.UNLIMITED;

public class Berechnungen {
    public static void main(String[] args) {
        long zahl = 2;
        long exponent = 1023;
        System.out.println(zahl + "^" + exponent + " = " +
                Math.pow(zahl, exponent));

        BigInteger bigZahl = new BigInteger("2");
        BigInteger bigExponent = new BigInteger("1023");
        BigInteger bigErgebnis = bigZahl.pow( bigExponent.intValue() );
        System.out.println( bigErgebnis );
        System.out.println( bigErgebnis.toString().length() );

        BigInteger neuesErgebnis = bigZahl.pow(65536);
        System.out.println( neuesErgebnis );
        System.out.println( neuesErgebnis.toString().length() );

        // alte Version mit float
        double f = 0.1;
        double summe = 0.0;
        for (int i = 0; i <10_000_000; i++) {
            summe += f;
        }
        System.out.println(summe);

        BigDecimal bigFraction = BigDecimal.ONE.divide(BigDecimal.TEN);
        BigDecimal bigSumme = new BigDecimal("0");
        for (int i = 0; i <10_000_000; i++) {
            bigSumme = bigSumme.add(bigFraction);
        }
        System.out.println(bigSumme);

        BigDecimal einDrittel =
                BigDecimal.ONE.divide(new BigDecimal("3"), 100, BigDecimal.ROUND_DOWN);
        System.out.println(einDrittel);

        BigDecimal wurzelZwei = new BigDecimal("2").sqrt(MathContext.DECIMAL128);
        System.out.println(wurzelZwei);

        BigInteger primzahl = bigZahl.pow(77_232_917).subtract(BigInteger.ONE);
        //System.out.println(primzahl);
        System.out.println(primzahl.toString().length());
    }
}
