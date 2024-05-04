package ClasesAbstractas;

public class Square extends Shape implements Resizable{

    double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return width*width;
    }

    @Override
    public void resize(double ratio) {
        width*=ratio;
    }
}
