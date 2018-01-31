package uzduotis13;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Automobilis> list = new ArrayList<>();


        list.add(new Automobilis("Honda", "ASE938", "Zigmantas", "Antanaitis"));
        list.add(new Automobilis("BMW", "JKL588", "Jonas","Jonaitis"));
        list.add(new Automobilis("Opel", "CNM713", "Petras","Petraitis"));
        list.add(new Automobilis("Mercedes", "DTM558", "Ona","Onaitiene"));
        list.add(new Automobilis("Audi", "ZST567", "Janina","Janaitiene"));
        list.add(new Automobilis("ZAZ", "SDA456", "Juozas","Juoazaitis"));
        list.add(new Automobilis("ZAZ", "ABC548", "Juozas","Juoazaitis"));
        list.add(new Automobilis("ZAZ", "ABC548", "Antanas","Juoazaitis"));


            for (Automobilis automobilis : list) {
                System.out.println(automobilis);
            }


            Collections.sort(list);
            list.sort(new Comparator<Automobilis>() {
                @Override
                public int compare(Automobilis o1, Automobilis o2) {
                    return 0;
                }
            });

            System.out.println("Sulygiuota:");
            for (Automobilis automobilis : list) {
                System.out.println(automobilis);
            }


        }
    }