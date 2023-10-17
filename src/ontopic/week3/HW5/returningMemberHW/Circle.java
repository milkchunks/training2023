package ontopic.week3.HW5.returningMemberHW;

class Circle {
    double radius;
    Circle (double radius) {
        this.radius = radius;
    }
    double area() {
        return (Math.PI * Math.pow(radius, 2));
    }
    double circumference() {
        return (2 * Math.PI * radius);
    }
}
