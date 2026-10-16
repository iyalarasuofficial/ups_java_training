package Day8;



abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class Area {
    public static void main(String[] args) {

        Circle c = new Circle(7);
        Rectangle r = new Rectangle(5, 4);
        Triangle t = new Triangle(6, 8);

        System.out.println("Circle area: " +
                Math.round(c.area() * 100.0) / 100.0);

        System.out.println("Rectangle area: " + r.area());

        System.out.println("Triangle area: " + t.area());
    }
}
