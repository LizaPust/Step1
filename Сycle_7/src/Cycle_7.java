import java.util.Scanner;
public class Cycle_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Значение m:");
        System.out.println("Значение n:");
        int m = in.nextInt();
        int n = in.nextInt();
        int x;
        if (m >= 1) {
            for (; m <= n; m++) {
                System.out.println("Число равно " + m);
                for (x = 1; x <= n; x++) {
                    int y = m%x;
                    if (y==0 & x != 1 & x != m) {
                        System.out.println("Делитель "+ x);
                    }
                    }
                }
            }
        }
    }
