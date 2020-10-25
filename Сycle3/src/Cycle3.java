import java.util.Scanner;
public class Cycle3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x:");
        double x = in.nextDouble();
        int z;
        double Res;
        for (z = 1; z <= 100; z++) {
            double sum = x++;
            double y = Math.pow(sum,2);
                Res = 0 + y;
            System.out.println("Значение " + Res);
                }
            }

        }