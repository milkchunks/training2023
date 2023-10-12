package ontopic.week3.HW5.baseHW;

class Rectangle implements Shape {
    Rectangle() {
    }
    @Override
    public double getArea(double height, double width) {
        return height * width;
    }
}
