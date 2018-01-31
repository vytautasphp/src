package uzduotis13;

public class Automobilis implements Comparable<Automobilis>{


    private String numeris;
    private String marke;
    private String vardas;
    private String pavarde;

    public Automobilis(String marke, String numeris, String vardas, String pavarde) {
        this.marke = marke;
        this.numeris = numeris;
        this.vardas = vardas;
        this.pavarde = pavarde;
        }
    @Override
    public String toString() {
        return "Automobilis: " +
                "Marke: " + marke +
                ", Numeris: " + numeris + ' ' +
                ", Vardas: " + vardas + ' '+
                ", Pavarde: " + pavarde + ' ';
    }
    @Override
    public int compareTo(Automobilis o) {

        Automobilis automobilis = (Automobilis) o;

        int comp = getPavarde().compareTo(automobilis.getPavarde());
        if (comp != 0) return comp;

        int comp1 = getVardas().compareTo(automobilis.getVardas());
        if (comp1 != 0) return comp1;

        return getNumeris().compareTo(automobilis.getNumeris());
    }

    public String getNumeris() {
        return numeris;
    }

    public String getMarke() {
        return marke;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }
}

