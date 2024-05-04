package ClasesAbstractas;

public class Triangle extends Shape implements Resizable{

    double witdh, height;

    public Triangle(double witdh, double height) {
        this.witdh = witdh;
        this.height = height;
    }


    @Override
    public double area() {
        return (witdh*height)/2;
    }

    @Override
    public void resize(double ratio) {
        witdh*=ratio;
        height*=ratio;
    }
}
