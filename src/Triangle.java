public class Triangle extends GeometricFigures{
    private double SideA;
    private double SideB;
    private double SideC;
    public Triangle(double SideA, double SideB, double SideC) {
        this.SideA = SideA;
        this.SideB = SideB;
        this.SideC = SideC;
    }
    public double getSideA() {
        return SideA;
    }
    public void setSideA(double SideA) {
        this.SideA = SideA;
    }
    public double getSideB() {
        return SideB;
    }
    public void setSideB(double SideB) {
        this.SideB = SideB;
    }
    public double getSideC() {
        return SideC;
    }
    public void setSideC(double SideC) {
        this.SideC = SideC;
    }

    double Perimeter(){
       double a =  SideA+SideC+SideB;
        return a;
    }
    double Area(){
        double s = Perimeter() / 2;
        return Math.sqrt(s * (s - SideA) * (s - SideB) * (s - SideC));

    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5,5,5);
        System.out.println("Triangle Area: "+triangle.Area());
        System.out.println("Triangle Perimeter: "+triangle.Perimeter());
    }
}
