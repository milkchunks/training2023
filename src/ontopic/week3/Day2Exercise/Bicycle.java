package ontopic.week3.Day2Exercise;

class Bicycle extends Vehicle{
    String name;
    Bicycle(String name) {
        super.speed = 0;
        this.name = name;
    }
    Bicycle(String name, int speed) {
        super.speed = speed;
        this.name = name;
    }
    @Override
    void accelerate() {
        super.speed += 5;
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
