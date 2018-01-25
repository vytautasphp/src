package Uzdavinys08;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


                Figura apskritimas = new Apskritimas();
                apskritimas.setSizeFromArea(100);
                System.out.println("Apskritimo plotas: " + apskritimas.getArea()
                +"  perimetras: "+ apskritimas.getPerimeter()+" spindulys: "+apskritimas.getKrastine());
                apskritimas.setSizeFromPerimeter(100);
                System.out.println("Perimetras: "+ apskritimas.getPerimeter() + " Apskritimo plotas: " + apskritimas.getArea()
                +" spindulys: "+apskritimas.getKrastine());



                Figura kvadratas = new Kvadratas();
                kvadratas.setSizeFromArea(100);
                System.out.println("Kvadrato plotas: " + kvadratas.getArea()
                +"  perimetras: "+ kvadratas.getPerimeter()+" krastine: "+kvadratas.getKrastine());
                kvadratas.setSizeFromPerimeter(100);
                System.out.println("Perimetras: " + kvadratas.getPerimeter() + " Kvadrato plotas: " + kvadratas.getArea()
                + "  perimetras: "+ kvadratas.getPerimeter()+" krastine: "+kvadratas.getKrastine());



                Figura trikampis = new Trikampis();
                trikampis.setSizeFromArea(100);
                System.out.println("Trikampio plotas: " + trikampis.getArea()
                + "  perimetras: "+ trikampis.getPerimeter()+" krastine: "+trikampis.getKrastine());
                trikampis.setSizeFromPerimeter(100);
                System.out.println("Perimetras: " + trikampis.getPerimeter() + " Trikampio plotas: " + trikampis.getArea()
                + "  perimetras: "+ trikampis.getPerimeter()+" krastine: " + trikampis.getKrastine());


            }
        }