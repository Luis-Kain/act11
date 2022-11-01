public class Triangle implements Shape{
    private float diagonal;
    private float side;
    private float perimeter;
    private float area;

    public Triangle(float diagonal, float side) {
        this.diagonal = diagonal;
        this.side = side;
    }

    @Override
    public void getArea() {
        area = (side * side) / 2;
        System.out.println("triangle area: " + area);
    }

    @Override
    public void getPerimeter() {
        perimeter= (float) ((4.0f* diagonal)/Math.sqrt(2));
        System.out.println("triangle perimeter: " + perimeter);
    }
}
