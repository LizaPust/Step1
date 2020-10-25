import java.util.Scanner;
public class Line {
    public static void main(String[] args) {
        System.out.println("Введите числа");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение x1, x2, x3:");
        System.out.println("Значение y1, y2, y3:");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        int y3 = in.nextInt();
        in.close();
        if (((x2 - x1) * (y3 - y1)) - ((x3 - x1) * (y2 - y1)) == 0){
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
    }
}
