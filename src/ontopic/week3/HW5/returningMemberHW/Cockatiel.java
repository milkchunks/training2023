package ontopic.week3.HW5.returningMemberHW;

import com.sun.security.jgss.GSSUtil;

class Cockatiel extends Bird {
    Cockatiel() {
    }

    @Override
    void fly() {
        super.fly();
        System.out.println("cockatiel is flying");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("cockatiel is eating");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("cockatiel is sleeping");
    }
}
