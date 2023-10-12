package ontopic.week3.Day2Exercise;

class Car extends Vehicle{
    String name;
    Car(String name) {
        this.name = name;
        super.speed = 0;
    }
    Car(String name, int speed) {
        this.name = name;
        super.speed = speed;
    }
    @Override
    void accelerate() {
        super.speed += 20;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }
}
