
public class Shape{
    public abstract double area();

    public void sort(Shape[] v){
        Arrays.sort(v);
    }
}

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

public class Square extends Rectangle{
    public Square(double l){
        super(l,l); //manda a la clase superior el cuadrado
    }
}

public class Circle extends Shape{
    
}
public static void main(String[] args) {
    Shape[] v = new Shape[4];

    v[0] = new Rectangle(5, 3);
    v[1] = new Circle(5);
    v[2] = new Square(5);
    v[3] = new Circle(120);

    double res = sum(v);

    System.out.println("sum: " + res);

    print(v);

    sort(v);

    print(v);
}
