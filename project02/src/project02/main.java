package project02;

public class main {
    public static void main(String[] args) {

        Circle circle = new Circle("Cir One", 3.0);
        Rectangle rectangle = new Rectangle("Rec One", 3.0, 4.0);
        Square square1 = new Square("Square Two", 4.0);
        Square square2 = new Square("Square Three", 4.0);

        System.out.println("Four shapes have been created:");
        System.out.printf("1. Circle [Radius()= %.2f]%n", circle.getRadius());
        System.out.printf("%s's area is %.2f, radius is %.2f%n", circle.getName(), circle.getArea(), circle.getRadius());

        System.out.printf("2. Rectangle [Width()=%.2f Height()=%.2f]%n", rectangle.getWidth(), rectangle.getHeight());
        System.out.printf("%s's area is %.2f, width is %.2f, height is %.2f%n", rectangle.getName(),
                rectangle.getArea(), rectangle.getDimension1(), rectangle.getDimension2());

        System.out.printf("3.Square [Side()=%.2f]%n", square1.side() );
        System.out.printf("%s's area is %.2f, side is %.2f%n", square1.getName(), square1.getArea(), square1.side());

        System.out.printf("4.Square [Side()=%.2f]%n", square2.side());
        System.out.printf("%s's area is %.2f%n", square2.getName(), square2.getArea());

        System.out.println("Is Rec One a TwoDimensionalShape? " + (rectangle instanceof TwoDimensionalShape));
    }
}

