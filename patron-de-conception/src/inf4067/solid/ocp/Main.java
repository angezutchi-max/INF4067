package inf4067.solid.ocp;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(4, 3);
        System.out.println("Area = '" + shape.calculateArea() + "'");

        // Via AreaCalculator2 : aucune modification nécessaire pour un nouveau Shape
        AreaCalculator2 calculator = new AreaCalculator2();
        System.out.println("Rectangle = " + calculator.calculateArea(new Rectangle(4, 3)));
        System.out.println("Cercle    = " + calculator.calculateArea(new Circle(2)));
    }
}
