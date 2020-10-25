import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        System.out.println("Введите данные");
        Scanner in = new Scanner(System.in);
        System.out.print("Значение x, не превышающее 86399:");
        int x = in.nextInt();
        int y = x/3600;
        int z = (x - y*3600)/60;
        int w = (x - y*3600)-(z*60);
        in.close();
        if (y<10){
            System.out.print("0"+y+"ч ");
        }
        else {
            System.out.print(y+"ч ");
        }
        if (z<10){
            System.out.print("0"+z+"мин ");
        }
        else {
            System.out.print(z+"мин ");
        }
        if (z<10){
            System.out.print("0"+w+"с");
        }
        else {
            System.out.print(w+"с");
        }
    }
}
