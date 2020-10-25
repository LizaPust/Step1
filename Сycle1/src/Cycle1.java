import java.util.Scanner;
public class Cycle1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x:");
        int x = in.nextInt();
        int y;
        int Res = 0;
        in.close();
        for (y = 1; y <= x; y++) {
            Res = Res + y;
        }
        System.out.println("Результат " + Res);
    }
}
