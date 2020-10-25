public class Cycle2 {
    public static void main(String[] args) {
        double x;
        int a = -4;
        int b = 4;
        double h = 0.1;
        float Res;
        for (x = a; x <= b; x += h) {
            double n = x*1000;
            int y = (int)Math.round(n);
            float z = (float) y / 1000;
            if (z <= 2) {
                Res = -z;
                System.out.println("Значение x:" + Res);
            } else {
                if (z > 2) {
                    Res = +z;
                    System.out.println("Значение x:" + Res);
                }
            }

        }
    }
}
