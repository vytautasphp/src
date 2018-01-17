package rusiavimas;

public class Main {
    public static void main(String[] args) {


        Mokinys[] mokiniai = new Mokinys[6];

        mokiniai[0] = new Mokinys("Ieva", "Ievaitė", 8);
        mokiniai[1] = new Mokinys("Jonas", "Jonaitis", 9);
        mokiniai[2] = new Mokinys("Petras", "Petraitis", 10);
        mokiniai[3] = new Mokinys("Juozas", "Juozaitis", 6);
        mokiniai[4] = new Mokinys("Antanas", "Antanaitis", 9);
        mokiniai[5] = new Mokinys("Antanas", "Antanaitis", 7);

        //for (Mokinys m : mokiniai) {
        //    System.out.println(m.vardas + ' ' + m.pavarde + ' ' + m.klase);
       // }
        // System.out.println(mokiniai[0].klase);

        Mokinys[] x = new Mokinys[1];
        Mokinys[] y = new Mokinys[1];
        int ilgis = mokiniai.length;

        for (int m = 0; m < ilgis; m++) {
            for (int i = 0, n = 1; n < mokiniai.length; i++, n++) {
                if (mokiniai[i].klase > mokiniai[n].klase) {
                    x[0] = mokiniai[i];
                    mokiniai[i] = mokiniai[n];
                    mokiniai[n] = x[0];
                }
            }
            ilgis = mokiniai.length - 1 ;
        }

        for (Mokinys m : mokiniai) {
            System.out.println(m.vardas + ' ' + m.pavarde + ' ' + m.klase);
        }


    }
}