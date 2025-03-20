public class Circle {

    private Point center;
    private int radius;

    public Circle(Point center, int radius){
        this.center = center;
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            this.radius = 0;
            System.out.println("Radius can't be nagatif");
        } else {
            this.radius = radius;
        }
    }
}
