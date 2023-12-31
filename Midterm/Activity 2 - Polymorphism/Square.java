// SQUARE inheriting SHAPE
class Square extends Shape{
    private double side;

    // DEFAULT CONSTRUCTOR AND PARAMETERIZED CONSTRUCTOR
    public Square() {
        this.side = 0;
    }

    public Square(double side){
        this.side = side;
    }

    // GETTERS AND SETTERS
    public void setSide (double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return  side * side;
    }

    // DISPLAY
    @Override
    public String toString() {
        return "Square Side Length: " + side;
    }

    public boolean equals(Square s) {
        return s.side == side; 
    }

}
