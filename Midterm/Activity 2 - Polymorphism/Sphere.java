// SPHERE inheriting CIRCLE and ThreeD
class Sphere extends Circle implements ThreeD{

    // DEFAULT CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR
    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super(radius);
    }

    //GETTERS & SETTERS
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public double getRadius() {
        return super.radius * super.radius;
    }
    
    @Override
    public double getArea() {
        return getRadius() * 4 * Math.PI;
    }

    @Override
    public double getVolume() {
        return getRadius() * Math.PI * (4.0/3.0) * super.radius;
    }

    // DISPLAY
    @Override
    public String toString(){
        String volume = String.format("%.2f", getVolume());
        return "Sphere Volume: " + volume;
    }

    // COMPARES OBJECT ATTRIBUTES
    public boolean equals(Sphere s) {
        if (s == null) {
            return false;
        }
        return this.getRadius() == s.getRadius();
    }
}