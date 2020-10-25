import java.util.Scanner;
public class Function2 {
    public static void main (String[] args) {
        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение а:");
        System.out.println("Значение b:");
        System.out.print("Значение c:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double y1 = 3;
        double y2 = -2;
        double z = ((b+Math.sqrt(b*b+4*a*c))/2*a) - Math.pow(a, y1)*c + Math.pow(b, y2);
        in.close();
        System.out.print("Значение z:" + z);
    }
}
