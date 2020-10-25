import java.util.Scanner;
public class FunctionFx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x:");
        double x = in.nextDouble();
        double Res;
        in.close();
        if (x<=3) {
            Res = x * x - 3 * x + 9;
            System.out.println("Функция F(x)=" + Res);
        }
        if (x>3) {
            Res = 1 / (x * x * x + 6);
            System.out.println("Функция F(x)=" + Res);
        }
    }
}
