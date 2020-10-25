import java.util.Scanner;
public class Function3 {
    public static void main(String[] args) {
        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение a:");
        System.out.println("Значение b:");
        final double Pi = 3.1415926536;
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = (Pi*a);
        double y = (Pi*b);
        double z = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        in.close();
        System.out.print("Значение z:" + z);
    }
}
