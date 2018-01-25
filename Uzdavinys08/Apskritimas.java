package Uzdavinys08;

public class Apskritimas extends Figura{

    private double radius;


    public Apskritimas() {
        //this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getKrastine() {
        return radius;
    }
    @Override
    public void setSizeFromArea(double area) {
        radius = Math.sqrt(area / Math.PI);
    }
    @Override
    public void setSizeFromPerimeter(double perimeter) {
        radius = (0.5 * perimeter) / Math.PI;
    }
}