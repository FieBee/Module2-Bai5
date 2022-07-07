public class Circle {

    private double radius = 1;
    public static String color = "red";

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return getRadius()*2*3.1415;
    }

}
