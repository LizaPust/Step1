import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        System.out.println("Введите углы в градусах");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение a:");
        System.out.println("Значение b:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        in.close();
        if (a+b<180) {
            System.out.println("Треугольник существует");
            if ((b+a==90) | (a==90) | (b==90)) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        } else {
                System.out.println("Треугольник не существует");
            }

        }
        }