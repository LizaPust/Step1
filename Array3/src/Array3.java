import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x:");
        System.out.println("Значение y:");
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();
        if (x <= 2 && x >= (-2) && y >= 0 && y <= 4) {
            System.out.println("true");
        } else {
            if (x >= (-4) && x <= 4 && y <= 0 && y >= (-3)) {
                System.out.println("true");
            } else {
                System.out.println("false");

            }
        }
    }
}
