package ss07_abstract_class_and_interface.thuc_hanh.implement_comparable_interface_for_geometry_assignment_classes;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;
    public Rectangle () {
    }
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle (double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth () {
        return this.width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getHeight () {
        return this.height;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    public double getArea () {
        return this.width * this.height;
    }
    public double getPerimeter () {
        return 2 * (this.width + this.height);
    }
    @Override
    public String toString () {
        return "A Rectangle with width = " + getWidth() + " and height = " + getHeight() + ", which is a subclass of " + super.toString();
    }
}
