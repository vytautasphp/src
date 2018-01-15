public class vidurkiai {

    public static void main(String[] args) {
        int[]a = {5,6,10,15,8,8};
        int[]b = {8,5,3};
        double suma = 0;
        double sumab = 0;
        double vidurkisa;
        double vidurkisb;

        for (double kint : a) {
            suma += kint;
        }
        for (double kint : b) {
            sumab += kint;
        }
        vidurkisa = suma/a.length;
        vidurkisb = sumab/b.length;
        System.out.println(vidurkisa+" "+vidurkisb);

    }

}
