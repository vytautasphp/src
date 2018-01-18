package rusiavimas;


public class Main {
    public static void main(String[] args) {


        Mokinys[] mokiniai = new Mokinys[]{

                new Mokinys("Ieva", "Ievaitė", 8,new int[]{5,8,7}),
                new Mokinys("Jonas", "Jonaitis", 9,new int[]{5,5,7}),
                new Mokinys("Petras", "Petraitis", 10,new int[]{10,8,7}),
                new Mokinys("Juozas", "Juozaitis", 6,new int[]{5,8,7}),
                new Mokinys("Antanas", "Antanaitis", 9,new int[]{9,8,7}),
                new Mokinys("Antanas", "Antanaitis", 7,new int[]{10,9,10})};

        //for (Mokinys m : mokiniai) {
        //    System.out.println(m.vardas + ' ' + m.pavarde + ' ' + m.klase);
       // }
        // System.out.println(mokiniai[0].klase);

        Mokinys[] x = new Mokinys[1];
        int ilgis = mokiniai.length;

        for (int m = 0; m < ilgis; m++) {
            for (int i = 0, n = 1; n < mokiniai.length; i++, n++) {
                if (mokiniai[i].getKlase() > mokiniai[n].getKlase()) {
                    x[0] = mokiniai[i];
                    mokiniai[i] = mokiniai[n];
                    mokiniai[n] = x[0];
                }
            }
            ilgis = mokiniai.length - 1 ;
        }

        for (Mokinys m : mokiniai) {
            System.out.println(m.getVardas() + ' ' + m.getPavarde() + ' ' + m.getKlase()+ ' ' + "Vidurkis: " + m.getVidurkis());
        }

    }
}