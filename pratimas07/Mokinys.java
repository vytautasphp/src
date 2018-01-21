package pratimas07;

public class Mokinys extends Zmogus {

    private static int[] kl = new int[12];
    private int klase; // pvz 6 ar 9
    private int[] trimestras; // masyvas mokinio trimestro pažymių



    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        super(vardas, pavarde);
        this.klase = klase;
        this.trimestras = trimestras;
        int kint = klase;
        kint -= 1;
        kl[kint]++;
    }

    public static int[] getKl() {
        return kl;
    }

    public int getKlase() {
        return klase;
    }
    private int[] getTrimestras() {
        return trimestras;
    }
    //vidurkio skaiciavimas//
    public double getVidurkis() {
        double suma = 0;
        double vidurkis;
        double vidurkisr;

        for (int i = 0; i < getTrimestras().length; i++) {
            suma += getTrimestras()[i];
        }
        vidurkisr = suma / getTrimestras().length;
        vidurkis = Math.round(vidurkisr);
        return vidurkis;
    }
}