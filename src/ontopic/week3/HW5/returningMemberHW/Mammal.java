package ontopic.week3.HW5.returningMemberHW;

class Mammal implements Animal {
    Mammal() {
    }
    void birth() {
        System.out.println("mammal is giving birth");
    }

    @Override
    public void eat() {
        System.out.println("mammal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("mammal is sleeping");
    }
}
