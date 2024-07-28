public class Rectangle extends GeometricFigures {
    private double siDeA;
    private double siDeB;
public Rectangle(double siDeA, double siDeB) {
    this.siDeA = siDeA;
    this.siDeB = siDeB;
}
double Area(){
    return siDeA * siDeB;
}
double Perimeter(){
    return 2 * (siDeA + siDeB);
}
public static void main(String[] args) {
    GeometricFigures fr = new Rectangle(5, 5);
    System.out.println("Rectangle Area: " + fr.Area());
    System.out.println("Rectangle Perimeter: " + fr.Perimeter());
}
}
