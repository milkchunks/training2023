package ontopic.week3.HW5.returningMemberHW;

class Bird implements Animal {
    Bird() {
    }
    void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public void eat() {
        System.out.println("bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("bird is sleeping");
    }
}
