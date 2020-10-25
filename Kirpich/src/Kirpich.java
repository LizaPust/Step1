import java.util.Scanner;
public class Kirpich {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x, y, z:");
        System.out.println("Значение A, B:");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        in.close();
        if (A >= x & B >= y)
            System.out.println("Кирпич проходит");
        else if (A >= y & B >= x)
            System.out.println("Кирпич проходит");
        else if (A >= x & B >= z)
            System.out.println("Кирпич проходит");
        else if (A >= z & B >= x)
            System.out.println("Кирпич проходит");
        else if (A >= y & B >= z)
            System.out.println("Кирпич проходит");
        else if (A >= z & B >= y)
            System.out.println("Кирпич проходит");
        else
            System.out.println("Кирпич не проходит");
    }
}
