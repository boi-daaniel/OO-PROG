//CUBE inheriting SQUARE and ThreeD
class Cube extends Square implements ThreeD{

    // DEFAULT CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR
    public Cube() {
        super();
    }

    public Cube(double side) {
        super(side);
    }

    //GETTERS AND SETTERS
    public void setSide(double side) {
        super.setSide(side);
    }

    public double getSide() {
        return super.getSide();
    }
    
    @Override
    public double getArea() {
        return 6 * super.getArea();
    }
    
    @Override
    public double getVolume() {
        return super.getSide() * super.getArea();
    }

}