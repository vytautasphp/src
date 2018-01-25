package Uzdavinys08;

public class Kvadratas extends Figura{

    private double krastine;

    public Kvadratas() {
        //this.krastine = krastine;
    }

    @Override
    public double getArea() {
        return krastine * krastine;
    }
    @Override
    public double getKrastine() {
        return krastine;
    }
    @Override
    public double getPerimeter() {
        return (krastine + krastine) * 2;
    }
    @Override
    public void setSizeFromArea(double area) {
        krastine = Math.sqrt(area);
    }
    @Override
    public void setSizeFromPerimeter(double perimeter) {
        krastine = perimeter / 4;
    }
}

