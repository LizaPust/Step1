import java.math.BigInteger;
import java.util.Scanner;
public class Cycle4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x:");
        double x = in.nextDouble();
        long Sum = 1;
        int z;
        for (z = 1; z <= 200; z++) {
            double sum = x++;
            double y = Math.pow(sum, 2);
            System.out.print(" Значение," + y);
            Sum *=y;
            BigInteger g1 = BigInteger.valueOf(Sum*=y);
            System.out.println(g1.toString());
        }
    }

}
