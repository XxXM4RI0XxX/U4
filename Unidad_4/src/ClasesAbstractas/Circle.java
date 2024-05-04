package ClasesAbstractas;

public class Circle extends Shape implements Resizable{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public void resize(double ratio) {
        radius*=ratio;
    }
}
