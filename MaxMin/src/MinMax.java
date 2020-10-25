import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение a:");
        System.out.println("Значение b:");
        System.out.println("Значение c:");
        System.out.println("Значение d:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        in.close();
        if (a < b & c < d & a > c)
            System.out.println("Max" + a);
         else if (a < b & c < d & a < c)
            System.out.println("Max" + c);
        else if (b < a & c < d & b > c)
            System.out.println("Max" + b);
        else if (b < a & c < d & b < c)
            System.out.println("Max" + c);
        else if (a < b & d < c & a > d)
            System.out.println("Max" + a);
        else if (a < b & d < c & a < d)
            System.out.println("Max" + d);
        else if (b < a & d < c & b > d)
            System.out.println("Max" + b);
        else if (b < a & d < c & b < d)
            System.out.println("Max" + d);

    }
}
