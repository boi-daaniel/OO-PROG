//CYLINDER inheriting CIRCLE and ThreeD
class Cylinder extends Circle implements ThreeD{
    private double height;

    // DEFAULT CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR
    public Cylinder() {
        this.height = 0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    
    //GETTERS & SETTERS
    public void setRadius(double radius){
        super.setRadius(radius);
    }

    public double getRadius(){
        return super.radius * super.radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){
        return super.radius * height * 2 * Math.PI;
    }

    @Override
    public double getVolume() {
        return getRadius() * height * Math.PI;
    }

    // DISPLAY
    @Override
    public String toString() {
        String Area = String.format("%.2f", getArea());
        return "Cylinder Surface Area: " + Area;
    }

    // COMPARES OBJECT ATTRIBUTES
    public boolean equals(Cylinder c){
        if (c == null) {
            return false;
        }
        boolean R = super.radius == c.getRadius();
        boolean H = height == c.getHeight();

        return R && H;
    }
}