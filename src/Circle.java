public class Circle extends Shape{
    private double r;

    public Circle(double rad){
        this.r=rad;
    }

    public double area(){
        return 3.14*r*r;
    }


}