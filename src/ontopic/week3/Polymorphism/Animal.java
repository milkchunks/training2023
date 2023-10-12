package ontopic.week3.Polymorphism;

public class Animal {
    int age;
    int hunger;
    //default constructor to set age and hunger to defaults
    public Animal() {
        this.age = 0;
        this.hunger = 100;
    }
    //overloaded constructor to let user set animal parameters
    public Animal(int age, int hunger) {
        this.age = age;
        this.hunger = hunger;
    }
    void die() {
        System.out.println("animal has died :(");
    }
}
