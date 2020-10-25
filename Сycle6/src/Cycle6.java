import java.io.IOException;
import java.util.Scanner;
public class Cycle6 {
    public static void main(String[] args) throws IOException {
        System.out.println("Символ (избегайте русский) с:");
        int x = System.in.read();
        char c = (char) x;
        System.out.println("Символ С= " + c);
        System.out.println("Код символа " + x);
        Scanner in = new Scanner(System.in);
        System.out.println("Значение n:");
        int n = in.nextInt();
        if (n <= 400 && n >= 0) {
            System.out.println(" Значение N=" + n);
            System.out.println(" Символ " + (char) n);
        }
    }
}



