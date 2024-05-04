package ClasesAbstractas;

public class Main {
    /*
      1. Conversion de tipos
      2. Clases abstractas
          - Clases Anonimas
      3. Interfaces
          - "Implementos"
          - Clases anonimas
          - Expresiones Lambda
          - Referencias a metodos
      4. Tipos genericos
       */
    public static void main(String[] args) {

        Shape fig1 = new Square(10);
        Square nFig1 = (Square) fig1;
        Circle fig2 = new Circle(10);
        Triangle fig3 = new Triangle(5,10);

        System.out.printf("Aréa cuadrado: %.2f\nÁrea circulo: %.2f\nÁrea triangulo: %.2f\n",nFig1.area(),fig2.area(),fig3.area());
        System.out.println("-------------Nuevas áreas--------------------");
        nFig1.resize(10);
        fig2.resize(10);
        fig3.resize(10);
        System.out.printf("Aréa cuadrado: %.2f\nÁrea circulo: %.2f\nÁrea triangulo: %.2f",nFig1.area(),fig2.area(),fig3.area());




    }
}

abstract class Shape {
    abstract public double area();
}