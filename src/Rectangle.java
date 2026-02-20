public class Rectangle extends Shape{
    private double L1, L2;

    public Rectangle(double a, double b){
        this.L1=a;
        this.L2=b;
    }

    public double area(){
        return this.L1*this.L2;
    }
}