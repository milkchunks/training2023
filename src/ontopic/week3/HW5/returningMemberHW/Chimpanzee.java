package ontopic.week3.HW5.returningMemberHW;

class Chimpanzee extends Mammal {
    Chimpanzee() {
    }

    @Override
    void birth() {
        super.birth();
        System.out.println("chimpanzee is giving birth on jungle floor");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("chimpanzee is eating foraged fruit");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("chimpanzee is sleeping on forest floor");
    }
}
