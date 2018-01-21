package Uzdavinys07_1;


public class Main {
    public static void main(String[] args) {


        Mokinys[] mokiniai = new Mokinys[]{

                new Mokinys("Ieva", "Ievaitė", 4,new int[]{5,8,7}),
                new Mokinys("Jonas", "Jonaitis", 9,new int[]{5,5,7}),
                new Mokinys("Petras", "Petraitis", 10,new int[]{10,8,7}),
                new Mokinys("Juozas", "Juozaitis", 6,new int[]{5,8,7}),
                new Mokinys("Antanas", "Antanaitis", 9,new int[]{9,8,7}),
                new Mokinys("Domantas", "Domante", 7,new int[]{10,9,10}),
                new Mokinys("Jomantas", "Jomante", 7,new int[]{9,3,7}),
                new Mokinys("Dovile", "Dovilyte", 7,new int[]{9,7,7}),
                new Mokinys("Daiva", "Daivilyte", 10,new int[]{10,8,7}),
                new Mokinys("Janina", "Janaite", 9,new int[]{9,8,4}),
                new Mokinys("Mantas", "Mantanaitis", 7,new int[]{5,8,7})
        };




        Mokinys[] x = new Mokinys[1];
        int ilgis = mokiniai.length;

        for (int m = 0; m < ilgis; m++) {
            for (int i = 0, n = 1; n < mokiniai.length; i++, n++) {
                if (mokiniai[i].getVidurkis() > mokiniai[n].getVidurkis()) {
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
        for (int i=0;i<Mokinys.getKl().length;i++) {
           if (Mokinys.getKl()[i]>0) {
               double vid = Mokinys.getPazymiai()[i] / Mokinys.getKl()[i];
               System.out.println("klasėje " + (i + 1) + ": " + Mokinys.getKl()[i] + " mokinių" + "ju pazymiu vidurkis: "+ Math.round(vid));
           }
        }



    }
}