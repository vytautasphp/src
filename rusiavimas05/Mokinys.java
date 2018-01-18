package rusiavimas05;

public class Mokinys extends Zmogus {

    int klase; // pvz 6 ar 9
    int[] trimestras; // masyvas mokinio trimestro pažymių

    Mokinys(String vardas, String pavarde, int klase) {
        super(vardas, pavarde);
        this.klase = klase;
    }
    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        this(vardas, pavarde, klase);
        this.trimestras = trimestras;
    }
    public static int rus(int mok,int mok2) {
        if (mok>mok2){
            return mok;
        }
        else {
            return mok2;
        }

    }

}