import java.util.Scanner;
public class Function1 {
    public static void main (String[] args){
        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        System.out.println("Значение а:" );
        System.out.println("Значение b:" );
        System.out.print("Значение c:" );
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double z = ((a-3)*b/2)+c;
        in.close();
        System.out.print("Значение z:"+ z);
    }
}
