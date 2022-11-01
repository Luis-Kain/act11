public class Circle implements Shape{
    private final float pi =3.14f;
    private float radius;
    private float diameter = radius * 2;
    private float area;
    private float perimeter;

    public Circle(float radius){
        this.radius = radius;
    }
    @Override
    public void getArea() {
        area = (float) (pi * (Math.pow(radius,2)));
        System.out.println("circle area: "+area);
    }

    @Override
    public void getPerimeter() {
        perimeter = pi * diameter;
        System.out.println("circle perimeter " + perimeter);
    }
}
