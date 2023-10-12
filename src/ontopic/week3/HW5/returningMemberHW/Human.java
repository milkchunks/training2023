package ontopic.week3.HW5.returningMemberHW;

import com.sun.security.jgss.GSSUtil;

class Human extends Mammal {
    Human() {
    }

    @Override
    void birth() {
        super.birth();
        System.out.println("human is giving birth in hospital");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("human is eating at restaurant");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("human is sleeping in bed");
    }
}
