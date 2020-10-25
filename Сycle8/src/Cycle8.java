import java.util.Scanner;
public class Cycle8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число a:");
        System.out.println("Число b:");
        int a = in.nextInt();
        int b = in.nextInt();
        int x;
        int y;
        System.out.println("Число a:" + a);
        System.out.println("Число b:" + b);
            while (a > 0) {
                    x = a % 10;
                    a = a / 10;
                System.out.print(x +" ");
            }
            while (b > 0) {
                y = b % 10;
                b = b / 10;
                System.out.print(y + " ");
            }
    }
}
