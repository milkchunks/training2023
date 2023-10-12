package ontopic.week3.Day2Exercise;

class Vehicle {
    int speed;
    String name;
    //TODO make it so default constructor isn't needed and force user to put in name
    Vehicle() {
        this.speed = 0;
    }
    Vehicle(String name) {
        this.speed = 0;
        this.name = name;
    }
    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    void accelerate() {
        this.speed += 10;
    }
    void accelerate(int increment) {
        this.speed += increment;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
