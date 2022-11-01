public class Square implements Shape{
    private float side;
    private float area;
    private float perimeter;

    public Square(float side){
        this.side = side;
    }
    @Override
    public void getArea() {
        area = side * side;
        System.out.println("square area: " + area);
    }

    @Override
    public void getPerimeter() {
        perimeter= side * 4;
        System.out.println("square perimeter: " + perimeter);
    }
}
