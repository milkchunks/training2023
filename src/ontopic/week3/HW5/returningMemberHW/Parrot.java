package ontopic.week3.HW5.returningMemberHW;

class Parrot extends Bird {
    Parrot() {
    }

    @Override
    void fly() {
        super.fly();
        System.out.println("parrot is flying");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("parrot is eating");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("parrot is sleeping");
    }
}
