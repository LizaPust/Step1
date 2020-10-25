import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x в формате nnn,ddd:");
        double x = in.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        in.close();
        System.out.println(y);
    }
}