package ontopic.week3.HW5.baseHW;

import ontopic.week3.HW5.baseHW.Shape;

public class Triangle implements Shape {
    Triangle() {
    }
    //gets area of right triangle
    @Override
    public double getArea(double height, double width) {
        return (height * width) / 2;
    }
}
