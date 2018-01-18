package rusiavimas;

public class Mokinys extends Zmogus {

    private int klase; // pvz 6 ar 9
    private int[] trimestras; // masyvas mokinio trimestro pažymių

    public int getKlase() {
        return klase;
    }

    private int[] getTrimestras() {
        return trimestras;
    }

    Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
        super(vardas, pavarde);
        this.klase = klase;
        this.trimestras = trimestras;

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