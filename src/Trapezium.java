public class Trapezium extends GeometricFigures{
    private double sideA;
    private double sideB;
    private double high;
    public Trapezium(double sideA, double sideB, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;
    }

    double Area(){
        return 0.5 * (sideA+sideB) * high;
    }
    double Perimeter(){
        return sideA+sideB;
    }
    public static void main(String[] args) {
        GeometricFigures figure = new Trapezium(10, 15, 5);
        System.out.println("Trapezium Area: " + figure.Area());

        System.out.println("Perimeter: " + figure.Perimeter());
    }


}
