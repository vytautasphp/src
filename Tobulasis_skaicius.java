public class Tobulasis_skaicius {
    public static void main(String[] args) {

        double a;
        double b = 1000;
        double c = 0;
        double d = 0;

        for (a=1; a<=b ;a++) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    c = a / i;
                    if (c < a) {
                        d = d + c;
                    }
                }

            }
            if (d == a) {
                System.out.println("tobulasis skaičius: " + d);
            }
            d=0;
        }

    }

}