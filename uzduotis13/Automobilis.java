package uzduotis13;

public class Automobilis implements Comparable<Automobilis>{


String numeris;
String marke;
String savininkas;

    public Automobilis(String marke, String numeris, String savininkas) {
        this.marke = marke;
        this.numeris = numeris;
        this.savininkas = savininkas;
        }
    @Override
    public String toString() {
        return "Automobilis: " +
                "Marke: " + marke +
                ", Numeris: " + numeris + ' ' +
                ", Savininkas: " + savininkas + ' ';
    }
    @Override
    public int compareTo(Automobilis o) {

        Automobilis automobilis = (Automobilis) o;

        int comp = getMarke().compareTo(automobilis.getMarke());
        if (comp != 0) return comp;

        int comp1 = getNumeris().compareTo(automobilis.getNumeris());
        if (comp1 != 0) return comp1;

        return getSavininkas().compareTo(automobilis.getSavininkas());
    }

    public String getNumeris() {
        return numeris;
    }

    public String getMarke() {
        return marke;
    }

    public String getSavininkas() {
        return savininkas;
    }
}
