package Uzdavinys08;

public class Trikampis extends Figura{

    private double krastine;



    public Trikampis() {
        //this.krastine = krastine;
    }

    @Override
    public double getArea() {
        return ((krastine * krastine) * (Math.sqrt(3))) / 4;
    }
    @Override
    public double getKrastine() {
        return krastine;
    }
    @Override
    public double getPerimeter() {
        return krastine * 3;
    }
    @Override
    public void setSizeFromArea(double area) {
      krastine = 1.51968 * Math.sqrt(area);
    }
    @Override
    public void setSizeFromPerimeter(double perimeter) {
        krastine = perimeter / 3;
    }
}

