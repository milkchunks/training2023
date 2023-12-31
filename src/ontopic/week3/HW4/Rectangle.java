package ontopic.week3.HW4;

public class Rectangle {
    public double width;
    public double height;
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return getWidth() * getHeight();
    }
    public double getPerimeter() {
        return getWidth() * 2 + getHeight() * 2;
    }
}
