package MyPackage;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Initial Point: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("Point after moveUp and moveRight: " + point);

        MovableCircle circle = new MovableCircle(5, 6, 7, 8, 9);
        System.out.println("Initial Circle: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Circle after moveDown and moveLeft: " + circle);
        MovableRectangle rectangle = new MovableRectangle(1, 2, 5, 6, 2, 3);
        System.out.println("Initial Rectangle: " + rectangle);
        System.out.println("Has same speed: " + rectangle.hasSameSpeed());
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println("Rectangle after moveDown and moveRight: " + rectangle);
    }

}