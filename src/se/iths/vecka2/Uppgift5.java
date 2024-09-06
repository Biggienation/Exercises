package vecka2;

public class Uppgift5 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(50,50);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.perimeter());
        rectangle.setHeight(-1);
    }
}
