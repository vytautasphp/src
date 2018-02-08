package Uzduotis17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Saskaita {
   private double suma;
   private String vardas;
   private LocalDate data; //LocalDate.of(2014, 2, 14);

    public Saskaita(String vardas, double suma, LocalDate data){
        this.suma = suma;
        this.vardas = vardas;
        this.data = data;
    }

    public double getSuma() {
        return suma;
    }

    public String getVardas() {
        return vardas;
    }

    public String getQuarter() {
        return DateTimeFormatter.ofPattern("Q").format(data);
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
            return "Vardas: " + getVardas() + ", Atlyginimas: " + getSuma() + ", Data: " + getData();

        }
    }

