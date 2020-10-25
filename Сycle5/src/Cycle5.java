import java.util.Scanner;
public class Cycle5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Значение e:");
        System.out.println("Значение n:");
        double e = in.nextDouble();
        double Sum = 0;
        int x = in.nextInt();
        int n;
        for (n = 0; n <= x; n++) {
            double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            System.out.println(" Значение e=" + e);
            System.out.println(" Значение a=" + a);
            if (a >= e) {
                Sum = Sum + a;
                System.out.print(" Значение Sum =" + Sum);

            }

        }

    }
}