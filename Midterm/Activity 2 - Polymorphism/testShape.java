public class testShape {
    public static void main(String[] args) {
        // SQUARE
        Square square = new Square(4);
        System.out.println("Square Area: " + square.getArea()); 
        System.out.println(square.toString()+"\n");
        
        // CUBE
        Cube cube = new Cube(5);
        System.out.println("Cube Area: " + cube.getArea());
        System.out.println("Cube Volume: " + cube.getVolume()+"\n");

        // CIRCLE
        Circle circle = new Circle(3);
        System.out.printf("Circle Area: %.2f\n", circle.getArea());
        System.out.println(circle.toString()+"\n");


        // SPHERE
        Sphere sphere = new Sphere(5);
        System.out.printf("Sphere Area: %.2f\n", sphere.getArea());
        System.out.println(sphere.toString()+"\n");

        // CYLINDER
        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println(cylinder.toString());
        System.out.printf("Cylinder Volume: %.2f", cylinder.getVolume());

    }
}