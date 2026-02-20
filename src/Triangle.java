public class Triangle extends Shape{
    private double ba,h;

    public Triangle(double a, double b){
        this.ba = a;
        this.h = b;
    }


    public double area() {
        return ((this.ba*this.h)/2);
    }
}