public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(3,4);
        System.out.println("Height: "+t.getHeight());
        System.out.println("Base: "+t.getBase());
        System.out.println("Area: "+t.calculateArea());
        System.out.println("Circumference: "+t.calculateCircumference());
        Circle c = new Circle(3);
        System.out.println("-----------");
        System.out.println("Radius: "+c.getRadius());
        System.out.println("Area: "+c.calculateArea());
        System.out.println("Circumference: "+c.calculateCircumference());
        Rectangle r = new Rectangle(3,4);
        System.out.println("-----------");
        System.out.println("Height: "+r.getHeight());
        System.out.println("Width: "+r.getWidth());
        System.out.println("Area: "+r.calculateArea());
        System.out.println("Circumference: "+r.calculateCircumference());
    }
}
