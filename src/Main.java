import java.util.Arrays;
import java.util.Comparator;

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

private static double sum(Shape[] v) {
    double sum=0;
    for (Shape shape : v) {
        sum += shape.area();
    }
    return sum;
}

public static void sort(Shape[] v) {
    Arrays.sort(v, Comparator.comparingDouble(Shape::area));
}

private static void print(Shape[] v) {
    for (Shape shape : v) {
        System.out.println(shape.area());
    }
}
