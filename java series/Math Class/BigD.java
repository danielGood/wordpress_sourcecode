import java.math.*;
 
public class BigD {
    public static void main(String[] args) {
 
        BigDecimal c = new BigDecimal("22.000000000000000");
        BigDecimal d = new BigDecimal("7.000000000000000");
        RoundingMode rm1;
        int rm = 5;
        String name = "HALF_UP";
        rm1 = RoundingMode.valueOf(name);
 
        System.out.println(c.divide(d, rm1));
 
        // E
 
        double e = Math.E;
 
        // PI
        double pi = Math.PI;
        // random
        double ran = Math.random(); // 0-1
        double ran2 = Math.random() * 10;// 0-10
        double ran3 = Math.random() * 10 + 10; // 10-20
        // absolute value
        Math.abs(5.0);
        // natural log
        Math.log(6.0);
        // log 10
        Math.log10(6.0);
        // the square root
        Math.sqrt(64);
        // power , the first number raised to the second number
        Math.pow(3.0, 2.0);
 
        // Euler's number e raised to the power of a double
        Math.exp(5.0);
    }
}