// CIRCLE inheriting SHAPE
class Circle extends Shape{
    protected double radius;

    // DEFAULT CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR
    public Circle(){
        this.radius = 0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    //GETTERS AND SETTERS
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius * Math.PI;
    }

    @Override
    public double getArea() {
        return getRadius() * radius;
    }

    // DISPLAY
    @Override
    public String toString() {
        return "Circle Radius: " + radius;
    }

    // COMPARES OBJECT ATTRIBUTES
    public boolean equals(Circle c){
        return c.radius == radius;
    }    
    
}