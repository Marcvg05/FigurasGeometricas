public abstract class Shape implements Comparable<Shape>{
    public abstract double area();

    public int compareTo(Shape s){
        double d = this.area()-s.area();
        int p = (int) d;
        return p;
    }
}