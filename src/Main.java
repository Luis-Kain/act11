public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(2);
        Square mySquare = new Square(5);
        Triangle myTriangle = new Triangle(10, 5);

        mySquare.getArea();
        mySquare.getPerimeter();
        myTriangle.getArea();
        myTriangle.getPerimeter();
        myCircle.getArea();
        mySquare.getPerimeter();
    }
}